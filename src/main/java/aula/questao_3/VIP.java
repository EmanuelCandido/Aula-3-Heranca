

package aula.questao_3;


public class VIP extends Ingresso {

    public VIP(double valor) {
        super(valor+5);
    }
    
    
    
    @Override
    public void setValor(double valor){
        super.setValor(valor+5);
    }
    
    
    
    @Override
    public double imprimeValor(){
        System.out.println("Valor do ingresso VIP: "+ getValor());
        return super.imprimeValor();
        
    }
}
