package edu.com.uniquindio.talleres;

import java.util.ArrayList;
import java.util.List;

public class Persona implements Comparable <Persona>{
	
	private String nombre;
	private int edad;
	private String genero;

	List<Persona> listaPersonas = new ArrayList<>();
	
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	@Override
	public int compareTo(Persona persona) {
		return this.nombre.compareTo(persona.nombre);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}

	    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + edad;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((listaPersonas == null) ? 0 : listaPersonas.hashCode());
		return result;
	}

	

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			if (edad != other.edad)
				return false;
			if (genero == null) {
				if (other.genero != null)
					return false;
			} else if (!genero.equals(other.genero))
				return false;
			if (listaPersonas == null) {
				if (other.listaPersonas != null)
					return false;
			} else if (!listaPersonas.equals(other.listaPersonas))
				return false;
			return true;
		}



}
