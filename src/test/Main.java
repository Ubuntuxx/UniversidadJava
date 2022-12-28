package test;

import domain.Empleado;
import domain.Gerente;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        Gerente gerente = new Gerente("Karla", 1999, "Contabilidad");
        Determinar(empleado);
    }

    public static void Determinar(Empleado em) {
        if (em instanceof Gerente) {
            System.out.println("Es de Tipo gerente");
        }
        else if (em instanceof Empleado) {
            System.out.println("Es de tipo gerente");
        }
        else if (em instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
