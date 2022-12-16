package paquete1;

import paquete1.ModificadoresAcceso;
//import paquete2.ClaseHija;

public class Main {
    public static void main(String[] args) {
        ModificadoresAcceso modificadoresAcceso = new ModificadoresAcceso("Package");
        System.out.println("modificadoresAcceso.atributo = " + modificadoresAcceso.getAtributo());
        System.out.println(modificadoresAcceso);

    }
}

