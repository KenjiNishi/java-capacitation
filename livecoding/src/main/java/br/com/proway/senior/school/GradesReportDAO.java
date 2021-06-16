package br.com.proway.senior.school;

import br.com.proway.senior.school.interfaces.IDAO;
import br.com.proway.senior.school.persistence.ArrayListPersistenceGradeReport;

public class GradesReportDAO implements IDAO<GradesReport>{
	ArrayListPersistenceGradeReport db;
	
	public GradesReportDAO(ArrayListPersistenceGradeReport db) {
		this.db = db;
	}

	public void removeAll() {
		this.db.removeAll();
	}

	public void remove(int index) {
		this.db.remove(index);
	}

	public GradesReport add(GradesReport entry) {
		return this.db.add(entry);
		
	}

	public GradesReport get(int id) {
		return this.db.get(id);
	}
	
	
}
