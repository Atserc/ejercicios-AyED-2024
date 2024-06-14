package tp1.ejercicio3;

public class Test {
	
	public static void main(String[] args) {
		Estudiante e;
		Profesor p;
		Estudiante[] Estudiantes = new Estudiante[2];
		Profesor[] Profesores = new Profesor[3];
		
		e = new Estudiante("Juan","Perez","juanPerInfo@gmail.com","Informática",2);
		Estudiantes[0] = e;
		e = new Estudiante("Maria","Herrera","maryHer@gmail.com","Exáctas",1);
		Estudiantes[1] = e;
		p = new Profesor("Jose","Pereira","JoPe@gmail.com","Informática","CADP");
		Profesores[0] = p;
		p = new Profesor("Hernan","Gomez","HernanG@gmail.com","Informática","AyED");
		Profesores[1] = p;
		p = new Profesor("Brian","Martinez","BMartinez@gmail.com","Exáctas","Análisis Matemático");
		Profesores[2] = p;
		
		System.out.print("Estudiantes: \n \n");
		for (int i = 0; i < Estudiantes.length; i++) {
			System.out.print(Estudiantes[i].tusDatos());
			System.out.print("\n");
		}

		System.out.print("\nProfesores: \n \n");
		for (int i = 0; i < Profesores.length; i++) {
			System.out.print(Profesores[i].tusDatos());
			System.out.print("\n");
		}
	}
}
