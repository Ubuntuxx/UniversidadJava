package genericos;

public class ClaseGenerica<T> {
    private T objetc;

    public ClaseGenerica(T objeto) {
        this.objetc = objeto;
    }

    public void obtenerTipo() {
        System.out.println("El tipo es: " + objetc.getClass().getSimpleName());
    }
}
