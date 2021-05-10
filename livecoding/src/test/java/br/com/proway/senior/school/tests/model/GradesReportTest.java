package br.com.proway.senior.school.tests.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.school.GradesReport;
import br.com.proway.senior.school.Student;

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
}
