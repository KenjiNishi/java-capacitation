package br.com.proway.senior.school.controller;

import br.com.proway.senior.school.Assessment;
import br.com.proway.senior.school.AssessmentDAO;
import br.com.proway.senior.school.persistence.ArrayListPersistenceAssessment;

public class AssessmentController {
	private AssessmentDAO assDAO;
	private Assessment test;
	private ArrayListPersistenceAssessment dbAssessment;
	
	
	public AssessmentController(Assessment test) {
		this.dbAssessment = new ArrayListPersistenceAssessment();
		this.assDAO = new AssessmentDAO(this.dbAssessment);
		this.test = test;
	}
	
	public AssessmentController(int index) {
		this.dbAssessment = new ArrayListPersistenceAssessment();
		this.assDAO = new AssessmentDAO(this.dbAssessment);
		this.test = this.assDAO.get(index);
	}
	
	public Assessment add() {
		if(this.test.getId() != null) {
			return this.assDAO.add(this.test);	
		}
		return this.test;
	}
	
	public void remove(){
		try{
			this.assDAO.remove(this.test.getId());
		}catch(Exception e) {
			System.out.println( e.getMessage());
		}
	}
	
	public Assessment get(Integer id) {
		return this.assDAO.get(id);
	}
}
