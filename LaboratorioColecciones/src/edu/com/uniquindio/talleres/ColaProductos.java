package edu.com.uniquindio.talleres;

import java.util.LinkedList;
import java.util.Queue;

public class ColaProductos {

    public static void main(String[] args) {
        // Crear una cola de productos y agregar algunos productos
        Queue<Producto> cola = new LinkedList<>();
        cola.add(new Producto(15));
        cola.add(new Producto(8));
        cola.add(new Producto(12));
        cola.add(new Producto(5));

        // Filtrar la cola para obtener solo los productos cuyo valor es menor que 10
        Queue<Producto> colaFiltrada = filtrarCola(cola);

        // Imprimir los valores de los productos en la cola filtrada
        System.out.println("Productos con valor menor que 10:");
        for (Producto p : colaFiltrada) {
            System.out.println(p.getValor());
        }
    }

    public static Queue<Producto> filtrarCola(Queue<Producto> cola) {
        // Caso base: si la cola está vacía, se devuelve una nueva cola vacía
        if (cola.isEmpty()) {
            return new LinkedList<>();
        }

        // Desencolar el primer elemento
        Producto producto = cola.poll();

        // Llamada recursiva para filtrar el resto de la cola
        Queue<Producto> colaFiltrada = filtrarCola(cola);

        // Condición: solo agregar el producto si cumple con la condición (por ejemplo, valor menor que 10)
        if (producto.getValor() < 10) {
            colaFiltrada.add(producto);
        }

        return colaFiltrada;
    }
}

// Clase Producto con un atributo "valor" como ejemplo
class Producto {
    private int valor;

    public Producto(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}