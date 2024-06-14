package practicasParcial.arbol1;

import treesAndGraphs.*;
import treesAndGraphs.Queue;


public class NivelArbol {
	BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	private BinaryTree<Integer> buscarSubArbol(BinaryTree<Integer> a, int n) {
		BinaryTree<Integer> auxT = new BinaryTree<Integer>();
		BinaryTree<Integer> minLeaf = null;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		int nivel = 1;
		
		cola.enqueue(a);
		cola.enqueue(null);
		while (!cola.isEmpty() && (nivel != n)) {
			auxT = cola.dequeue();
			if (auxT != null) {
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
		if (nivel == n) {
			while (!cola.isEmpty()) {
				auxT = cola.dequeue();
				if (auxT.isLeaf()) {
					if (minLeaf == null) {
						minLeaf = auxT;
					} else {
						if (auxT.getData() < minLeaf.getData()) {
							minLeaf = auxT;
						}
					}
				}
			}
		}
		return minLeaf;
	}

	public BinaryTree<Integer> minEnNivelAB(int n) {
		BinaryTree<Integer> auxT = new BinaryTree<Integer>();
	
		auxT = buscarSubArbol(arbol, n);
		
		return auxT;
	}
}
