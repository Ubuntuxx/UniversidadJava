package domain;

import java.util.Objects;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected String departamento;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.sueldo, sueldo) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(departamento, empleado.departamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sueldo);
    }
}
