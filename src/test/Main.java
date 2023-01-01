package test;


import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

import static aritmetica.Aritmetica.divicion;

public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = divicion(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se revisó el error");
        }
        System.out.println("resultado " + resultado);
    }
}
