package tp1.ejercicio8;

import java.util.*;

public class Queue<T> extends Sequence{
	protected List<T> data;
	
	public Queue(){
		this.data = new LinkedList<T>();
	}
	
	public void enqueue(T dato) {
		data.add(dato);
	}
	
	public T dequeue() {
		return data.remove(data.size());
		
	}
	
	public T head() {
		return data.get(data.size());
	}
	
	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean isEmpty() {
		return data.size()==0;
	}
	
	@Override
	public String toString() {
		String aux = "[";
		for ( T d : data) {
			aux += d + ", ";
		}
		aux = aux.substring(0, aux.length()-2)+"]";
		return aux;
	}
}
