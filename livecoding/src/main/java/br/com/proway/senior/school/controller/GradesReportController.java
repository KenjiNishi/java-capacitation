package br.com.proway.senior.school.controller;

import java.util.ArrayList;

import br.com.proway.senior.school.Asessment;
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
			for(Asessment course : this.report.getListOfTests()) {
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
	public void addCourseTest(Asessment test) {
		this.report.listOfTests.add(test);
		this.calculateMeanOfTests();
	}
	
	/**
	 * Removes a CourseTest from the List of Tests taken by the student.
	 * 
	 * @param test : CourseTest
	 */
	public void removeCourseTest(Asessment test) {
		this.report.listOfTests.remove(test);
		this.calculateMeanOfTests();
	}
	
	/**
	 * Removes the CouseTest located at the desired index of the List of Tests.
	 * @param index : int
	 */
	public void removeCourseTest(int index) {
		this.report.listOfTests.remove(index);
		this.calculateMeanOfTests();
	}
	
	/**
	 *  Clears the ListOfTests by instantiating it anew.
	 */
	public void clearCourseTests() {
		this.report.listOfTests = new ArrayList<Asessment>();
		this.calculateMeanOfTests();
	}
}
