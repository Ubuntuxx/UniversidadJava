package test;

import domain.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Luis");
        Persona persona2 = new Persona("Carlos");
        imprimir(persona2);
    }

    public static void imprimir(Persona per) {
        System.out.println("persona = " + per);
    }
}
