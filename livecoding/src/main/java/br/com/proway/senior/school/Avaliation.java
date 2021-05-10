package br.com.proway.senior.school;

import br.com.proway.senior.utils.Validator;

/**
 * A Test that validates if the {@link Student} has the minimum knowledge in a 
 * specific subject. The student can deliver several Tests of the same 
 * subject. The average grade of all tests in the {@link GradesReport} will 
 * determine if the student has succeeded.
 * 
 * @see Student
 * @see GradesReport
 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
 *
 */
public class Avaliation {
	Integer period;
	Double grade;
	Student student;
	Course course;
	
	/**
	 * In this constructor there is no attribution of grade in the constructor
	 * because they are going to be included in a later moment.
	 * @param period Period in the format YYYYMM
	 * @param student Student that took this test
	 * @param course The course related to this test
	 */
	public Avaliation(Integer period, Student student, Course course) {
		this.setPeriod(period);
		this.setStudent(student);
		this.setCourse(course);
	}
	
	public Integer getPeriod() {
		return this.period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	/**
	 * Gets the tests grade
	 * @return grade : Double
	 */
	public Double getGrade() {
		return this.grade;
	}
	/**
	 * Sets the test grade
	 * @param grade : Double
	 * @throws Exception 
	 */
	public void setGrade(Double grade) throws Exception {
		if (!Validator.validateGrade(grade)) {
			throw(new Exception("Invalid value for grade!"));
		}
		this.grade = grade;
	}
	public Student getStudent() {
		return this.student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return this.course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
