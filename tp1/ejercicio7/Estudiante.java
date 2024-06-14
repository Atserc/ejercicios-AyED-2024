package tp1.ejercicio7;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String email;
	private String facultad;
	private int comision;
	
	public Estudiante(String n, String a, String e, String f, int c){
		this.setNombre(n);
		this.setApellido(a);
		this.setEmail(e);
		this.setFacultad(f);
		this.setComision(c);
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
	
	protected int getComision() {
		return comision;
	}

	protected void setComision(int comision) {
		this.comision = comision;
	}
	
	public String tusDatos() {
		String aux = "Nombre: " + this.getNombre() + "\n" + 
					 "Apellido: " + this.getApellido() + "\n" + 
					 "Facutad: " + this.getFacultad() + "\n" + 
					 "Email: " + this.getEmail() + "\n" +
					 "Comisión: " + this.getComision() + "\n";
		return aux;
	}

	@Override
	public boolean equals(Object o) {
		Estudiante e = (Estudiante) o;
		boolean aux = false;
		if ((this.getNombre() == e.getNombre()) && 
			(this.getApellido() == e.getApellido()) && 
			(this.getFacultad() == e.getFacultad()) && 
			(this.getEmail() == e.getEmail()) && 
			(this.getComision() == e.getComision()))
		{
			aux = true;
		}
		return aux;
	}

}

