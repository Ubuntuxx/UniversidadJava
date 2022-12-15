package Test;

import enums.Enumeracion;

public class Main {
    public static void main(String[] args) {
        System.out.println(Enumeracion.ANTUAN.ordinal());
        System.out.println(Enumeracion.ANTUAN.toString());
        for (Enumeracion personmas:Enumeracion.values()) {
            System.out.println("Nombre: " +  personmas + "\tProfesion: " + personmas.getProfesion()+ "\tEdad: " + personmas.getEdad());
        }
    }
}
