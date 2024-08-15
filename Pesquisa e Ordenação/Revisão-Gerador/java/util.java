package Testes;

import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
	
	static StringBuilder letras = new StringBuilder("abcdefghijklmnopqrstuvwxyz ");
	
	/**
	 * Gerador de palavras aleatorias
	 * @param gerador = random pra determinar a letra sorteada
	 * @param palavra = palavra que ta sendo gerada
	*/
	public static String gerarPalavra(int tamanho) {
		Random gerador = new Random();
		StringBuilder palavra = new StringBuilder();
		for(int i = 0;i < tamanho;i++) {
			
			palavra.append(letras.charAt(gerador.nextInt(letras.length())));
			
		}
		
		return palavra.toString();
	}
	/**
	 * metodo para por a palavra gerada na lista
	*/
	public static void gerarPalavraLista(ArrayList<String> lista,int quantidade,int tamanho) {
		
		for(int i = 0;i<quantidade;i++) {
			
			lista.add(gerarPalavra(tamanho));
			
		}
		
	}
	/**
	 * metodo para exibir a lista de palavras geradas
	 * @param lista = lista das palavras
	 * @param frase = para enfeitar o system.out
	*/
	public static void exibir(ArrayList<String> lista, String frase) {
		System.out.println(frase);
		for(Object item:lista) {
			System.out.print(item+"\t");
		}
        System.out.println("\n");
	}
	/**
	 * Metodo para gerar palavras em um arquivo
	 * @param caminho = o nome ou diretorio de onde ficara armazenado as palavras
	 * @param quantidade = quantidade de palavras geradas
	 * @param tamanho = tamanho das palavras geradas
	*/
	public static void gerarPalavrasArquivos(String caminho, int quantidade, int tamanho) {      
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            for (int i = 0;i < quantidade;i++) {
            	writer.write(Util.gerarPalavra(tamanho)+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void popular(ArrayList<Integer> v, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v.add(gerador.nextInt(100));
        }
    }

    public static void exibir(ArrayList<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+"\t");
        }
        System.out.println("\n");
    }

    public static void gerarAlunos(ArrayList<Alunos> lista,int quantidade) {
		
    	Random gerador = new Random();
		for(int i = 0;i<quantidade;i++) {
			
			String nomes = Util.gerarPalavra(5);;
			int idade = gerador.nextInt(22);
			int matricula = gerador.nextInt(100000);
			
			Alunos aluno = new Alunos(nomes,idade,matricula);
			
			lista.add(aluno);
		}
		
	}
	
    public static void exibirAlunos(ArrayList<Alunos> lista) {
        for (Alunos aluno : lista) {
            System.out.print(aluno.toString()+"\t");
        }
    }
    
}
