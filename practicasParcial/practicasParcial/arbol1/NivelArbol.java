package practicasParcial.arbol1;

import treesAndGraphs.*;
import treesAndGraphs.Queue;


public class NivelArbol {
	BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	private BinaryTree<Integer> buscarSubArbol(BinaryTree<Integer> a, int n) {
		BinaryTree<Integer> auxT = new BinaryTree<Integer>();
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		int nivel = 1;
		cola.enqueue(a);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			auxT = cola.dequeue();
			if (auxT != null) {
				if (nivel == n) {
					return auxT;
				}
				if (nivel > n) {
					return null;
				}
				if (auxT.hasLeftChild()) {
					cola.enqueue(auxT.getLeftChild());
				}
				if (auxT.hasRightChild()) {
					cola.enqueue(auxT.getRightChild());
				}
			} else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
					nivel++;
				}
			}
		}
		return null;		
	}
	
	private BinaryTree<Integer> revisar(BinaryTree<Integer> a) {
		boolean RightExist = a.hasRightChild();
		boolean LeftExist = a.hasLeftChild();
		boolean RightIsLeaf = false;
		boolean LeftIsLeaf = false;
		if (RightExist) {
			if (a.getRightChild().isLeaf()) {				
				RightIsLeaf = true;
			}
		}
		if (LeftExist) {
			if (a.getLeftChild().isLeaf()) {				
				LeftIsLeaf = true;
			}
		}
		
		if (RightIsLeaf && LeftIsLeaf) {
			if (a.getLeftChild().getData() < a.getRightChild().getData()) {
				return a.getLeftChild();
			} else {
				return a.getRightChild();
			}
		} else {
			if (RightIsLeaf) {
				return a.getRightChild();
			} else if (LeftIsLeaf) {
				return a.getLeftChild();
			} else {
				return null;
			}
		}
	}

	public BinaryTree<Integer> minEnNivelAB(int n) {
		BinaryTree<Integer> auxT = new BinaryTree<Integer>();
	
		auxT = buscarSubArbol(arbol, n);
		
		auxT = revisar(auxT);
		
		return auxT;
	}
}
