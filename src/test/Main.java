package test;


import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

import static aritmetica.Aritmetica.divicion;

public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = divicion(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocurri+o un error");
            e.printStackTrace(System.out);
        } catch (OperacionExcepcion e) {
            throw new RuntimeException(e);
        }
        System.out.println("resultado " + resultado);
    }
}
