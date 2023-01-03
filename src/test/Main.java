package test;

import genericos.ClaseGenerica;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(23);
        objetoInt.obtenerTipo();


        ClaseGenerica<String> objetoString = new ClaseGenerica<String>("Luia");
        objetoString.obtenerTipo();
    }
}
