package test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List miList = new ArrayList();
        miList.add("Lunes");
        miList.add("Martes");
        miList.add("Miercoles");
        miList.add("Jueves");
        miList.add("Viernes");
        miList.add("Sabado");

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");

//        imprime(miSet);
//        System.out.println();
//        imprime(miList);

        Map miMap = new HashMap();

        //Modelo llave valor
        //         llave      valor
        miMap.put("Valor1", "Juan");
        miMap.put("Valor2", "Carlos");
        miMap.put("Valor3", "Roasario");

        //                              LLAVE
        System.out.println(miMap.get("Valor1"));

        //para obtener todas la llaves (Solo las llaves)
        imprime(miMap.keySet());

        //para imprimir valores (Solo los valores)
        imprime(miMap.values());
    }

    public static void imprime(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
