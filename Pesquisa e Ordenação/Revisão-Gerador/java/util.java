package Aula;

import java.util.ArrayList;
import java.util.Random;

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
			System.out.println(item);
		}
	}
}
