/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fazer;
        // Ler a lista de alunos do arquivo
        ArrayList<Alunos> listaObj = new ArrayList<>();
        Util.lerArquivo(listaObj);
        
        do{
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Gerar nomes\n2 - Ordenar por sort\n3 - Ordenar por bolha\n4 - Ordenar por selecao\n5 - Ordenar por insercao\n0 - Sair");
            fazer = ler.nextInt();
            if (fazer == 1) {
            System.out.println("Quantos alunos deseja gerar?");
            int quantidade = ler.nextInt();
            // Gerar novos alunos
            Util.gerarAlunos(listaObj, quantidade);
            // Salvar a lista atualizada no arquivo
            Util.salvarArquivo(listaObj);
            } else if (fazer == 2) {
                Collections.sort(listaObj);
                Util.salvarArquivo(listaObj);
            }else if(fazer == 3){
                Ordenacao.bolhaObjeto(listaObj);
                Util.salvarArquivo(listaObj);
            }else if(fazer == 4){
                Ordenacao.selecaoObjeto(listaObj);
                Util.salvarArquivo(listaObj);
            }else if(fazer == 5){
                Ordenacao.insercaoObjeto(listaObj);
                Util.salvarArquivo(listaObj);
        }
        }while(fazer!=0);
        
    }
}

