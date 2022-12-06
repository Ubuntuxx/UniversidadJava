package domain;

public final class Persona {

    public static final int CONSTANTE = 3;

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Metodo imprimir");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                '}' + super.toString();
    }
}
