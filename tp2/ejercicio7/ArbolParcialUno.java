package tp2.ejercicio7;

import tp2.ejercicio2.BinaryTree;

public class ArbolParcialUno {
	public static BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	public int calculoFinal(BinaryTree<Integer> a) {
		int valor = 0;
		if((a.hasLeftChild())||(a.hasRightChild())) {
			valor = valor+1;
		}
		if(a.hasLeftChild()) {
			valor = valor+calculoFinal(a.getLeftChild());
		}
		if(a.hasRightChild()) {
			valor = valor+calculoFinal(a.getRightChild());
		}
		return valor;
	}
	
	public int calculo(BinaryTree<Integer> a) {
		if((a.isEmpty())||(a.isLeaf())) {
			return 0;
		}else {
			int izq = 0;
			int der = 0;
			if(a.hasLeftChild()) {
				izq = calculoFinal(a.getLeftChild());
			}else {
				izq = -1;
			}
			if(a.hasRightChild()) {
				der = calculoFinal(a.getRightChild());
			}else {
				der = -1;
			}		
			if(izq > der) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	public int recorrido (BinaryTree<Integer> a, int num) {
		int r = 0;
		if(a.getData() == num) {
			r = calculo(a);
			return r;
		}else {
			if(a.hasLeftChild()) {
				r = r+recorrido(a.getLeftChild(),num);
			}
			if(a.hasRightChild()) {
				r = r+recorrido(a.getRightChild(),num);
			}
			return r;
		}
	}
	
	public boolean isLeftTree (int num) {
		int retorno = recorrido(arbol,num);
		if(retorno < 1) {
			return false;
		}	else {
			return true;
		}
	}
}
