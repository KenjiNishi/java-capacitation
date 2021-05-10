package br.com.proway.senior.school.persistence;

import java.util.ArrayList;

import br.com.proway.senior.school.Assessment;

public class ArrayListPersistenceAssessment extends ArrayListPersistence<Assessment> {

	public ArrayList<Assessment> data;
	
	@Override
	boolean removeAll() {
		try{
			this.data.clear();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	boolean remove(Integer indexItem) {
		try{
			this.data.remove((int) indexItem);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	Assessment add(Assessment item) {
		try{
			Integer id = data.size();
			item.setId(id);
			this.data.add(item);
			return item;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	Assessment get(Integer index) {
		try{
			return this.data.get(index);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	ArrayList<Assessment> getAll() {
		try{
			return this.data;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
