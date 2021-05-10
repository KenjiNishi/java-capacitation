package br.com.proway.senior.school;

import br.com.proway.senior.school.utils.Validator;

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
public class Assessment {
	Integer id;
	Integer period;
	Double grade;
	Student student;
	Course course;
	Double weight;
	
	/**
	 * In this constructor there is no attribution of grade in the constructor
	 * because they are going to be included in a later moment.
	 * @param period Period in the format YYYYMM
	 * @param student Student that took this test
	 * @param course The course related to this test
	 * @param weight Weight of the evaluation for calculating the mean
	 */
	public Assessment(Integer period, Student student, Course course, Double weight) {
		this.setPeriod(period);
		this.setStudent(student);
		this.setCourse(course);
		this.setWeight(weight);
	}
	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getId() {
		return this.id;
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
	public void setWeight(Double value) {
		this.weight = value;
	}
	public Double getWeight() {
		return this.weight;
	}



}
