package edu.com.uniquindio.talleres;

import java.util.Stack;
import java.util.function.Predicate;

public class Ejercicio16 {

    public static <T> Stack<T> filtrarPila(Stack<T> pilaOriginal, Predicate<T> condicion) {
        Stack<T> nuevaPila = new Stack<>();
        return filtrarPila(pilaOriginal, nuevaPila, condicion);
    }

    private static <T> Stack<T> filtrarPila(Stack<T> pilaOriginal, Stack<T> nuevaPila, Predicate<T> condicion) {
        if (pilaOriginal.isEmpty()) {
            return nuevaPila;
        }

        T elemento = pilaOriginal.pop();
        if (condicion.test(elemento)) {
            nuevaPila.push(elemento);
        }

        Stack<T> resultado = filtrarPila(pilaOriginal, nuevaPila, condicion);
        pilaOriginal.push(elemento); // Restaurar el estado original de la pila

        return resultado;
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        Stack<Integer> pilaFiltrada = filtrarPila(pila, x -> x % 2 == 0);
        System.out.println(pilaFiltrada); // Debería imprimir: [2, 4]
    }
}

