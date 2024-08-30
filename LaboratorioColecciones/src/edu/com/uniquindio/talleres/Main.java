package edu.com.uniquindio.talleres;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Crear una lista de objetos Persona
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Ana", 28, "Femenino"));
        listaPersonas.add(new Persona("Carlos", 22, "Masculino"));
        listaPersonas.add(new Persona("Beatriz", 30, "Femenino"));
        listaPersonas.add(new Persona("Daniel", 22, "Masculino"));

        // Ordenar usando la interfaz personalizada Comparable
        listaPersonas.sort((p1, p2) -> p1.compareTo(p2));

        System.out.println("Personas ordenadas por edad y nombre:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        TreeSet<Producto> productos = new TreeSet<>();

        productos.add(new Producto("005", "Laptop", 1200.0));
        productos.add(new Producto("006", "Laptop", 1200.0));
        productos.add(new Producto("007", "Laptop", 1200.0));

        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
        Empresa empresa= new Empresa();
            
        empresa.agregarProducto(new Producto("001", "Laptop", 1200.0));
        empresa.agregarProducto(new Producto("002", "Smartphone", 800.0));
        empresa.agregarProducto(new Producto("003", "Tablet", 400.0));
        empresa.agregarProducto(new Producto("004", "Monitor", 300.0));

        // Mostrar todos los productos de la empresa
        System.out.println("Lista de productos en la empresa:");
        System.out.println(empresa);

        // Buscar un producto por código
        String codigoBuscado = "002";
        Producto productoBuscado = empresa.buscarProductoPorCodigo(codigoBuscado);

        if (productoBuscado != null) {
            System.out.println("\nProducto encontrado: " + productoBuscado);
        } else {
            System.out.println("\nProducto con código " + codigoBuscado + " no encontrado.");
        }

        }

        
}

