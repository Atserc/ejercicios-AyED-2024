package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T>{
	
	public T shift() {
		T aux = this.dequeue(); 
		this.enqueue(aux);;
		return aux;
	}
}
