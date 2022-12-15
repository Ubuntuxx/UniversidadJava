package enums;

public enum Enumeracion {
    LUIS("Ingeniero", 22),
    YIRO("Ingeniero", 21),
    PAN("Ingeniero",26),
    ANTUAN("Ingeniero",26);

    private final String profesion;
    private final int edad;

    private Enumeracion(String profesion, int edad) {
        this.profesion = profesion;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }


}
