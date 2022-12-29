package test;

import domain.Empleado;
import domain.Gerente;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        Gerente gerente = new Gerente("Karla", 1999, "Contabilidad");
        Determinar(gerente);
    }

    public static void Determinar(Empleado em) {
        if (em instanceof Gerente) {
            System.out.println("Es de Tipo gerente");
            Gerente gerente =(Gerente) em;
            System.out.println("Gerente" + gerente.getDepartamento());
        } else if (em instanceof Empleado) {
            System.out.println("Es de tipo gerente");
        } else if (em instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
