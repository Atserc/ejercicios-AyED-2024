package tp2.ejercicio1;

public class ArbolesCargadosParaPruebas {
	
	public static BinaryTree<Integer> aLleno() {
		//Creo arbol lleno igual al ejemplo para probar el algoritmo.
		//De ahora en mas cuando pongo hi2 o hi3 me refiero al nivel del arbol al que pertenece.
		//Sin nada se entiende que es raiz.
		BinaryTree<Integer> raiz = new BinaryTree<Integer>(10);
		BinaryTree<Integer> hi1 = new BinaryTree<Integer>(2);
		BinaryTree<Integer> hd1 = new BinaryTree<Integer>(3);
		
		BinaryTree<Integer> hi2 = new BinaryTree<Integer>(5);
		hi2.addLeftChild(new BinaryTree<Integer>(7));
		hi2.addRightChild(new BinaryTree<Integer>(8));
		
		BinaryTree<Integer> hd2 = new BinaryTree<Integer>(4);
		hd2.addLeftChild(new BinaryTree<Integer>(5));
		hd2.addRightChild(new BinaryTree<Integer>(6));
		
		BinaryTree<Integer> hi3 = new BinaryTree<Integer>(9);
		hi3.addLeftChild(new BinaryTree<Integer>(12));
		hi3.addRightChild(new BinaryTree<Integer>(8));
		
		BinaryTree<Integer> hd3 = new BinaryTree<Integer>(8);
		hd3.addLeftChild(new BinaryTree<Integer>(2));
		hd3.addRightChild(new BinaryTree<Integer>(1));
		
		
		hi1.addLeftChild(hi2);
		hi1.addRightChild(hd2);
		hd1.addLeftChild(hi3);
		hd1.addRightChild(hd3);
		
		raiz.addLeftChild(hi1);
		raiz.addRightChild(hd1);
		
		return raiz;
	}
	
	public static BinaryTree<Integer> casiLleno() {
		//Creo arbol lleno igual al ejemplo para probar el algoritmo.
		//De ahora en mas cuando pongo hi2 o hi3 me refiero al nivel del arbol al que pertenece.
		//Sin nada se entiende que es raiz.
		BinaryTree<Integer> raiz = new BinaryTree<Integer>(10);
		BinaryTree<Integer> hi1 = new BinaryTree<Integer>(2);
		BinaryTree<Integer> hd1 = new BinaryTree<Integer>(3);
		
		BinaryTree<Integer> hi2 = new BinaryTree<Integer>(5);
		hi2.addLeftChild(new BinaryTree<Integer>(7));
		
		BinaryTree<Integer> hd2 = new BinaryTree<Integer>(4);
		hd2.addLeftChild(new BinaryTree<Integer>(5));
		hd2.addRightChild(new BinaryTree<Integer>(6));
		
		BinaryTree<Integer> hi3 = new BinaryTree<Integer>(9);
		hi3.addLeftChild(new BinaryTree<Integer>(12));
		hi3.addRightChild(new BinaryTree<Integer>(8));
		
		BinaryTree<Integer> hd3 = new BinaryTree<Integer>(8);
		hd3.addRightChild(new BinaryTree<Integer>(1));
		
		
		hi1.addLeftChild(hi2);
		hi1.addRightChild(hd2);
		hd1.addLeftChild(hi3);
		hd1.addRightChild(hd3);
		
		raiz.addLeftChild(hi1);
		raiz.addRightChild(hd1);
		
		return raiz;
	}
	
	public static BinaryTree<Integer> aSimple() {
		//Creo arbol lleno igual al ejemplo para probar el algoritmo.
		//De ahora en mas cuando pongo hi2 o hi3 me refiero al nivel del arbol al que pertenece.
		//Sin nada se entiende que es raiz.
		BinaryTree<Integer> raiz = new BinaryTree<Integer>(10);
		BinaryTree<Integer> hi1 = new BinaryTree<Integer>(2);
		BinaryTree<Integer> hd1 = new BinaryTree<Integer>(3);
		
		BinaryTree<Integer> hi2 = new BinaryTree<Integer>(5);
		hi2.addLeftChild(new BinaryTree<Integer>(7));
		
		hi1.addLeftChild(hi2);
		hi1.addRightChild(new BinaryTree<Integer>(1));
		
		raiz.addLeftChild(hi1);
		raiz.addRightChild(hd1);
		
		return raiz;
	}
	
//	public static BinaryTree<Integer> preFijo_aSimple() {
//		BinaryTree<Integer> raiz = new BinaryTree<Integer>(10);
//		BinaryTree<Integer> hi1 = new BinaryTree<Integer>(2);
//		BinaryTree<Integer> hd1 = new BinaryTree<Integer>(3);
		
//		BinaryTree<Integer> hi2 = new BinaryTree<Integer>(5);
//	}

}