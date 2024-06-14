package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	
	public static void main(String[] args) {
		List<Integer> listaIntegers = new ArrayList<Integer>();
		
		int aux;
		for (String str: args) {
			aux = Integer.valueOf(str);
			listaIntegers.add(aux);
		}
				
		for (Integer elem : listaIntegers) {
			System.out.print(elem);
		}
	}
}

/* Inciso B:
 	Hubiera sido mas eficiente a la hora de crearla, ya que es eficiente para agragar elementos, pero al tener que recorrer toda
 	la lista para acceder a los elementos, seria mas ineficiente al tener que imprimirla.
*/

/* Inciso C:
 	Si, podría ser un arbol o una tabla de hash, pero ambas opciones no serian muy utiles para este caso.
 */
