package tp1.ejercicio3;

public class Estudiante extends Persona{
	private int comision;

	public Estudiante(String n, String a, String e, String f, int c){
		super(n,a,e,f);
		this.setComision(c);
	}
	
	private int getComision() {
		return comision;
	}

	private void setComision(int comision) {
		this.comision = comision;
	}
	
	public String tusDatos() {
		String aux = super.tusDatos();
		aux += "Comisión: " + this.getComision() + "\n";
		return aux;
	}
}
