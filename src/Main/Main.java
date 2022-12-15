package Main;

public class Main {
    public static void main(String[] args) {
        int edades[] = {123, 4, 5, 65, 6, 7, 88};

        recorrer(edades);
//
//        for (int valoresRecolectadas : edades) {
//            System.out.println("valoresRecolectadas = " + valoresRecolectadas);
//        }
    }

    public static void recorrer(int edades[]) {
        for (int valoresRecolectadas : edades) {
            System.out.println("valoresRecolectadas = " + valoresRecolectadas);
        }
    }
}
