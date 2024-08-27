package edu.com.uniquindio.talleres;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ejercicio5 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> miSet = new HashSet<Integer>();
		
		miSet.add(1);
		miSet.add(2);
		miSet.add(3);
		miSet.add(4);
		
		
		Iterator<Integer> miIterator = miSet.iterator();
		
		while (miIterator.hasNext()) {
			Integer integer = (Integer) miIterator.next();
			System.out.println(integer);
			
		}
		
		

	}

}
