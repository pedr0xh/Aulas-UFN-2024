import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
    	
    	String nomeArquivo = "C:\\Users\\laboratorio\\Desktop\\aula\\palavra.txt";
    	Scanner ler = new Scanner(System.in);
    	ArrayList<String> listaPalavras = new ArrayList<>();
        //ArrayList<Integer> vetor = new ArrayList<>();

        System.out.println("Quantas palavras quer gerar ? ");
        int quantidade = ler.nextInt();
        System.out.println("qual o tamanho das palavras ? ");
        int tamanho = ler.nextInt();
        
       //popular(vetor, tamanho);
        //exibir(vetor);
        //Ordenacao.bolhaInteiros(vetor);
        //exibir(vetor);
        //System.out.println("Feitooooo...100");
        Util.gerarPalavrasArquivos(nomeArquivo,quantidade,tamanho);
        Util.gerarPalavraLista(listaPalavras,quantidade,tamanho);
        Util.exibir(listaPalavras,"LISTA DE PALAVRAS:");
        Ordenacao.bolhaPalavras(listaPalavras);
        Util.exibir(listaPalavras, "LISTA DE PALAVRAS ORDENADAS");
        
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
}
