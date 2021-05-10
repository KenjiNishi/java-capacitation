package br.com.proway.senior.school;

import java.util.ArrayList;

import br.com.proway.senior.school.interfaces.IGradesReport;

/**
 *  Gathers information from all {@link Assessment}s from a {@link Student}.
 *  
 *  Contains a list of {@link Assessment}s with reference to a Period.
 *  For each period a mean of all the grades will be calculated and saved on the
 *  GradesReport.
 *  
 *  @see Assessment
 *  @see Student
 *  
 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
 *
 */
public class GradesReport implements IGradesReport{
	private int id;
	private Double meanGrade;
	private Student student;
	private Integer period;
	private ArrayList<Assessment> listOfTests;
	
	public void setId(int value) {
		this.id = value;
	}
	public int getId() {
		return this.id;
	}
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
		this.listOfTests = new ArrayList<Assessment>();
	}
	public Double getMeanGrade() { 
		return this.meanGrade;
	}
	
	public void setMeanGrade(Double grade) {
		this.meanGrade = grade;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Integer getPeriod() {
		return this.period;
	}
	
	public void setPeriod(Integer period) {
		this.period = period;
	}
	
	public ArrayList<Assessment> getListOfTests() {
		return this.listOfTests;
	}
	public void setListOfTests(ArrayList<Assessment> list) {
		this.listOfTests = list;
		
	}
	
}
