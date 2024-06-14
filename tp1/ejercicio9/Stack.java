package tp1.ejercicio9;

import java.util.*;

public class Stack<T> extends Sequence{
	private List<T> data;
	
	public Stack() {
		super(0,true);
		data = new ArrayList<T>();
	}
	
	public void push(T dato) {
		data.add(0,dato);
	}

	public T pop() {
		return data.remove(0);
	}

	public T top() {
		return data.get(0);
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean isEmpty() {
		return this.size()==0;
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
