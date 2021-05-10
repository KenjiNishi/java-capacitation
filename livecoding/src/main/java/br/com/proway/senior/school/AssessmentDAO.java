package br.com.proway.senior.school;

import java.util.ArrayList;

import br.com.proway.senior.school.interfaces.IDAO;

public class AssessmentDAO implements IDAO<Assessment>{
	GradesReport report;
	
	public AssessmentDAO(GradesReport report){
		this.report = report;
	}
	
	public void removeAll() {
		this.report.setListOfTests(new ArrayList<Assessment>());
	}

	public void remove(int index) {
		this.report.getListOfTests().remove(index);
	}
	
	public void remove(Assessment test) {
		this.report.getListOfTests().remove(test);
	}

	public void add(Assessment test) {
		this.report.getListOfTests().add(test);
	}
}
