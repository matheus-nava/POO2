/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeprovas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 6197248
 */
public class GeradorDeProvas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Materia: ");
        Prova p = new Prova(s.nextLine());
        System.out.print("Local: ");
        p.setLocal(s.nextLine());
        System.out.print("Data: ");
        p.setData(s.nextLine());
        
        int decisao = 666;

        while (decisao != 0) {
            System.out.println("Qual Tipo de questao que voce quer criar?");
            System.out.println("\n1 - Objetiva / 2 - Discursiva / 0 - Sair");
            decisao = s.nextInt();
            s.nextLine();
            
            if (decisao == 1) {
                //criar questao objetiva
                Objetiva x = new Objetiva();
                String alternativas[] = new String[5];
                System.out.print("\nPergunta: ");
                x.setPergunta(s.nextLine());
                for (int j = 0; j < 5; j++) {
                    System.out.print("\nAlternativa " + (j + 1) + ": ");
                    alternativas[j] = s.nextLine();
                }
                x.setOpcoes(alternativas);
                System.out.print("\nAlternativa Correta: ");
                x.setResposta(s.nextInt());
                s.nextLine();
                System.out.print("\nPeso: ");
                x.setPeso(s.nextInt());
                s.nextLine();
                p.getQuestoes().add(x);
            } 
            else if (decisao == 2) {
                // criar questao discursiva
                Discursiva x = new Discursiva();
                System.out.print("\nPergunta: ");
                x.setPergunta(s.nextLine());
                System.out.print("\nCriterio de Correcao: ");
                x.setCriterioCorrecao(s.nextLine());
                System.out.print("\nPeso: ");
                x.setPeso(s.nextInt());
                s.nextLine();
                p.getQuestoes().add(x);
            } 
            else if(decisao != 0){
                System.out.println("Opçao Invalida!!!");
            }
        }
        JOptionPane.showMessageDialog(null, p.obtemDetalhes());
    } 
}
