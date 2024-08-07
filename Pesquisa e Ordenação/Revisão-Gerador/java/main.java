package Aula;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class main {
    public static void main(String[] args) {
    	
    	  Scanner ler = new Scanner(System.in);
    	  ArrayList<String> listaPalavras = new ArrayList<>();
        ArrayList<Integer> vetor = new ArrayList<>();

        System.out.println("Quantas palavras quer gerar? ");
        int quantidade = ler.nextInt();
        
        Util.gerarPalavraLista(listaPalavras,10,8);
        Util.exibir(listaPalavras,"LISTA DE PALAVRAS:");
        
        popular(vetor, quantidade);
        exibir(vetor);
    }

    public static void popular(ArrayList<Integer> v, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v.add(gerador.nextInt(100));
        }
    }

    public static void exibir(ArrayList<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}
