import clases.Persona;

import java.math.*;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona personnel2 = new Persona();
        persona1.nombre = "andres";
        persona1.apellido = "Juarez";
        persona1.desplegarInfo();
        System.out.println(persona1);
        System.out.println(personnel2);
    }
}