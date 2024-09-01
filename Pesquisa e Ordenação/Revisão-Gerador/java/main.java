import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Alunos> listaObj = new ArrayList<>();

        System.out.println("Quantos alunos deseja gerar ?");
        int quantidade = ler.nextInt();

        // Geração de alunos e adição à lista
        Util.gerarAlunos(listaObj, quantidade);

        // Ordenação dos objetos Alunos utilizando diferentes algoritmos em threads separadas

        // Ordenação por bolha em uma thread
        new Thread() {
            public void run() {
                Ordenacao.bolhaObjeto(listaObj);
                System.out.println("Feitooooo.... bolha");
            }
        }.start();

        // Ordenação por sort do Java em uma thread
        new Thread() {
            public void run() {
                Collections.sort(listaObj);
                System.out.println("Feitooooo.... sort java");
            }
        }.start();

        // Ordenação por inserção em uma thread
        new Thread() {
            public void run() {
                Ordenacao.insercaoObjeto(listaObj);
                System.out.println("Feitooooo.... insercao");
            }
        }.start();

        // Ordenação por seleção em uma thread
        new Thread() {
            public void run() {
                Ordenacao.selecaoObjeto(listaObj);
                System.out.println("Feitooooo.... selecao");
            }
        }.start();
        

    }
}
