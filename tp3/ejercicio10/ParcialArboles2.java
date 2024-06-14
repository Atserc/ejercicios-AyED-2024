package tp3.ejercicio10;

import java.util.*;
import tp3.ejercicio03.GeneralTree;

public class ParcialArboles2 {

	/*
	 * La idea es que en res se guarde el camino que cumple con lo pedido, sin 0s y que sea la suma maxima.
	 * Con actual lo que hago es llevar una lista que contiene cada nodo del camino multiplicado por su nivel. 
	 * El tam de la lista me permite conocer el nivel en el que estoy y multiplicar.
	 * Max es para ir comparando con la actual para saber cual fue el camino con mayor suma.
	 */
	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		List<Integer> actual = new ArrayList<Integer>();
		List<Integer> max = new ArrayList<Integer>();
		
		int sumaMax=0, lvlAct=0, sumaAct=0;
		
		rec(arbol, actual, max, lvlAct, sumaAct, sumaMax);
		
		imprimirLista(max);
		
		return max;
	}
	
	//El tam de Actual y maximo siempre sera del largo total del camino, por mas que nos hayamos encontrado con un 0 en el medio.
	private static int rec (GeneralTree<Integer> a, List<Integer> act, List<Integer> max, int lvlAct , int sumaAct, int sumaMax) {
		act.add(a.getData());
		sumaAct += a.getData()*act.size();
		
		if (a.isLeaf()) {
			if (sumaAct > sumaMax) {
				max.removeAll(max);
				for (Integer nro: act) {
					if (nro != 0) max.add(nro);
				}
				sumaMax = sumaAct;
			}
		}
		else {
			for (GeneralTree<Integer> child: a.getChildren()) {
				sumaMax = rec(child, act, max, lvlAct+1, sumaAct, sumaMax); 
			}
		}
		
		act.remove(act.size()-1);
		
		return sumaMax;

	}
	
	// esto es solo pa imprimir
	private static void imprimirLista(List<Integer> l) {
		System.out.print("[");
		for (Integer i: l) {
			System.out.print(i + " ");
		}
		System.out.print("]");
		System.out.println();
	}
}
