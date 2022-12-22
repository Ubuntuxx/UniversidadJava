package test;

import domain.Empleado;
import domain.Gerente;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        imprimir(empleado);

        Gerente gerente = new Gerente("Karla", 1999, "Contabilidad");

        imprimir(gerente);
    }

    public static void imprimir(Empleado em) {
        System.out.println("empleado = " + em.obtenerDetalles());
    }
}
