package br.com.proway.senior.school.interfaces;

public interface IDAO<T> {
	public void removeAll();

	public void remove(int index);

	public T add(T entry);
	
	public T get(int id);
}
