package manejodearchivos;

import java.io.*;
import java.util.logging.Logger;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombre, String contenido) {
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void anexarInfo(String nombre, String contenido) {
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
