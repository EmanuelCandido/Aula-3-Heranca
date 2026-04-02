

package aula.questao_3;


public class Questao_3 {

    public static void main(String[] args) {
        CamaroteSuperior quero = new CamaroteSuperior(15,"Paris");
        Normal sera = new Normal(15);
        CamaroteInferior onde = new CamaroteInferior(15,"Lixão");
       double valor = quero.imprimeValor();
       double valia = sera.imprimeValor();
       double h = onde.imprimeValor();
    }
}
