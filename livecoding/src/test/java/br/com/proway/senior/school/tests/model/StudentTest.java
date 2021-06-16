package br.com.proway.senior.school.tests.model;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.proway.senior.school.Student;

public class StudentTest {

	@Test
	public void testRegex() {
		// Has numbers
		assertTrue("sd213.".matches(".*[0-9!@#$%^&*()_+\\\\=\\\\[\\\\]{};':\\\"\\\\\\\\|,.<>\\\\/?]+.*"));
		assertTrue("s@##$%#$¨*.".matches(".*[0-9!@#$%^&*()_+\\\\=\\\\[\\\\]{};':\\\"\\\\\\\\|,.<>\\\\/?]+.*"));
	}
	
	// Setting the test to expect a Exception Throw.
	// No need for assertions
	@Test(expected = Exception.class)
	public void testSetNameWithNumber() throws Exception {
		Student student = new Student();
		student.setName("AlphaChick123!");
	}
	
	@Test
	public void testSetNameValid() throws Exception {
		Student student = new Student();
		student.setName("Kenny");
		assertNotNull(student.getName());
	}
	@Test(expected = Exception.class)
	public void testSetSurnameWithNumber() throws Exception {
		Student student = new Student();
		student.setSurname("Joseph16.@$$");
	}
	
	@Test
	public void testSetSurnameValid() throws Exception {
		Student student = new Student();
		student.setSurname("Testerson");
		assertNotNull(student.getSurname());
	}
	
	@Test(expected = Exception.class)
	public void testSetAgeNegative() throws Exception {
		Student student = new Student();
		student.setAge(-23);
	}
	
	@Test(expected = Exception.class)
	public void testSetAgeTooHigh() throws Exception {
		Student student = new Student();
		student.setAge(131);
	}
	
	@Test
	public void testSetAgeValid() throws Exception {
		Student student = new Student();
		student.setAge(42);
		assertNotNull(student.getAge());
	}
}
