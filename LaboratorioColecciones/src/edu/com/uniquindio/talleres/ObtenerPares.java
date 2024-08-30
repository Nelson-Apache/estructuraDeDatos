package edu.com.uniquindio.talleres;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ObtenerPares {

    public static Set<Integer> filtrarPares(Set<Integer> conjunto) {
        Set<Integer> conjuntoFiltrado = new HashSet<>();

        // Caso base: si el conjunto está vacío, se devuelve un nuevo conjunto vacío
        if (conjunto.isEmpty()) {
            return conjuntoFiltrado;
        }

        // Obtener un iterador para recorrer el conjunto
        Iterator<Integer> iterator = conjunto.iterator();

        // Obtener el primer elemento
        int numero = iterator.next();
        iterator.remove();

        // Llamada recursiva para filtrar el resto del conjunto
        conjuntoFiltrado = filtrarPares(conjunto);

        // Condición: solo agregar el número si es par
        if (numero % 2 == 0) {
            conjuntoFiltrado.add(numero);
        }

        return conjuntoFiltrado;
    }
}