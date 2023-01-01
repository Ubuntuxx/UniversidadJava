package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int divicion(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("Divicion entre cero");
        }
        return numerador / denominador;
    }
}
