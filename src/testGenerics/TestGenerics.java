package testGenerics;

import genericos.ClaseGenerica;

import java.util.*;

public class TestGenerics {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        System.out.println(miLista.get(1));

        imprimir(miLista);
        System.out.println();
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");

        imprimir(miSet);
        System.out.println();

        Map<String, String> miMap = new HashMap<>();
        miMap.put("Valor1", "Luis");
        miMap.put("Valor2", "Amador");
        miMap.put("Valor3", "Gonzalez");

        imprimir(miMap.keySet());
        imprimir(miMap.values());
        System.out.println(miMap.get("Valor"));
    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
