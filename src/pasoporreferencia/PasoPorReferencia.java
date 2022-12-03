package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Luis";
        System.out.println("persona nombre= " + persona.nombre);
        persona = cambiaValor(persona);
        System.out.println("persona nombre= " + persona.nombre);
    }

    public static Persona cambiaValor(Persona persona) {
        persona.nombre = "karña";
        return persona;
    }
}
