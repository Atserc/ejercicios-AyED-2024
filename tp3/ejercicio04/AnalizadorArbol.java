package tp3.ejercicio04;

import tp3.ejercicio03.GeneralTree;

public class AnalizadorArbol {
	
	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		double max;
		if (arbol.isLeaf()) {
			max = arbol.getData().getTardanza();
		} else {
			 max = 0;
			for (GeneralTree<AreaEmpresa> hijo : arbol.getChildren()) {
				max += hijo.getData().getTardanza();
			}
			
			max = max / arbol.getChildren().size();
			
			for (GeneralTree<AreaEmpresa> hijo : arbol.getChildren()) {
				double valorHijo = devolverMaximoPromedio(hijo);
				if (valorHijo > max) {
					max = valorHijo;
				}
			}
		}
		
		return max;
	}
 }
