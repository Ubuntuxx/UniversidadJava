package Operaciones;

public class Aritmetica {
    public int a;
    public int b;

    public Aritmetica() {
        System.out.println("Mensaje desde el constructor");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }
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
