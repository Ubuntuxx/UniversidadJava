package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Luis";
        System.out.println("persona nombre= " + persona.nombre);
        cambiaValor(persona);
        System.out.println("persona nombre= " + persona.nombre);
    }

    public static void cambiaValor(Persona persona){
        persona.nombre = "karña";
    }
}
