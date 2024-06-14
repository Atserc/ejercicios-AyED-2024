package tp2.ejercicio5;

import tp2.ejercicio2.BinaryTree;
import tp2.ejercicio2.Queue;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	public int profundidadEntreNiveles(int n, int m){
		int profundidad = 0;
		BinaryTree<Integer> ab = new BinaryTree<Integer>(); 
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		int nivel = 1;
		cola.enqueue(arbol);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			
			ab = cola.dequeue();
			if (ab != null) {
				if ((nivel >= n) && (nivel <= m)) {					
					profundidad += ab.getData();
				}
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			} else if (!cola.isEmpty()) {
				cola.enqueue(null);
				nivel++;
			}
		}
		return profundidad;
	}
	
	public int sumaElementosProfundidad(int p) {
		int aux = 0;
		aux = profundidadEntreNiveles(p,p);
		return aux;
	}
	
}
