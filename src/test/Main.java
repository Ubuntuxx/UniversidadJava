package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Luis", 1000);
        Cliente cliente = new Cliente("Alvaro", 'M', 22, "Juarez", new Date(), false);
        System.out.println("cliente = " + cliente);


        Cliente cliente2 = new Cliente("Alvaro", 'M', 22, "Juarez", new Date(), false);
        System.out.println("cliente2 = " + cliente2);

        System.out.println("empleado = " + empleado);


    }
}
