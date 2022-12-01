package Operaciones;

public class Aritmetica {
    int a;
    int b;
    
    //Metodos

    public void suma(int a, int b) {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno(int a, int b) {
        return a + b;
    }

    public void sumarConArgumentos(int a, int b, int c) {
        sumarConRetorno(a, b);
    }
}
