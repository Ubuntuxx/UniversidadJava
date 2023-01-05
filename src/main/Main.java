package main;

import static manejodearchivos.ManejoArchivos.crearArchivo;
import static manejodearchivos.ManejoArchivos.escribirArchivo;

public class Main {
    public static void main(String[] args) {
        String nombre = "Manjo.txt";
// crearArchivo("Manejo.txt");
    escribirArchivo(nombre, "Siuuu");
    }
}
