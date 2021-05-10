package br.com.proway.senior.school.controller;

import java.util.ArrayList;

import br.com.proway.senior.school.Assessment;
import br.com.proway.senior.school.GradesReport;
import br.com.proway.senior.school.GradesReportDAO;
import br.com.proway.senior.school.persistence.ArrayListPersistenceGradeReport;

public class GradesReportController {
	private GradesReport report;
	private GradesReportDAO reportDAO;
	private ArrayListPersistenceGradeReport dbReport;
	
	public GradesReportController(GradesReport report) {
		this.report = report;
		this.dbReport = new ArrayListPersistenceGradeReport();
		this.reportDAO = new GradesReportDAO(this.dbReport);
	}

	public GradesReport getReport() {
		return this.report;
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
	
	public GradesReport addGradesReport() {
		if(this.report.getId()==null) {
			return this.reportDAO.add(this.report);
		}
		return this.report;
	}
	
	/**
	 * Adds a new CourseTest to the List of Tests taken by the student.
	 * @param test
	 */
	public void addAssessment(Assessment test) {
		AssessmentController assController = new AssessmentController(test);
		if(test.getId() != null) {
			assController.add();
		}
		else {
			assController.get(test.getId());
		}
		this.report.getListOfTests().add(test);
		this.calculateMeanOfTests();
	}
	
	/**
	 * Removes the CouseTest located at the desired index of the List of Tests.
	 * @param index : int
	 */
	public void removeCourseTest(int index) {
		AssessmentController assController = new AssessmentController(index);
		assController.remove();
		try {
			this.report.getListOfTests().remove(index);
			this.calculateMeanOfTests();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 *  Clears the ListOfTests by instantiating it anew.
	 */
	public void clearCourseTests() {
		ArrayList<Assessment> tests = this.report.getListOfTests();
		
		for(Assessment test : tests) {
			AssessmentController assessController = new AssessmentController(test);
			assessController.remove();	
		}
		this.report.getListOfTests().clear();
		this.calculateMeanOfTests();
	}
}
