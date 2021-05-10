package br.com.proway.senior.school.interfaces;

import java.util.ArrayList;

import br.com.proway.senior.school.Assessment;
import br.com.proway.senior.school.Student;

public interface IGradesReport {
	/**
	 * Returns the mean value of all the CourseTests grades.
	 * @return meanGrade : Double
	 */
	public Double getMeanGrade();
	/**
	 * Sets the mean value of all the CourseTests grades.
	 * @param grade : Double
	 */
	public void setMeanGrade(Double grade);
	
	/**
	 * Returns the Student responsible for the tests shown in the Report.
	 * @return
	 */
	public Student getStudent();
	/**
	 * Sets the student responsible for the tests shown in the Report.
	 * @param student
	 */
	public void setStudent(Student student);
	
	/**
	 * Gets the period from the Report Grades.
	 * @return
	 */
	public Integer getPeriod();
	/**
	 * Sets the period respective to the Report Grade.
	 * @param period
	 */
	public void setPeriod(Integer period);

	/**
	 * Retuns the List containing all the tests related to the Report.
	 * @return
	 */
	public ArrayList<Assessment> getListOfTests();
	/**
	 * Sets the List containing all the tests related to the Report.
	 */
	public void setListOfTests(ArrayList<Assessment> list);
}
