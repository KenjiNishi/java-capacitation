package br.com.proway.senior.school;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class CourseTestTest {
	static Avaliation test;
	static int periodParam = 202105;

	@BeforeClass
	public static void instanceCourseTest(){
		Integer period = periodParam;
		Course course = new Course();
		Student student = new Student();
		
		test = new Avaliation(period, student, course, 1.0);
	}
	
	@Test
	public void testCourseTest() {
		assertNotNull(test);
	}
	
	@Test
	public void testSetValidGetGrade() throws Exception {
		test.setGrade(5.75);
		assertEquals(5.75, (double) test.getGrade(), 0.1);
	}
	
	@Test(expected = Exception.class)
	public void testSetInvalidSetNegativeGrade() throws Exception {
		test.setGrade(-2.25);
	}
	
	@Test(expected = Exception.class)
	public void testSetInvalidSetHighGrade() throws Exception {
		test.setGrade(14.20);
	}
	
	@Test
	public void testPeriodParam() throws Exception {
		assertEquals(periodParam, (int) test.getPeriod());
	}
	
	@Test
	public void testGetStudent() {
		assertNotNull(test.getStudent());
	}
	
	@Test
	public void testGetCourse() {
		assertNotNull(test.getCourse());
	}
}
