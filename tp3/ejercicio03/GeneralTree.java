package tp3.ejercicio03;

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
	
// devuelve la altura del árbol, es decir, la longitud del camino más largo desde el nodo raíz hasta una hoja.
	public int altura() {	 
		if (this.hasChildren()) {
	    	int maxAltura = 0;
	        for (GeneralTree<T> auxT : this.getChildren()) {
	        	int alturaHijo = auxT.altura();
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
	public int nivel(T dato) {
	    if (dato.equals(this.getData())) {
	        return 1;
	    } else {
	    	int nivelHijo;
	        if (this.hasChildren()) {	        	
	        	for (GeneralTree<T> hijo : this.getChildren()) {
	        		nivelHijo = hijo.nivel(dato);
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
	public int ancho(){
		int maxAncho = 0;
		int hijosActuales = this.getChildren().size();
		for (GeneralTree<T> hijo : this.getChildren()) {
			maxAncho = Math.max(maxAncho, hijo.ancho());
		}
		
		return Math.max(hijosActuales, maxAncho);
	}
}
