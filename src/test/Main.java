package test;

import dominio.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Luis", "amador", 10000, false);
        persona1.setNombre("Jose");
        System.out.println(persona1.getNombre());

        System.out.println(persona1.toString());
    }
}
