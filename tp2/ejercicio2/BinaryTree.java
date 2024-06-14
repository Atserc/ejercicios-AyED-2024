package tp2.ejercicio2;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 
	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());
	}

	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
		if (this.isLeaf()) {
			return 1;
		}
		int aux = 0;
		if (this.hasLeftChild()) {
			aux += this.getLeftChild().contarHojas();
		}
		if (this.hasRightChild()) {
			aux += this.getRightChild().contarHojas();
		}
		return aux;
	}
 
    public BinaryTree<T> espejo(){
    	BinaryTree<T> nuevoArbol = new BinaryTree<T>();
    	nuevoArbol.data = this.getData();
    	
    	if (this.hasLeftChild() ) {
    		nuevoArbol.addRightChild(this.getLeftChild().espejo());
    	}
    	if (this.hasRightChild()) {
    		nuevoArbol.addLeftChild(this.getRightChild().espejo());
		}
    	
    	return nuevoArbol;
    }

	// 0<=n<=m<=alturaArbol
	public void entreNiveles(int n, int m){
		BinaryTree<T> ab = new BinaryTree<T>(); 
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		int nivel = 1;
		cola.enqueue(this);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			
			ab = cola.dequeue();
			if (ab != null) {
				if ((nivel >= n) && (nivel <= m)) {					
					System.out.println(ab.getData());
				}
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			} else if (!cola.isEmpty()) {
				System.out.println();
				cola.enqueue(null);
				nivel++;
			}
		}
	}
}
