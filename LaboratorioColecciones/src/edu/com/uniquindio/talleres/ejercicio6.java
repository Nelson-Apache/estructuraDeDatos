package edu.com.uniquindio.talleres;

import java.util.PriorityQueue;
import java.util.Queue;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Queue<Tarea> colaTareas = new PriorityQueue<Tarea>();
		
		colaTareas.offer(new Tarea("Tarea 1", 3));
		colaTareas.offer(new Tarea("Tarea 2", 4));
		colaTareas.offer(new Tarea("Tarea 3", 1));
		colaTareas.offer(new Tarea("Tarea 4", 2));
		
		while (!colaTareas.isEmpty()) {
			Tarea tarea = colaTareas.poll();
			System.out.println("Proceso " + tarea);
			
		}
		
		
		
	}

}
