package edu.com.uniquindio.talleres;

import java.util.ArrayList;
import java.util.List;

public class ColaOrdenada {

    public static List<Producto> quicksort(List<Producto> lista) {
        // Caso base: una lista vacía o con un solo elemento está ordenada
        if (lista.size() <= 1) {
            return lista;
        }

        // Escoger un pivote (en este caso, el primer elemento)
        Producto pivote = lista.get(0);

        List<Producto> menores = new ArrayList<>();
        List<Producto> mayores = new ArrayList<>();

        // Dividir la lista en dos sublistas: una con elementos menores y otra con mayores al pivote
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).getValor() < pivote.getValor()) {
                menores.add(lista.get(i));
            } else {
                mayores.add(lista.get(i));
            }
        }

        // Ordenar recursivamente las sublistas y combinarlas con el pivote
        List<Producto> ordenados = new ArrayList<>();
        ordenados.addAll(quicksort(menores));
        ordenados.add(pivote);
        ordenados.addAll(quicksort(mayores));

        return ordenados;
    }
}