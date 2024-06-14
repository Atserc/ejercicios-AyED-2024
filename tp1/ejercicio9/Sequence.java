package tp1.ejercicio9;

public class Sequence {
	private int size;
	private boolean isEmpty;
	
	public Sequence(int s, boolean e) {
		this.setSize(s);
		this.setEmpty(e);
	}
	
	protected int size() {
		return size;
	}
	protected void setSize(int size) {
		this.size = size;
	}
	protected boolean isEmpty() {
		return isEmpty;
	}
	protected void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	
}
