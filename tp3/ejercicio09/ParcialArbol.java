package tp3.ejercicio09;

import java.util.*;
import tp3.ejercicio03.GeneralTree;

public class ParcialArbol {
	
	public static boolean helper(GeneralTree<Integer> arbol) {
		if (arbol.isEmpty()) {
			return false;
		} else {
			return esDeSeleccion(arbol);
		}
			
	}
	
	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		if (arbol.isLeaf()) {
			return true;
		} else {
			List<GeneralTree<Integer>> hijos = arbol.getChildren();
			int minimo = Integer.MAX_VALUE;
			boolean ok = true;
			Iterator<GeneralTree<Integer>> iterador = hijos.iterator();
			while (iterador.hasNext() && ok) {
				GeneralTree<Integer> hijo = iterador.next();
				if (hijo.getData() < minimo) {
					minimo = hijo.getData();
				}
				ok = esDeSeleccion(hijo);
			}
			return (ok && minimo == arbol.getData());
		}
	}
}
