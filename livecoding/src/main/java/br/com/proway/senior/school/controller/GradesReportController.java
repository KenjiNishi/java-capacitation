package br.com.proway.senior.school.controller;

import java.util.ArrayList;

import br.com.proway.senior.school.Assessment;
import br.com.proway.senior.school.AssessmentDAO;
import br.com.proway.senior.school.GradesReport;

public class GradesReportController {
	private GradesReport report;
	
	public GradesReportController(GradesReport report) {
		this.report = report;
	}

	/**
	 * Calculates the mean of the CourseTests grades.
	 * 
	 * If the Evaluation weights are all set to 0.0 the return will be a simple
	 * mean. Otherwise, it will be a pondered mean.
	 */
	private void calculateMeanOfTests() {
		if(!this.report.getListOfTests().isEmpty()){
			Double sum = 0.0;
			Double weight = 0.0;
			for(Assessment course : this.report.getListOfTests()) {
				sum+=course.getGrade() * course.getWeight();
				weight += course.getWeight();
			}
			weight = weight==0 ? this.report.getListOfTests().size() : weight;
			this.report.setMeanGrade(sum/weight);
		}
		else this.report.setMeanGrade(0.0);
	}
	
	/**
	 * Adds a new CourseTest to the List of Tests taken by the student.
	 * @param test
	 */
	public void addCourseTest(Assessment test) {
		AssessmentDAO assessDAO = new AssessmentDAO(this.report);
		assessDAO.add(test);
		this.calculateMeanOfTests();
	}
	
	/**
	 * Removes a CourseTest from the List of Tests taken by the student.
	 * 
	 * @param test : CourseTest
	 */
	public void removeCourseTest(Assessment test) {
		AssessmentDAO assessDAO = new AssessmentDAO(this.report);
		assessDAO.remove(test);
		this.calculateMeanOfTests();
	}
	
	/**
	 * Removes the CouseTest located at the desired index of the List of Tests.
	 * @param index : int
	 */
	public void removeCourseTest(int index) {
		AssessmentDAO assessDAO = new AssessmentDAO(this.report);
		assessDAO.remove(index);
		this.calculateMeanOfTests();
	}
	
	/**
	 *  Clears the ListOfTests by instantiating it anew.
	 */
	public void clearCourseTests() {
		AssessmentDAO assessDAO = new AssessmentDAO(this.report);
		assessDAO.removeAll();
		this.calculateMeanOfTests();
	}
}
