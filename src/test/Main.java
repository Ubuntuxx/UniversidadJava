package test;

import domain.Persona;

public class Main {
    public static void main(String[] args) {
        int edades[][] = new int[5][5];

        String frutas[][] = {{"naranja", "Limon"}, {"Fresa", "Zarzamora", "Mora","Melón"}};

        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("Valores de la matriz: " + i + " : " + j + "\t\t" + frutas[i][j]);
            }
        }

        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("Edades: " + ren + " : " + col + edades[ren][col]);
            }
        }
    }
}
