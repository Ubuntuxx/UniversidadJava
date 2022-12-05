package test;

import domain.Persona;

public class Main {
    public static void main(String[] args) {
        final int variable = 10;
        System.out.println("variable = " + variable);

        final Persona persona = new Persona();
        persona.setNombre("adsfgadg");
        System.out.println(persona.getNombre());
    }
}
