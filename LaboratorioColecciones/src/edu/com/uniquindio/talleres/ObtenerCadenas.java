package edu.com.uniquindio.talleres;

import java.util.ArrayList;
import java.util.List;

public class ObtenerCadenas {

    public static List<String> filtrarMayusculas(List<String> lista) {
        // Caso base: si la lista está vacía, se devuelve una nueva lista vacía
        if (lista.isEmpty()) {
            return new ArrayList<>();
        }

        // Obtener el primer elemento de la lista
        String cadena = lista.remove(0);

        // Llamada recursiva para filtrar el resto de la lista
        List<String> listaFiltrada = filtrarMayusculas(lista);

        // Condición: solo agregar la cadena si comienza con una letra mayúscula
        if (!cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0))) {
            listaFiltrada.add(cadena);
        }

        return listaFiltrada;
    }
}