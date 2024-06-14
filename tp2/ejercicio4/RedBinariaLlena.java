package tp2.ejercicio4;

import tp2.ejercicio2.BinaryTree;

public class RedBinariaLlena {
	private BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	public int retardoReenvio() {
		if (arbol.isLeaf()) {
			return arbol.getData();
		}
		int aux = 0;
		if (arbol.hasLeftChild()) {
			aux += arbol.getLeftChild().contarHojas();
		}
		if (arbol.hasRightChild()) {
			aux += arbol.getRightChild().contarHojas();
		}
		return aux;
	}
}
