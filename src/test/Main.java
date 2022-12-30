package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;


public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 50000);
        Empleado empleado1 = new Empleado("Juan",50000);

        if (empleado1 == empleado) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
    }
}
