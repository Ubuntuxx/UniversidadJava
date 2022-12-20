package test;

import domain.Empleado;
import domain.Gerente;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado.obtenerDetalles() = " + empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Karla", 1999, "Contabilidad");
        //System.out.println("gerente.obtenerDetalles() = " + gerente.obtenerDetalles());

        imprimir(gerente);
    }

    public static void imprimir(Empleado em) {
        System.out.println("empleado = " + em.obtenerDetalles());
    }
}
