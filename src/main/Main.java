package main;

import static manejodearchivos.ManejoArchivos.*;

public class Main {
    public static void main(String[] args) {
        String nombre = "Manejo.txt";
// crearArchivo("Manejo.txt");
        escribirArchivo(nombre, "Siuuu");
        anexarInfo(nombre,"Qué mira bobo?!");
    }
}
