package edu.com.uniquindio.talleres;

import java.util.Stack;

public class PilaElementos {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(3);
        pila.push(5);
        pila.push(2);
        pila.push(10);
        pila.push(8);
        pila.push(4);

        Stack<Integer> pilaFiltrada = filtrarPila(pila);

        System.out.println("Elementos filtrados en la pila: " + pilaFiltrada);

    }

    //Metodo que filtra los elementos que son mayores a 5

    public static Stack<Integer>filtrarPila(Stack<Integer>pila){
        if (pila.isEmpty()){
            return  new Stack<>();
        }
        int top=pila.pop();
        Stack<Integer>pilaFiltrada = filtrarPila(pila);

        // Si el elemento extraído es mayor que 5, lo agrega a la pila filtrada
        if (top>5){
            pilaFiltrada.push(top);
        }
        //Retorna la pila filtrada
        return pilaFiltrada;
    }
}


