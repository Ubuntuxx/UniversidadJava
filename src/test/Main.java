package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMariaDB;
import accesodatos.ImplementacionMysql;

public class Main {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMysql();

        imprimir(datos);

        datos = new ImplementacionMariaDB();
        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }

    /*
*
* Manejo de interfaces

Cuando usar Interface y clases abstractas

Interfaces: Cuando se tiene comportamiento en común

Clases abstractas: Caracteristicas en común

* */
}
