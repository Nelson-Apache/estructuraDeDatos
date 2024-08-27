package edu.com.uniquindio.talleres;

import java.util.HashMap;
import java.util.Map;

public class ejercicio8 {
	
	
	public static Map<Integer, String> mapNumeroEntero(Map<Integer, String> mapNumero ) {
		
		 // Caso base: Si el mapa está vacío, retornar un nuevo mapa vacío
        if (mapNumero.isEmpty()) {
            return new HashMap<>();
        }

        // Obtener la primera entrada del mapa (clave-valor)
        Map.Entry<Integer, String> entrada = mapNumero.entrySet().iterator().next();

        // Eliminar la primera entrada del mapa original
        mapNumero.remove(entrada.getKey());

        // Llamada recursiva para filtrar el resto del mapa
        Map<Integer, String> resultado = mapNumeroEntero(mapNumero);

        // Si la clave de la entrada actual es par, agregarla al resultado
        if (entrada.getKey() % 2 == 0) {
            resultado.put(entrada.getKey(), entrada.getValue());
        }

        return resultado;
    }
	
	public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");
        mapa.put(5, "Cinco");

        // Llamar a la función recursiva para filtrar el mapa
        Map<Integer, String> mapaFiltrado = ejercicio8.mapNumeroEntero(mapa);

        // Imprimir el mapa filtrado
        for (Map.Entry<Integer, String> entrada : mapaFiltrado.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
	}
		

	
}
