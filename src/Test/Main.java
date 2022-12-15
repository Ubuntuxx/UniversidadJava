package Test;

import enums.Enumeracion;

public class Main {
    public static void main(String[] args) {
        for (Enumeracion personmas:Enumeracion.values()) {
            System.out.println("Nombre: " +  personmas + "\tProfesion: " + personmas.getProfesion()+ "\tEdad: " + personmas.getEdad());
        }
    }
}
