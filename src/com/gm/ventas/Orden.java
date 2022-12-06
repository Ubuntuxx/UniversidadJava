package com.gm.ventas;

import java.util.PropertyResourceBundle;

public class Orden {
    private int idOrden;
    private Producto producto[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.producto = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto productosVenta) {
        if (this.contadorOrdenes > MAX_PRODUCTOS) {
            System.out.println("Has superado el numero maximo de productos");
        } else {
            this.producto[this.contadorProductos++] = productosVenta;
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += Math.round(this.producto[i].getPrecio());
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Total de la orden: " + calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.producto[i]);
        }
    }
}
