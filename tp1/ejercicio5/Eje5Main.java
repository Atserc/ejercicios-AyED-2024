package tp1.ejercicio5;

public class Eje5Main {
	
	private static int[] valores;
	private static double[] resultadosEstaticos;
	
	public static Resultados metodoReturn() {
		Resultados r = new Resultados();
		double total = 0;
		r.setMinimo(9999);
		r.setMaximo(0);
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < r.getMinimo()) {				
				r.setMinimo(valores[i]);
			}
			if (valores[i] < r.getMaximo()) {				
				r.setMaximo(valores[i]);
			}
			total +=valores[i];
		}
		
		r.setPromedio(total / valores.length);
		return r;
	}
	
	public static void metodoParametros(Resultados o) {
		double[] aux = new double[3];
		double total = 0;
		o.setMinimo(9999);
		o.setMaximo(0);

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < aux[1]) {				
				o.setMinimo(valores[i]);
			}
			if (valores[i] < aux[0]) {				
				o.setMaximo(valores[i]);
			}
			total +=valores[i];
		}
		
		o.setPromedio(total / valores.length);
	}
	
	public static void metodoStatic() {
		
		resultadosEstaticos = new double[3];
		double total = 0;
		
		resultadosEstaticos[0] = 9999;
		resultadosEstaticos[1] = 0000;
		resultadosEstaticos[2] = 0;
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < resultadosEstaticos[1]) {				
				resultadosEstaticos[1] = valores[i];
			}
			if (valores[i] < resultadosEstaticos[0]) {				
				resultadosEstaticos[0] = valores[i];
			}
			total +=valores[i];
		}
		resultadosEstaticos[2] = total / valores.length;
	}
	
	public static void main(String[] args) {
		valores = new int[10];
		Resultados resultadosReturn;
		
		resultadosReturn = metodoReturn();
		resultadosReturn.toString();
		
		Resultados objRes = new Resultados();
		metodoParametros(objRes);
		
		resultadosEstaticos = new double[3];
		metodoStatic();
	}

}
