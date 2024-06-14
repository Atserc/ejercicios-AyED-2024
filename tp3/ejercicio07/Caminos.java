package tp3.ejercicio07;

import tp3.ejercicio05.*;
import java.util.*;

public class Caminos {
	GeneralTree<Integer> a = new GeneralTree<Integer>();

	private List<Integer> caminoRecursivo(List<Integer> listaActual, List<Integer> listaMax, GeneralTree<Integer> auxT) {
		listaActual.add(auxT.getData());
		if (auxT.isLeaf()) {
			if (listaActual.size() > listaMax.size()) {
				listaMax.removeAll(listaMax);
				for (Integer x : listaActual) {
					listaMax.add(x);
				}
			}
		} else {
			if (auxT.hasChildren()) {
				List<GeneralTree<Integer>> children = auxT.getChildren();
				for (GeneralTree<Integer> child : children) {
					caminoRecursivo(listaActual,listaMax,child);
				}
			}
		}
		return listaMax;
	}
	public List<Integer> caminoAHojaMasLejana(){
		List<Integer> listaActual = new ArrayList<Integer>();
		List<Integer> listaMax = new ArrayList<Integer>();
		GeneralTree<Integer> auxT = a;
		
		listaMax = caminoRecursivo(listaActual,listaMax,auxT);
		
		return listaMax;
	}
	
}
