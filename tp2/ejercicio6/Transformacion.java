package tp2.ejercicio6;

import tp2.ejercicio2.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol = new BinaryTree<Integer>();

	private Integer sumarHijos(BinaryTree<Integer> a) {		
		Integer aux = 0;
		if (!a.isLeaf()) {			
			if (a.hasLeftChild()) {
				aux += a.getLeftChild().getData();
				aux += sumarHijos(a.getLeftChild());
			}
			if (a.hasRightChild()) {
				aux += a.getRightChild().getData();
				aux += sumarHijos(a.getRightChild());
			}
		}
		
		return aux;
	}

	public BinaryTree<Integer> suma(BinaryTree<Integer> a) {
		arbol= a;
		Integer aux;
		
		aux = sumarHijos(arbol);
		arbol.setData(aux);
		
		if (a.hasLeftChild()) {
			arbol.addLeftChild(suma(a));
		}
		
		if (a.hasRightChild()) {
			arbol.addRightChild(suma(a));
		}
		
		return arbol;
	}
	
}
