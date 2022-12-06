package test;

import domain.Persona;

public class Main {
    public static void main(String[] args) {
//        int arr[] = new int[34];
//        System.out.println("arr = " + arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * 3;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Edades del elemento: " + i + " Valor: " + arr[i]);
//        }
        Persona personas[] = new Persona[40];
        personas[0] = new Persona("fasdf");
        personas[1] = new Persona("Axel");

//        for (int i = 0; i < personas.length; i++) {
//            System.out.println("Valor guardado = " + personas[i]);
//        }

        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
