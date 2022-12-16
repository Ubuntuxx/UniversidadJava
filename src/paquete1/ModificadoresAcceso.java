
package paquete1;

public class ModificadoresAcceso {
    protected String atributo = "Atributo protegido";

    protected ModificadoresAcceso(){
        System.out.println("Constructor vacio protegido" );
    }

    public ModificadoresAcceso(String a){
        System.out.println("Constrictor publico");
    }
    protected void metodoProtegido(){
        System.out.println("Metodo protegido");
    }
}
