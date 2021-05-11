package br.com.proway.senior.school.tests.controller;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.school.Assessment;
import br.com.proway.senior.school.Course;
import br.com.proway.senior.school.GradesReport;
import br.com.proway.senior.school.Student;
import br.com.proway.senior.school.controller.GradesReportController;
import br.com.proway.senior.school.interfaces.IGradesReport;

public class GradesReportControllerTest {
	static GradesReportController controller;
	static GradesReport gr;
	
	static Assessment test;
	static Assessment test2;
	
	private static int defaultPeriod = 202105;
	
	@BeforeClass
	public static void setUpTests() throws Exception{
		Student student = new Student();
		Integer period = defaultPeriod;
		gr = new GradesReport(student, period);
		
		Course course = new Course();
		test = new Assessment(gr.getPeriod(), gr.getStudent(), course, 1.0);
		test2 = new Assessment(gr.getPeriod(), gr.getStudent(), course, 1.0);
		try {
			test.setGrade(10.00);
			test2.setGrade(5.00);
		}
		catch(Exception e) {
			fail(e.getMessage());
		}
		controller = new GradesReportController(gr);
	}
	
	@Test
	public void testGetMeanGrades() {
		controller.clearCourseTests();
		controller.addAssessment(test);
		controller.addAssessment(test2);
		assertEquals(7.50, gr.getMeanGrade(), 0.01);
	}

	@Test
	public void testAddCourseTest() throws Exception {
		controller.clearCourseTests();
		controller.addAssessment(test);
		assertEquals(1, (int) gr.getListOfTests().size());
	}
	
	@Test
	public void testRemoveCourseTest() throws Exception {
		controller.clearCourseTests();
		controller.addAssessment(test);
		controller.removeCourseTest(0);
		assertEquals(0, gr.getListOfTests().size());
	}
	
	@Test
	public void testRemoveNonExistentCourseTest() throws Exception {
		controller.clearCourseTests();
		controller.addAssessment(test);
		controller.removeCourseTest(42);
		assertEquals(1, gr.getListOfTests().size());
	}
	
	@Test
	public void testClearListOfCourseTest() throws Exception {
		controller.addAssessment(test);
		controller.clearCourseTests();
		assertEquals(0, gr.getListOfTests().size());
	}

}
