package br.com.proway.senior.school;

import br.com.proway.senior.school.interfaces.IDAO;
import br.com.proway.senior.school.persistence.ArrayListPersistenceAssessment;

public class AssessmentDAO implements IDAO<Assessment>{
	ArrayListPersistenceAssessment db;
	
	public AssessmentDAO(ArrayListPersistenceAssessment db) {
		this.db = db;
	}

	public void removeAll() {
		this.db.removeAll();
	}

	public void remove(int index) {
		this.db.remove(index);
	}

	public Assessment add(Assessment entry) {
		return this.db.add(entry);
		
	}

	public Assessment get(int id) {
		return this.db.get(id);
	}
	
	
}
