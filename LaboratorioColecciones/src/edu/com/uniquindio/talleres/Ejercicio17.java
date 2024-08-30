package edu.com.uniquindio.talleres;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio17 {

    public static void main(String[] args) {

        // HashMap": Uso eficiente cuando no se requiere un orden específico.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("manzana", 1);
        hashMap.put("banano", 2);
        hashMap.put("fresa", 3);
        hashMap.put("pera", 4);

        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap:  Ideal cuando es necesario mantener el orden de inserción.
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("manzana", 1);
        linkedHashMap.put("banano", 2);
        linkedHashMap.put("fresa", 3);
        linkedHashMap.put("pera", 4);

        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap: Perfecto para situaciones donde se requiere un orden natural o personalizado de las claves.
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("manzana", 1);
        treeMap.put("banano", 2);
        treeMap.put("fresa", 3);
        treeMap.put("pera", 4);

        System.out.println("TreeMap: " + treeMap);
    }
}

