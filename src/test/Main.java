package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;


public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Escritor("Juan", 50000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
    }
}
