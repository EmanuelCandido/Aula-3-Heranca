
package aula.questao_3;


public class CamaroteInferior extends VIP {
    
    private String local;

    public CamaroteInferior(String local, double valor) {
        super(valor);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    
    
}
