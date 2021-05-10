package br.com.proway.senior.school;

import java.util.ArrayList;

/**
 *  Gathers information from all {@link Asessment}s from a {@link Student}.
 *  
 *  Contains a list of {@link Asessment}s with reference to a Period.
 *  For each period a mean of all the grades will be calculated and saved on the
 *  GradesReport.
 *  
 *  @see Asessment
 *  @see Student
 *  
 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
 *
 */
public class GradesReport {
	private Double meanGrade;
	private Student student;
	private Integer period;
	public ArrayList<Asessment> listOfTests;
	
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
		this.listOfTests = new ArrayList<Asessment>();
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
	public void setMeanGrade(Double grade) {
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
	public ArrayList<Asessment> getListOfTests() {
		return this.listOfTests;
	}
	
}
