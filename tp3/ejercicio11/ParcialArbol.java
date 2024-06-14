package tp3.ejercicio11;

import tp3.ejercicio03.GeneralTree;

public class ParcialArbol {

	public static boolean esCreciente(GeneralTree<Integer> arbol, int nivelAnterior) {
		boolean cumple = true;
		if ((!arbol.isLeaf()) && (!arbol.isEmpty())) {
			int cantidadNodos = arbol.getChildren().size(); 
			if (cantidadNodos != nivelAnterior+1) {
				cumple = false;
			}
			for (GeneralTree<Integer> hijo : arbol.getChildren()) {
				if (!esCreciente(hijo,cantidadNodos)) {
					cumple = false;
				}
			}
		}
		return cumple;
	}
	
	public static boolean resolver(GeneralTree<Integer> arbol) {
		return esCreciente(arbol,0);
	}
}