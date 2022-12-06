package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class Ventas {
    public static void main(String[] args) {
        Producto producto = new Producto("Lazo", 234.90);
        Producto producto2 = new Producto("Lazo", 234.90);
        Producto producto3 = new Producto("Lazo", 2333.90);
        Producto producto4 = new Producto("Lazo", 2343.90);
        Producto producto5 = new Producto("Lazo", 2423.90);
        Producto producto6 = new Producto("Lazo", 233.90);
        Producto producto7 = new Producto("Lazo", 343.90);
        Producto producto8 = new Producto("Lazo", 23.90);
        Producto producto9 = new Producto("Lazo", 433.90);



        Orden orden = new Orden();
        orden.agregarProducto(producto);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        orden.agregarProducto(producto4);
        orden.agregarProducto(producto5);
        orden.agregarProducto(producto7);
        orden.agregarProducto(producto8);
        orden.agregarProducto(producto9);


        orden.mostrarOrden();
    }
}
