/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeprovas;

import java.util.ArrayList;

/**
 *
 * @author 6197248
 */
public class Prova {
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    private ArrayList<Questao> questoes = new ArrayList();
    
    public String obtemDetalhes(){
        String prova = "Disciplina: "+this.getNomeDisciplina()
                +"\n Nome: ________________________________     Local: "+this.getLocal()
                +"\nData: "+this.getData()
                +"\n\nQuestoes:\n\n";
        
        for(int i = 0; i < this.questoes.size(); i++){
            prova += this.questoes.get(i).retornaQuestao();
        }
        
        prova += "\n\n --------------------FIM DO RELATÓRIO--------------------";
        
        return prova;
    }
    
    public Prova(String nomeDisciplina){
        this.peso = 10;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }    

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }
}
