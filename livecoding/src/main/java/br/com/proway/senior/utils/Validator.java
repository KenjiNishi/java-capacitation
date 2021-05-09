package br.com.proway.senior.utils;

/**
 * Tool class for Validating parameters.
 * @author senior
 *
 */
public class Validator {
	private static final Integer MIN_AGE = 0;
	private static final Integer MAX_AGE = 130;
	
	private static final Double MIN_GRADE = 0.0;
	private static final Double MAX_GRADE = 10.0;
	
	private Validator() {}
	
	/**
	 * Checks if the String 'value' has numbers and special characters in it.
	 * @param value : String
	 * @return true/false for valid value
	 */
	public static boolean validateOnlyChars(String value) {
		return !value.matches(
		".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\\\"\\\\\\|,.<>\\/?]+.*"
		);
	}
	
	/**
	 * Checks if the Integer 'value' is in range of the valid ages.
	 * @param value : Integer
	 * @return true/false for valid value
	 */
	static public boolean validateAge(int value) {
		if (value<MIN_AGE || value>MAX_AGE) {
			return false;
		}
		return true;
	}
	/**
	 * Checks if the Integer 'value' is in range of the valid grades.
	 * @param value : Integer
	 * @return true/false for valid value
	 */
	static public boolean validateGrade(Double value) {
		if (value<MIN_GRADE || value>MAX_GRADE) {
			return false;
		}
		return true;
	}

}
