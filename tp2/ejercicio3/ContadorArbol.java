package tp2.ejercicio3;

import java.util.*;
import tp2.ejercicio2.BinaryTree;

public class ContadorArbol {
	
	public List<BinaryTree<Integer>> numerosParesInOrden(BinaryTree<Integer> arbol) {
		List<BinaryTree<Integer>> lista = new ArrayList<BinaryTree<Integer>>();
		inOrden(lista,arbol);
		return lista;
	}
	
	public void inOrden(List<BinaryTree<Integer>> lista, BinaryTree<Integer> a) {
		inOrden(lista,a.getLeftChild());
		
		if ((a.getData() % 2) == 0) {
			lista.add(a);
		}
		
		inOrden(lista,a.getRightChild());
	}
	
	public List<BinaryTree<Integer>> numerosParesPosOrden(BinaryTree<Integer> arbol) {
		List<BinaryTree<Integer>> lista = new ArrayList<BinaryTree<Integer>>();
		posOrden(lista,arbol);
		return lista;
	}
	
	public void posOrden(List<BinaryTree<Integer>> lista, BinaryTree<Integer> a) {
		posOrden(lista,a.getLeftChild());
		posOrden(lista,a.getRightChild());
		
		if ((a.getData() % 2) == 0) {
			lista.add(a);
		}
	}
}
