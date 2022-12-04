package domain;

public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorpersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        contadorpersonas++;
        this.idPersona = contadorpersonas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", idPersona=" + idPersona +
                '}';
    }
}
