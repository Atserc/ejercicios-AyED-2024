/*
Considere un string de caracteres S, el cual comprende únicamente los caracteres: (,),[,],{,}.
Decimos que S está balanceado si tiene alguna de las siguientes formas:
S = "" S es el string de longitud cero.
S = "(T)"
S = "[T]"
S = "{T}"
S = "TU"
Donde ambos T y U son strings balanceados. Por ejemplo, "{( ) [ ( ) ] }" está balanceado, pero
"( [ ) ]" no lo está.
a. Indique qué estructura de datos utilizará para resolver este problema y cómo la
utilizará.
b. Implemente una clase llamada tp1.ejercicio9.TestBalanceo, cuyo objetivo es
determinar si un String dado está balanceado. El String a verificar es un parámetro de
entrada (no es un dato predefinido).
 */
package tp1.ejercicio9;

// 9a) lo resolveria con una stack.

public class TestBalanceo {
	
	public static boolean validar(String e) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < e.length(); i++) {
			char c = e.charAt(i);
			
			if ((c == '(') || (c == '{') || (c == '[')) {
				stack.push(c);
			} else if (stack.isEmpty()) {					
				return false;
			} else {
				char lastC = stack.top();
				if ((c == ')') && (lastC == '(')) {
					stack.pop();
				}else if((c == '}') && (lastC == '{')) {
					stack.pop();
				}else if((c == ']') && (lastC == '[')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		String ejemplo = "(({})){[}]";
		String resultado;
		if (validar(ejemplo)) {
			resultado = "Si, esta balanceada";
		} else {
			resultado = "No, esta desbalanceada";
		}
		System.out.println("La expresion " + ejemplo + " esta balanceada ? ---> " + resultado);
		
		ejemplo = "([({})])[]";
		if (validar(ejemplo)) {
			resultado = "Si, esta balanceada";
		} else {
			resultado = "No, esta desbalanceada";
		}
		System.out.println("La expresion " + ejemplo + " esta balanceada ? ---> " + resultado);
		
		ejemplo = "Jose carlos";
		if (validar(ejemplo)) {
			resultado = "Si, esta balanceada";
		} else {
			resultado = "No, esta desbalanceada";
		}
		System.out.println("La expresion " + ejemplo + " esta balanceada ? ---> " + resultado);
	}

}


/*
10. Lo mejor para el caso de los bancos es una cola de doble entrada (double ended queue), ya que esto permite que se genere una
cola normal, pero se permita agregar gente que requiera atencion prioritaria directamente al comienzo de la cola.

11. Lo mejor para el caso de los micros es una cola circular (circular queue), ya que esto permite que cada vez que un micro pase
por una parada, dicha parada se vuelva a agregar al final de la cola.

*/