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

//        for (Object elemeto : miList) {
//            System.out.println(elemeto);
//        }


//        miList.forEach(elemento -> {
//            System.out.println(elemento);
//        });

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");

//        imprime(miSet);
        System.out.println();
        imprime(miList);

    }

    //implementacion de polimorfismo para imprimir el contenido
    public static void imprime(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
