package treesAndGraphs;

import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {}
	public GeneralTree(T data) {
		this.data = data;
	}
	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null) {			
			this.children = children;
		}
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public void preOrder() {
		System.out.println(this.getData());
		List<GeneralTree<T>> children = this.getChildren();
		for (GeneralTree<T> child: children) {
			 child.preOrder();
			 }
	}
	
	public void postOrder() {
		List<GeneralTree<T>> children = this.getChildren();
		for (GeneralTree<T> child: children) {
			 child.postOrder();
			 }
		System.out.println(this.getData());
	}
	
	
	public void alturaPostOrder(List<Integer> niveles, int nivel) {
		if (this.isLeaf()) {
			niveles.add(nivel);
		}
		List<GeneralTree<T>> children = this.getChildren();
		for (GeneralTree<T> child: children) {
			 child.alturaPostOrder(niveles, nivel+1);
		}
	}
	
	public int alturaPorNivel(GeneralTree<T> tree) {	 
		int aux = 0;
		GeneralTree<T> auxTree = new GeneralTree<T>();
		Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
		queue.enqueue(tree);
		queue.enqueue(null);
		while(!queue.isEmpty()) {
			auxTree = queue.dequeue();
			if(auxTree != null) {
				List<GeneralTree<T>> children = auxTree.getChildren();
				for (GeneralTree<T> child: children) {
					queue.enqueue(child); 
				}
			} else {
				if (!queue.isEmpty()) {
					aux = aux + 1;
					queue.enqueue(null);
				}
			}
		}
		return aux;
	}
	
	public int altura() {	 
		int aux = 0;
		aux = alturaPorNivel(this);
		return aux;
	}

// devuelve la altura del árbol, es decir, la longitud del camino más largo desde el nodo raíz hasta una hoja.
	public int alturaViejo() {	 
		if (this.hasChildren()) {
	    	int maxAltura = 0;
	        for (GeneralTree<T> auxT : this.getChildren()) {
	        	int alturaHijo = auxT.alturaViejo();
	            if (alturaHijo > maxAltura) {
	            	maxAltura = alturaHijo;
	            }
	        }
	        return maxAltura + 1;
	    }
	    else {			
	    	return 1;
	    }
	}

// devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo es la longitud del único camino de la raíz al nodo.
	public int nivelViejo(T dato) {
	    if (dato.equals(this.getData())) {
	        return 1;
	    } else {
	    	int nivelHijo;
	        if (this.hasChildren()) {	        	
	        	for (GeneralTree<T> hijo : this.getChildren()) {
	        		nivelHijo = hijo.nivelViejo(dato);
	        		if (nivelHijo > 0) {
	        			return nivelHijo + 1;
	        		}
	        	}
	        }
	        return 0;
	    }
	}

/* la amplitud (ancho) de un árbol se define como la cantidad de nodos que se encuentran en el nivel que posee la mayor
   cantidad de nodos. */
	public int anchoViejo(){
		int maxAncho = 0;
		int hijosActuales = this.getChildren().size();
		for (GeneralTree<T> hijo : this.getChildren()) {
			maxAncho = Math.max(maxAncho, hijo.anchoViejo());
		}
		
		return Math.max(hijosActuales, maxAncho);
	}

	private GeneralTree<T> porNivelesAncestro(GeneralTree<T> a, T dato) {
		GeneralTree<T> aux = new GeneralTree<T>();
		aux = null;
		if (a != null) {
			Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
			queue.enqueue(a);
			queue.enqueue(null);
			while (!queue.isEmpty()) {
				aux = queue.dequeue();
				if (aux != null) {
					if (aux.getData() == dato) {
						return aux;
					}
					List<GeneralTree<T>> children = aux.getChildren();
					for (GeneralTree<T> child : children) {
						queue.enqueue(child);
					}
				} else {
					if (!queue.isEmpty()) {
						queue.enqueue(null);
					}
				}
			}
		}
		return aux;
	}
	
	public boolean esAncestro(T a , T b) {
		boolean res = true;
		GeneralTree<T> arbol;
		arbol = this.porNivelesAncestro(this, a);
		arbol = this.porNivelesAncestro(arbol, b);
		if(arbol == null) {
			res = false;
		}
		return res;
	}

	private boolean esAncestroPrivadoViejo(GeneralTree<T> arbol, T b) {
		if (this.isLeaf()) {
			return false;
		} else {
			if (arbol.getData().equals(b)) {
				return true;
			} else {
				for (GeneralTree<T> hijo : arbol.getChildren()) {
					if (hijo.esAncestroPrivadoViejo(hijo, b)) {
						return true;
					}
				}
			}
			return false;
		}
	}

	public boolean esAncestroViejo(T a, T b) {
		if (this.getData().equals(a)) {
			return esAncestroPrivadoViejo(this,b);
		} else {
			for (GeneralTree<T> hijo : this.getChildren()) {
				if (hijo.esAncestroViejo(a, b)) {
					return true;
				}
			}
			return false;
		}
	}
}
