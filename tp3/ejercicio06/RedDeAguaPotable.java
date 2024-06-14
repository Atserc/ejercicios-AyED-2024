package tp3.ejercicio06;

import tp3.ejercicio05.*;

public class RedDeAguaPotable {
	
	public static GeneralTree<Character> red;
	
	private double minimoCaudalPrivado(double caudal, GeneralTree<Character> r) {
		if (r.isLeaf()) {
			return caudal;
		} else {
			int cantHijos = red.getChildren().size();
			double min = 0;
			for (GeneralTree<Character> hijo : red.getChildren()) {
				double caudalPorHijo = caudal / cantHijos;
				double hijoAct = minimoCaudalPrivado(caudalPorHijo,hijo);
				if (hijoAct < min) {
					min = hijoAct;
				}
			}
			return min;
		}
	}
	
	public double minimoCaudal(double caudal) {
		double min = 0;
		if (red.hasChildren()) {			
			int cantHijos = red.getChildren().size();
			for (GeneralTree<Character> hijo : red.getChildren()) {
				double caudalPorHijo = caudal / cantHijos;
				double hijoAct = minimoCaudalPrivado(caudalPorHijo,hijo);
				if (hijoAct < min) {
					min = hijoAct;
				}
			}
		}
		return min;
	}
	
}
