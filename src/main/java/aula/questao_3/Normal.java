
package aula.questao_3;

public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }
    
    @Override
    public double imprimeValor(){
        System.out.println("Valor do ingresso Normal; "+ getValor());
        return super.imprimeValor();
        
    }
}
