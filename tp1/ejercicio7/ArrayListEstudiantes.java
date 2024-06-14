package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

import tp1.ejercicio3.Estudiante;
import tp1.ejercicio3.Profesor;

public class ArrayListEstudiantes {
	
	public static ArrayList<Estudiante> crearLista3Estudiantes(){
		Estudiante e;
		ArrayList<Estudiante> aux = new ArrayList<Estudiante>(3);
		e = new Estudiante("Juan","Perez","juanPerInfo@gmail.com","Informática",2);
		aux.add(e);
		e = new Estudiante("Maria","Herrera","maryHer@gmail.com","Exáctas",1);
		aux.add(e);
		e = new Estudiante("Jose","Pereira","JoPe@gmail.com","Informática",1);
		aux.add(e);
		
		return aux;
	}
	
	public static List<Estudiante> copiarLista(List<Estudiante> L){
		
		List<Estudiante> aux = new ArrayList<Estudiante>();
		
		// aux.addAll(L); No sirve porque cualquier metodo de copia de listas copia las referencias. 
		//Para copiar el objeto se debe hace 1 x 1

		for (Estudiante e : aux) {
			aux.add(e);
		}
		return aux;
	}
	
	public static void agregarEstudiante() {
		
	}
	
	public static void main(String[] args) {
		Profesor p = new Profesor("jose","flores","jf@gmail.com","informatica","CADP");
		System.out.println(p.toString());
		
		List<Estudiante> listaEstudiantes = crearLista3Estudiantes();
		
		//b
		List<Estudiante> listaEstudiantes2 = copiarLista(listaEstudiantes);
		for (Estudiante e : listaEstudiantes2) {
			System.out.println(e.toString());
		}
		//c
	}
}
