package tp2.ejercicio9;

import tp2.ejercicio2.BinaryTree;

public class ArbolParcialTres {
	public class res {
		private int sumaCamino;
		private int diferencia;
		public int getSumaCamino() {
			return sumaCamino;
		}
		public void setSumaCamino(int sumaCamino) {
			this.sumaCamino = sumaCamino;
		}
		public int getDiferencia() {
			return diferencia;
		}
		public void setDiferencia(int diferencia) {
			this.diferencia = diferencia;
		}
	}
	
	private BinaryTree<res> sumAndDifRecursivo (BinaryTree<Integer> a, int camino, int numPadre) {
		BinaryTree<res> auxT = new BinaryTree<res>();
		
		int num = a.getData();
		int caminoNuevo = camino + num;
		
		auxT.getData().setDiferencia(num - numPadre);
		auxT.getData().setSumaCamino(caminoNuevo);
		
		if (a.hasLeftChild()) {
			auxT.addLeftChild(sumAndDifRecursivo(a.getLeftChild(),caminoNuevo,num));
		}
		if (a.hasRightChild()) {
			auxT.addRightChild(sumAndDifRecursivo(a.getLeftChild(),caminoNuevo,num));
		}
		
		return auxT;
	}
	
	public BinaryTree<res> sumAndDif(BinaryTree<Integer> arbol) {
		BinaryTree<res> auxT = new BinaryTree<res>();
		
		int num = arbol.getData();
		
		auxT.getData().setDiferencia(num);
		auxT.getData().setSumaCamino(num);
		
		if (arbol.hasLeftChild()) {
			auxT.addLeftChild(sumAndDifRecursivo(arbol.getLeftChild(),num,num));
		}
		if (arbol.hasRightChild()) {
			auxT.addRightChild(sumAndDifRecursivo(arbol.getLeftChild(),num,num));
		}
		
		return auxT;
	}
}
