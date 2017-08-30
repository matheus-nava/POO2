/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeprovas;

/**
 *
 * @author 6197248
 */
public class Discursiva extends Questao{
    private String criterioCorrecao;
    
    public String retornaQuestao() {
        String questao = "(Peso "+this.getPeso()+") Questao: "+this.getPergunta()+"\nR: "+this.getCriterioCorrecao()+"\n\n";
        return questao;
    }

    public String getCriterioCorrecao() {
        return criterioCorrecao;
    }

    public void setCriterioCorrecao(String criterioCorrecao) {
        this.criterioCorrecao = criterioCorrecao;
    }
}
