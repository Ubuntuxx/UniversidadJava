package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("Circulo");

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();

        figura.reemplazar();
    }
}
