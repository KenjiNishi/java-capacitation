package br.com.proway.senior.school;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class GradesReportTest {

	static GradesReport gr;
	private static int defaultPeriod = 202105;
	
	@BeforeClass
	public static void setUpTests() throws Exception{
		Student student = new Student();
		Integer period = defaultPeriod;
		gr = new GradesReport(student, period);
	}
	
	@Test
	public void testGradesReport() {
		assertNotNull(gr);
	}
	
	@Test
	public void testGetStudent() {
		assertNotNull(gr.getStudent());
	}
	
	@Test
	public void testGetPeriod() {
		assertEquals(defaultPeriod,(int) gr.getPeriod());
	}
	
	@Test
	public void testGetMeanGrades() {
		gr.clearCourseTests();
		Course course = new Course();
		Avaliation test = new Avaliation(defaultPeriod, gr.getStudent(), course, 1.0);
		Avaliation test2 = new Avaliation(defaultPeriod, gr.getStudent(), course, 1.0);
		try {
			test.setGrade(10.00);
			test2.setGrade(5.00);
		}
		catch(Exception e) {
			fail(e.getMessage());
		}
		gr.addCourseTest(test);
		gr.addCourseTest(test2);
		
		assertEquals(7.50, gr.getMeanGrade(), 0.01);
	}

	@Test
	public void testAddCourseTest() throws Exception {
		Course course = new Course();
		Avaliation test = new Avaliation(defaultPeriod, gr.getStudent(), course, 1.0);
		test.setGrade(2.0);
		gr.addCourseTest(test);
		
		assertEquals(1, (int) gr.getListOfTests().size());
	}
	
	@Test
	public void testRemoveCourseTest() throws Exception {
		Course course = new Course();
		Avaliation test = new Avaliation(defaultPeriod, gr.getStudent(), course, 1.0);
		test.setGrade(2.0);
		gr.clearCourseTests();
		gr.addCourseTest(test);
		gr.removeCourseTest(0);
		
		assertEquals(0, gr.getListOfTests().size());
	}
	
	@Test
	public void testRemoveCourseTestByObject() throws Exception {
		Course course = new Course();
		Avaliation test = new Avaliation(defaultPeriod, gr.getStudent(), course, 1.0);
		test.setGrade(2.0);
		gr.clearCourseTests();
		gr.addCourseTest(test);
		gr.removeCourseTest(test);
		
		assertEquals(0, gr.getListOfTests().size());
	}
	
	@Test
	public void testClearListOfCourseTest() throws Exception {
		Course course = new Course();
		Avaliation test = new Avaliation(defaultPeriod, gr.getStudent(), course, 1.0);
		test.setGrade(2.0);
		gr.addCourseTest(test);
		gr.clearCourseTests();
		
		assertFalse(gr.getListOfTests().size()>0);
	}
}
