package tp3.ejercicio10;

import java.util.*;
import tp3.ejercicio03.GeneralTree;

public class ParcialArbol {
	
	private static int maximo(GeneralTree<Integer> arbol, List<Integer> listaActual, List<Integer> listaMax, int nivelActual, int sumaActual, int sumaMax) {
		
		sumaActual += arbol.getData()*listaActual.size();
		
		if (arbol.isLeaf()) {
			if (sumaActual > sumaMax) {				
				listaMax.removeAll(listaMax);
				for (Integer i: listaActual) {
					if (i != 0) listaMax.add(i);
				}
				sumaMax = sumaActual;
			}
		} else {
			for (GeneralTree<Integer> hijo : arbol.getChildren()) {
				listaActual.add(sumaMax);
				sumaMax = maximo(hijo,listaActual,listaMax,(nivelActual+1),sumaActual,sumaMax);
				listaActual.remove(sumaMax);
			}
		}
		return sumaMax;
	}
	
	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		if (!arbol.isEmpty()) {			
			int nivelActual = 0;
			int sumaMax = 0;
			int sumaActual = 0;
			
			List<Integer> listaActual = new ArrayList<Integer>();
			List<Integer> listaMax = new ArrayList<Integer>();

			listaActual.add(sumaMax);
			
			maximo(arbol,listaActual,listaMax,nivelActual,sumaMax,sumaActual);
			return listaMax;
		} else {
			System.out.println("El arbol proporcionado estaba vacio");
			return null;
		}
		
	}
}
