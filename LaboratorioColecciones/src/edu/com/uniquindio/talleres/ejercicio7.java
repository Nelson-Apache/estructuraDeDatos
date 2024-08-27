package edu.com.uniquindio.talleres;

import java.util.ArrayList;
import java.util.List;

public class ejercicio7 {

	public static List<Persona> personasMayores(List<Persona> personas) {

		if (personas.isEmpty()) {
			return new ArrayList<>();
		}

		List<Persona> personasMayoresList = personasMayores(personas.subList(1, personas.size()));

		if (personas.get(0).getEdad() >= 18) {
			personasMayoresList.add(0, personas.get(0));
		}

		return personasMayoresList;

	}

	public static void main(String[] args) {

		Persona persona1 = new Persona("Daniela Muñoz", 20, "F");
		Persona persona2 = new Persona("Salome Perez", 19, "F");
		Persona persona3 = new Persona("Nelson Apache", 23, "M");
		Persona persona4 = new Persona("Pepito", 17, "M");

		List<Persona> listPersonas = new ArrayList<Persona>();
		listPersonas.add(persona1);
		listPersonas.add(persona2);
		listPersonas.add(persona3);
		listPersonas.add(persona4);

		List<Persona> nuevaListaPersonas = ejercicio7.personasMayores(listPersonas);

		for (Persona persona : nuevaListaPersonas) {
			System.out.println(persona.getNombre());
		}

	}

}
