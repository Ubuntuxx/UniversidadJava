package Main;

import Operaciones.Aritmetica;

public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        System.out.println(aritmetica.a);
        System.out.println(aritmetica.b);

        Aritmetica aritmetica2 = new Aritmetica(8, 9);
        System.out.println(aritmetica2.a);
        System.out.println(aritmetica2.b);
    }
}