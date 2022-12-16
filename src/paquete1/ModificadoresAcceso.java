

package paquete1;

public class ModificadoresAcceso {
    private String atributo = "Atributo private";

    private ModificadoresAcceso() {
        System.out.println("Constructor vacio private");
    }

    public ModificadoresAcceso(String a) {
        this();
        System.out.println("Constrictor publico");
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    private void metodoProtegido() {
        System.out.println("Metodo private");
    }


}
