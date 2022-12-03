package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println(persona);
        System.out.println("persona nombre= " + persona.nombre);
        System.out.println("persona apellido= " + persona.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona: " + this);
        new Imprimir().imprimir(this);
    }

}

class Imprimir {
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println(this);

    }
}
