package tp2.ejercicio8;

import tp2.ejercicio2.BinaryTree;

public class ArbolParcialDos {
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		
		int num1 = arbol1.getData();
		int num2 = arbol2.getData();
		
		if (num1 == num2) {
			if (arbol1.isLeaf()) {
				return true;
			} else {				
				boolean izqCumple = true;
				boolean derCumple = true;
				if (arbol1.hasLeftChild()) {
					if (arbol2.hasLeftChild()) {						
						izqCumple = esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild());
					} else {
						izqCumple = false;
					}
				}
				if (arbol1.hasRightChild()) {
					if (arbol2.hasRightChild()) {						
						derCumple = esPrefijo(arbol1.getRightChild(),arbol2.getRightChild());
					} else {
						derCumple = false;
					}
				}
				return izqCumple && derCumple;
			}
		} else {			
			return false;
		}

	}
}