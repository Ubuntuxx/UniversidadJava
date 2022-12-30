package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;


public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 50000);
        Empleado empleado1 = new Empleado("juan", 50000);

        if (empleado1 == empleado) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }

        //Metodo para verificar si los objetos son lo mismo en contenidos
        if (empleado.equals(empleado1)) {
            System.out.println("Los objetos son lo mismo en contenido");
        } else {
            System.out.println("Los objetos NO son iguales en contenido");
        }

        if (empleado.hashCode() == empleado1.hashCode()) {
            System.out.println("El valor es igual");
        } else {
            System.out.println("El valor es diferente");
        }

        /*Comparacion de objetos
            recomendable que las clases de dominio incluyan estos metodos
            debido a que cuando se trabaja con frameworks más avanzados -- Spring, Hibernate --
            utilizan estos metodos de forma automatica
         */

    }
}
