package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List miList = new ArrayList();
        miList.add("Lunes");
        miList.add("Martes");
        miList.add("Miercoles");
        miList.add("Jueves");
        miList.add("Viernes");

        for (Object elemeto : miList) {
            System.out.println(elemeto);
        }

        System.out.println();

        miList.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
    }
}
