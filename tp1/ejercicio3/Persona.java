package tp1.ejercicio3;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String email;
	private String facultad;
	
	public Persona(String n, String a, String e, String f) {
		this.setNombre(n);
		this.setApellido(a);
		this.setEmail(e);
		this.setFacultad(f);
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getFacultad() {
		return facultad;
	}
	protected void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String tusDatos() {
		String aux = "Nombre: " + this.getNombre() + "\n" + 
					 "Apellido: " + this.getApellido() + "\n" + 
					 "Facutad: " + this.getFacultad() + "\n" + 
					 "email: " + this.getEmail() + "\n";
		return aux;
	}
}
