package test;

import domain.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luis",1000,"Sistemas");
        System.out.println(gerente.obtenerDetalles());
    }
}
