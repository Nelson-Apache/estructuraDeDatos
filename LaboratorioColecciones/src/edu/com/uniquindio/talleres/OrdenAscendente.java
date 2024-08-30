package edu.com.uniquindio.talleres;

import java.util.ArrayList;
import java.util.List;

public class OrdenAscendente {

    public static List<Integer> enOrdenAscendente(NodoArbol raiz) {
        List<Integer> lista = new ArrayList<>();

        // Caso base: si el nodo es nulo, se devuelve la lista vacía
        if (raiz == null) {
            return lista;
        }

        // Recorrer el subárbol izquierdo
        lista.addAll(enOrdenAscendente(raiz.izquierdo));

        // Agregar el valor del nodo actual
        lista.add(raiz.valor);

        // Recorrer el subárbol derecho
        lista.addAll(enOrdenAscendente(raiz.derecho));

        return lista;
    }
}

// Clase NodoArbol que representa un nodo de un árbol binario
class NodoArbol {
    int valor;
    NodoArbol izquierdo, derecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}