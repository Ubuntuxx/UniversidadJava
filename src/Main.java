import java.math.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                continue; //ir a la siguiente iteracion
            }
            System.out.println("i = " + i);
        }
//
//        for (int i = 0; i < 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//                break;
//            }
//        }
    }

    public static int regreso(int numbrer) {
        return Math.abs(numbrer);
    }
}