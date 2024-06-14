package tp3.ejercicio02;

import java.util.*;
import tp3.ejercicio01.GeneralTree;

public class RecorridosAG {
	//Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	//pasados como parámetros, recorrido en preorden.
	
	public List<Integer> numerosImparesMayoresQuePreOrden2 (GeneralTree <Integer> a, Integer n, List<Integer> lista) {
		
		if (a.getData() > n) {			
			lista.add(a.getData());
		}
		
		if (a.hasChildren()) {
			for (GeneralTree<Integer> hijo : a.getChildren()) {
				numerosImparesMayoresQuePreOrden2(hijo,n,lista);
			}
		}
		
		return lista;
	}
	
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> aux = new ArrayList<Integer>();
		
		if (a.getData() > n) {			
			aux.add(a.getData());
		}
		
		if (a.hasChildren()) {
			for (GeneralTree<Integer> hijo : a.getChildren()) {
				numerosImparesMayoresQuePreOrden(hijo,n);
			}
		}
		
		return aux;
	}
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> aux = new ArrayList<Integer>();
		return aux;
	}
	
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> aux = new ArrayList<Integer>();
		return aux;
	}
	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,Integer n) {
		List<Integer> aux = new ArrayList<Integer>();
		return aux;
	}
}
