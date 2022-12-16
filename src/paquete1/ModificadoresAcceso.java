

package paquete1;

public class ModificadoresAcceso {
    String atributo = "Atributo package";

    ModificadoresAcceso(){
        System.out.println("Constructor vacio package" );
    }

    ModificadoresAcceso(String a){
        System.out.println("Constrictor package");
    }
    void metodoProtegido(){
        System.out.println("Metodo package");
    }
}
