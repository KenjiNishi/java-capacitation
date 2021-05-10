package br.com.proway.senior.school.persistence;

import java.util.ArrayList;

import br.com.proway.senior.school.GradesReport;

public class ArrayListPersistenceGradeReport extends ArrayListPersistence<GradesReport>{
	ArrayList<GradesReport> data;
	
	@Override
	public boolean removeAll() {
		try{
			this.data.clear();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public boolean remove(Integer indexItem) {
		try{
			this.data.remove((int) indexItem);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public GradesReport add(GradesReport item) {
		try{
			Integer id = this.data.size();
			item.setId(id);
			this.data.add(item);
			return item;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public GradesReport get(Integer index) {
		try{
			return this.data.get(index);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public ArrayList<GradesReport> getAll() {
		try{
			return this.data;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
