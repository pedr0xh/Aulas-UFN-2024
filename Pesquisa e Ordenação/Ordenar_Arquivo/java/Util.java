/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Util {

    private static final String FILE_NAME = "C:\\Users\\podes\\Desktop\\aula\\palavra.txt";
    static StringBuilder letras = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

    /**
     * Gera uma palavra aleatória com o tamanho especificado.
     *
     * @param tamanho O comprimento desejado da palavra gerada.
     * @return Uma string contendo a palavra gerada.
     */
    public static String gerarPalavra(int tamanho) {
        Random gerador = new Random();
        StringBuilder palavra = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            palavra.append(letras.charAt(gerador.nextInt(letras.length())));
        }
        return palavra.toString();
    }

    /**
     * Gera uma lista de palavras aleatórias e a adiciona à lista fornecida.
     *
     * @param lista A lista onde as palavras geradas serão adicionadas.
     * @param quantidade O número de palavras a serem geradas.
     * @param tamanho O comprimento de cada palavra gerada.
     */
    public static void gerarPalavraLista(ArrayList<String> lista, int quantidade, int tamanho) {
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerarPalavra(tamanho));
        }
    }

    /**
     * Exibe a lista de palavras no console.
     *
     * @param lista A lista de palavras a ser exibida.
     * @param frase Uma frase para ser impressa antes da lista de palavras.
     */
    public static void exibir(ArrayList<String> lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.print(item + "\t");
        }
        System.out.println("\n");
    }

    /**
     * Gera um arquivo contendo palavras aleatórias.
     *
     * @param caminho O caminho do arquivo onde as palavras serão armazenadas.
     * @param quantidade O número de palavras a serem geradas.
     * @param tamanho O comprimento de cada palavra gerada.
     */
    public static void gerarPalavrasArquivos(String caminho, int quantidade, int tamanho) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            for (int i = 0; i < quantidade; i++) {
                writer.write(Util.gerarPalavra(tamanho) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Preenche a lista com números inteiros aleatórios.
     *
     * @param v A lista a ser preenchida com números aleatórios.
     * @param n O número de elementos a serem adicionados na lista.
     */
    public static void popular(ArrayList<Integer> v, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v.add(gerador.nextInt(100));
        }
    }

    /**
     * Exibe a lista de números inteiros no console.
     *
     * @param v A lista de números inteiros a ser exibida.
     */
    public static void exibir(ArrayList<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + "\t");
        }
        System.out.println("\n");
    }

    /**
     * Gera uma lista de alunos com nomes, idades e matrículas aleatórios.
     *
     * @param lista A lista onde os alunos gerados serão adicionados.
     * @param quantidade O número de alunos a serem gerados.
     */
    public static void gerarAlunos(ArrayList<Alunos> lista, int quantidade) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            String nomes = Util.gerarPalavra(5);
            int min = 18;
            int max = 70;
            int idade = min + gerador.nextInt(max - min + 1);
            int matricula = gerador.nextInt(100000);

            Alunos aluno = new Alunos(nomes, idade, matricula);
            lista.add(aluno);
        }
    }

    /**
     * Exibe a lista de alunos no console.
     *
     * @param lista A lista de alunos a ser exibida.
     */
    public static void exibirAlunos(ArrayList<Alunos> lista) {
        for (Alunos aluno : lista) {
            System.out.print(aluno.toString() + "\t");
        }
    }
    public static void salvarArquivo(ArrayList<Alunos> lista) {
        try (BufferedWriter escreve = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Alunos aluno : lista) {
                escreve.write(aluno.getNome() + "," + aluno.getIdade() + "," + aluno.getMatricula());
                escreve.newLine();
            }
            System.out.println("Arquivo salvo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    /**
 * Lê uma lista de alunos a partir de um arquivo e retorna a lista.
 *
 * @return Uma lista contendo os alunos lidos do arquivo.
 */
public static void lerArquivo(ArrayList<Alunos> lista) {
        try (BufferedReader ler = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String nome = partes[0];
                    int idade = Integer.parseInt(partes[1]);
                    int matricula = Integer.parseInt(partes[2]);

                    Alunos aluno = new Alunos(nome, idade, matricula);
                    lista.add(aluno);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
    


