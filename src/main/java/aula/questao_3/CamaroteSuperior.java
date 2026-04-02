package aula.questao_3;


import aula.questao_3.VIP;

public class CamaroteSuperior extends VIP {
    private String local;

    public CamaroteSuperior(double valor,String local) {
        super(valor+5);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @Override
    public void setValor(double valor){
        super.setValor(valor+10);
    }
    
    
    
    @Override
    public double imprimeValor(){
        System.out.println("Valor do ingresso VIP no camarote superior: "+ getValor());
        return getValor();
        
    }
}
