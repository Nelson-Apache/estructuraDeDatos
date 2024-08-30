package edu.com.uniquindio.talleres;

import java.util.Stack;

public class ejercicio4 {
	
	
	public static void insertarPila(Stack<Object> pila, Object elemetoInsertar) {
		
		Object tipoElementoCima = pila.peek();
		
		if (tipoElementoCima.getClass() == elemetoInsertar.getClass()) {
			pila.push(elemetoInsertar);
			System.out.println("El elemento fue agregado con exito");
			
		}else {
			System.out.println("El elemento no fue agregado con exito");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Daniela Muñoz", 20, "F", 123);
		Estudiante estudiante2 = new Estudiante("Salome Perez", 19, "F", 134);
		Persona persona1 = new Persona("Nelson Apache", 23, "M");
		Persona persona2 = new Persona("Pepito", 23, "M");
		
		Stack<Object> pilaObjetos = new Stack<Object>();
		
		pilaObjetos.push(estudiante1);
		pilaObjetos.push(estudiante2);
		pilaObjetos.push(persona1);
		
		ejercicio4.insertarPila(pilaObjetos, persona2);
				
		
	}

}
