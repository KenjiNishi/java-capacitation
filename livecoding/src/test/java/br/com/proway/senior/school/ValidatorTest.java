package br.com.proway.senior.school;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.proway.senior.utils.Validator;

public class ValidatorTest {

	@Test
	public void validAge() {
		assertTrue(Validator.validateAge(20));
	}
	
	@Test
	public void invalidNegativeAge() {
		assertFalse(Validator.validateAge(-20));
	}
	
	@Test
	public void invalidHighAge() {
		assertFalse(Validator.validateAge(131));
	}
	
	@Test
	public void validName() {
		assertTrue(Validator.validateOnlyChars("Kenny TTT"));
	}
	
	@Test
	public void invalidNameWithNumbers() {
		assertFalse(Validator.validateOnlyChars("Kenny4124"));
	}
	
	@Test
	public void invalidNameWithSpecChar() {
		assertFalse(Validator.validateOnlyChars("Kenny,/.<>!@#$%^&*()_+-=[]{};'"));
	}

	@Test
	public void validGrade() {
		assertTrue(Validator.validateGrade(8.75));
	}
	
	@Test
	public void invalidNegativeGrade() {
		assertFalse(Validator.validateGrade(-2.0));
	}
	
	@Test
	public void invalidHighGrade() {
		assertFalse(Validator.validateGrade(12.15));
	}
}
