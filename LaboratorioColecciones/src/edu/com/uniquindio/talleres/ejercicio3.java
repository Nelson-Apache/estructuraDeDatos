package edu.com.uniquindio.talleres;

import java.util.HashMap;
import java.util.Map;

public class ejercicio3 {

	public static void main(String[] args) {

		//Creacion de objetos Estudiantes

		Estudiante estudiante1 = new Estudiante("Daniela Muñoz", 20, "F", 123);
		Estudiante estudiante2 = new Estudiante("Salome Perez", 19, "F", 134);
		Estudiante estudiante3 = new Estudiante("Nelson Apache", 23, "M", 145);

		//Creacion de map

		Map<Integer, Estudiante> mapEstudiante = new HashMap<Integer, Estudiante>();

		// Añadir estudiantes al mapa usando la matrícula como clave
		mapEstudiante.put(estudiante1.getMatriculaEstudiante(), estudiante1);
		mapEstudiante.put(estudiante2.getMatriculaEstudiante(), estudiante2);
		mapEstudiante.put(estudiante3.getMatriculaEstudiante(), estudiante3);

		// Mostrar los estudiantes en el mapa
		for (Map.Entry<Integer, Estudiante> entry : mapEstudiante.entrySet()) {
			System.out.println("Matricula: " + entry.getKey() + " Estudiante: " + entry.getValue().getNombre());
		}
	}

	
	
	
	
	
	
	

}
