package edu.com.uniquindio.talleres;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio15 {

    public static Map<String, Integer> filtrarClavesMinusculas(Map<String, Integer> mapaOriginal) {
        return filtrarClavesMinusculas(mapaOriginal, new HashMap<>());
    }

    private static Map<String, Integer> filtrarClavesMinusculas(Map<String, Integer> mapaOriginal, Map<String, Integer> mapaFiltrado) {
        if (mapaOriginal.isEmpty()) {
            return mapaFiltrado;
        }

        String clave = mapaOriginal.keySet().iterator().next();
        Integer valor = mapaOriginal.remove(clave);

        if (Character.isLowerCase(clave.charAt(0))) {
            mapaFiltrado.put(clave, valor);
        }

        return filtrarClavesMinusculas(mapaOriginal, mapaFiltrado);
    }

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("apple", 1);
        mapa.put("Banana", 2);
        mapa.put("cherry", 3);
        mapa.put("Date", 4);

        Map<String, Integer> mapaFiltrado = filtrarClavesMinusculas(mapa);
        System.out.println(mapaFiltrado); // Debería imprimir: {apple=1, cherry=3}
    }
}
