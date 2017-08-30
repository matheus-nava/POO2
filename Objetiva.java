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
public class Objetiva extends Questao{
    private String opcoes[] = new String[5];
    private int resposta;
    
    public String retornaQuestao(){
        String questao = "(Peso "+this.getPeso()+") Questao: "+this.getPergunta();
        
        for(int i = 0; i < 5; i++){
            questao+="\n\t"+(i+1)+") "+this.getOpcoes()[i];
        }
        
        questao+="\n\nR: "+this.getResposta()+"\n\n";
        
        return questao;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }
}
