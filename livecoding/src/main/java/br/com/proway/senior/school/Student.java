package br.com.proway.senior.school;

import br.com.proway.senior.utils.Validator;

/**
 * <h1>Person that studies at the school.</h1>
 * 
 * The student frequents Classes {@link Class} has Grades {@link Grades} and 
 * Grades Report {@link GradesReport}.
 * 
 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
 * @see Class
 * @see Grades
 * @see GradesReport
 */
public class Student {
	/**
	 *  Students name.
	 */
	String name;
	
	/**
	 * Students last name.
	 */
	String surname;
	
	/**
	 * Students age.
	 */
	private Integer age;

	/**
	 * Students name. Use alphabetic characters.
	 * @return name : String
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets Students name. Use alphabetic characters.
	 * @throws Exception - Name cannot contain numbers
	 */
	public void setName(String name) throws Exception {
		// if numbers appear in name at least once...
		if(!Validator.validateOnlyChars(name)){
			throw(new Exception("Name cannot contain numbers!"));
		}
		else {
			this.name = name;
		}
	}

	/**
	 * Students last name. Use alphabetic characters.
	 * @return surname : String
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Students surname. Use alphabetic characters.
	 * @throws Exception - Surname cannot contain numbers 
	 */
	public void setSurname(String surname) throws Exception {
		if(!Validator.validateOnlyChars(surname)) {
			throw(new Exception("Surname cannot contain numbers!"));
		}
		else {
			this.surname = surname;
		}
	}

	/**
	 * Gets the students age in years.
	 * @return age : Integer
	 */
	public Integer getAge() {
		return this.age;
	}

	/**
	 * Sets the Students age.
	 * @param age
	 * @throws Exception 
	 */
	public void setAge(Integer age) throws Exception {
		if(!Validator.validateAge(age)) {
			throw(new Exception(
				"Age is invalid, it must be between 0 and 130"
			));
		}
		this.age = age;
	}
}
