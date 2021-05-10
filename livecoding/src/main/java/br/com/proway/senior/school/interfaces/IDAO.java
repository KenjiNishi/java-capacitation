package br.com.proway.senior.school.interfaces;

public interface IDAO<T> {
	public void removeAll();

	public void remove(int index);
	
	public void remove(T entry);

	public void add(T entry);
}
