package tp1.ejercicio3;

public class Profesor extends Persona{
	private String catedra;
	
	public Profesor(String n, String a, String e, String f, String c){
		super(n,a,e,f);
		this.setCatedra(c);
	}
	
	private String getCatedra() {
		return catedra;
	}
	private void setCatedra(String catedra) {
		this.catedra = catedra;
	}


	public String tusDatos() {
		String aux = super.tusDatos();
		aux += "Cátedra: " + this.getCatedra() + "\n";
		return aux;
	}
}
