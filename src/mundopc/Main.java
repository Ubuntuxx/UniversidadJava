package mundopc;

import com.gm.mundopc.*;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("HP", 29);
        Teclado teclado = new Teclado("C", "Logitech");
        Raton raton = new Raton("C", "Logitech");
        Computadora computadorahp = new Computadora("Computadora hp", monitor, teclado, raton);

        Computadora computadora2 = new Computadora("Gamer", monitor, teclado, raton);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadorahp);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}
