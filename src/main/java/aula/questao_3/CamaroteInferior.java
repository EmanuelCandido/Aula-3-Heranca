
package aula.questao_3;


public class CamaroteInferior extends VIP {
    
    private String local;

    public CamaroteInferior(double valor,String local) {
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
