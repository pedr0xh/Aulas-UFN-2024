import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Alunos> listaObj = new ArrayList<>();

        System.out.println("Quantos alunos deseja gerar?");
        int quantidade = ler.nextInt();

        // Geração de alunos e adição à lista
        Util.gerarAlunos(listaObj, quantidade);

        // Cria cópias da lista para cada algoritmo de ordenação
        ArrayList<Alunos> listaBolha = new ArrayList<>(listaObj);
        ArrayList<Alunos> listaSort = new ArrayList<>(listaObj);
        ArrayList<Alunos> listaInsercao = new ArrayList<>(listaObj);
        ArrayList<Alunos> listaSelecao = new ArrayList<>(listaObj);

        // Ordenação dos objetos Alunos utilizando diferentes algoritmos em threads separadas

        // Ordenação por bolha em uma thread
        Thread t1 = new Thread(() -> {
            Ordenacao.bolhaObjeto(listaBolha);
            System.out.println("Feitooooo.... bolha");
        });

        // Ordenação por sort do Java em uma thread
        Thread t2 = new Thread(() -> {
            Collections.sort(listaSort);
            System.out.println("Feitooooo.... sort java");
        });

        // Ordenação por inserção em uma thread
        Thread t3 = new Thread(() -> {
            Ordenacao.insercaoObjeto(listaInsercao);
            System.out.println("Feitooooo.... insercao");
        });

        // Ordenação por seleção em uma thread
        Thread t4 = new Thread(() -> {
            Ordenacao.selecaoObjeto(listaSelecao);
            System.out.println("Feitooooo.... selecao");
        });

        // Inicia as threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            // Aguarda a conclusão de todas as threads
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
