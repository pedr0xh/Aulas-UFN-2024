import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class main {
    public static void main(String[] args) {
    	
    	String nomeArquivo = "C:\\Users\\laboratorio\\Desktop\\aula\\palavra.txt";
    	Scanner ler = new Scanner(System.in);
    	ArrayList<String> listaPalavras = new ArrayList<>();
        ArrayList<Integer> vetor = new ArrayList<>();
        ArrayList<Alunos> listaObj = new ArrayList<>();

        System.out.println("Quantos alunos deseja gerar ?");
        int quantidade = ler.nextInt();
        
        Util.gerarAlunos(listaObj, quantidade);
        Util.exibirAlunos(listaObj);
        System.out.println("================================================");
        Ordenacao.bolhaObjeto(listaObj);
        Util.exibirAlunos(listaObj);
        
    }

	
}
