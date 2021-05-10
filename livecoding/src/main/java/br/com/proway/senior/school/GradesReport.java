package br.com.proway.senior.school;

import java.util.ArrayList;

/**
 *  Gathers information from all {@link CourseTest}s from a {@link Student}.
 *  
 *  Contains a list of {@link CourseTest}s with reference to a Period.
 *  For each period a mean of all the grades will be calculated and saved on the
 *  GradesReport.
 *  
 *  @see CourseTest
 *  @see Student
 *  
 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
 *
 */
public class GradesReport {
	private Double meanGrade;
	private Student student;
	private Integer period;
	private ArrayList<CourseTest> listOfTests;
	
	/** Returns a new GradesReport
	 * 
	 * The report is created from a student and a period. The mean is calculated
	 * on Gets.
	 * 
	 * @param student
	 * @param period
	 */
	public GradesReport(Student student, Integer period) {
		super();
		this.setStudent(student);
		this.setPeriod(period);
		this.listOfTests = new ArrayList<CourseTest>();
	}
	

	/**
	 * Calculates the mean of the CourseTests grades.
	 */
	private void calculateMeanOfTests() {
		Double sum = 0.0;
		for(CourseTest course : this.getListOfTests()) {
			sum+=course.getGrade();
		}
		setMeanGrade(sum/this.getListOfTests().size());
	}
	
	/**
	 * Returns the mean value of all the CourseTests grades.
	 * @return meanGrade : Double
	 */
	public Double getMeanGrade() { 
		return this.meanGrade;
	}
	
	/**
	 * Sets the mean value of all the CourseTests grades.
	 * @param grade : Double
	 */
	private void setMeanGrade(Double grade) {
		this.meanGrade = grade;
	}
	
	/**
	 * Returns the Student responsible for the tests shown in the Report.
	 * @return
	 */
	public Student getStudent() {
		return this.student;
	}
	
	/**
	 * Sets the student responsible for the tests shown in the Report.
	 * @param student
	 */
	private void setStudent(Student student) {
		this.student = student;
	}
	
	/**
	 * Gets the period from the Report Grades.
	 * @return
	 */
	public Integer getPeriod() {
		return this.period;
	}
	
	/**
	 * Sets the period respective to the Report Grade.
	 * @param period
	 */
	private void setPeriod(Integer period) {
		this.period = period;
	}

	/**
	 * Retuns the List containing all the tests related to the Report.
	 * @return
	 */
	public ArrayList<CourseTest> getListOfTests() {
		return this.listOfTests;
	}
	
	/**
	 * Adds a new CourseTest to the List of Tests taken by the student.
	 * @param test
	 */
	public void addCourseTest(CourseTest test) {
		this.listOfTests.add(test);
		this.calculateMeanOfTests();
	}
	
	/**
	 * Removes a CourseTest from the List of Tests taken by the student.
	 * 
	 * @param test : CourseTest
	 */
	public void removeCourseTest(CourseTest test) {
		this.listOfTests.remove(test);
		this.calculateMeanOfTests();
	}
	
	/**
	 * Removes the CouseTest located at the desired index of the List of Tests.
	 * @param index : int
	 */
	public void removeCourseTest(int index) {
		this.listOfTests.remove(index);
		this.calculateMeanOfTests();
	}
	
	/**
	 *  Clears the ListOfTests by instantiating it anew.
	 */
	public void clearCourseTests() {
		this.listOfTests = new ArrayList<CourseTest>();
	}

	
}
