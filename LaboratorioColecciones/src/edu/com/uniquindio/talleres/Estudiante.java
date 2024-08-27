package edu.com.uniquindio.talleres;

public class Estudiante extends Persona{
	
	private int matriculaEstudiante;

	public Estudiante(String nombre, int edad, String genero, int matriculaEstudiante) {
		super(nombre, edad, genero);
		// TODO Auto-generated constructor stub
		this.matriculaEstudiante = matriculaEstudiante;
	}

	public int getMatriculaEstudiante() {
		return matriculaEstudiante;
	}
	
	
	
	

}
