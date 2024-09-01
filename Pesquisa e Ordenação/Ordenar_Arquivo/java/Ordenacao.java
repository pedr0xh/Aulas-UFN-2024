/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
import java.util.ArrayList;

public class Ordenacao {

    /**
     * Ordena uma lista de inteiros usando o algoritmo de ordenação por bolha.
     * 
     * @param lista A lista de inteiros a ser ordenada.
     */
    public static void bolhaInteiros(ArrayList<Integer> lista) {
        int aux;
        boolean troca;

        for (int i = 0; i < lista.size() - 1; i++) {
            troca = false;

            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    troca = true;
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }

            if (!troca) {
                break;
            }
        }
    }

    /**
     * Ordena uma lista de strings usando o algoritmo de ordenação por bolha.
     * 
     * @param lista A lista de strings a ser ordenada.
     */
    public static void bolhaPalavras(ArrayList<String> lista) {
        String aux;
        boolean troca;

        for (int i = 0; i < lista.size() - 1; i++) {
            troca = false;

            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    troca = true;
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }

            if (!troca) {
                break;
            }
        }
    }

    /**
     * Ordena uma lista de objetos do tipo `Alunos` usando o algoritmo de ordenação por bolha.
     * A ordenação é realizada com base no nome dos alunos.
     * 
     * @param lista A lista de objetos `Alunos` a ser ordenada.
     */
    public static void bolhaObjeto(ArrayList<Alunos> lista) {
        Alunos aux;
        boolean troca;

        for (int i = 0; i < lista.size() - 1; i++) {
            troca = false;

            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).getNome().compareTo(lista.get(j + 1).getNome()) > 0) {
                    troca = true;
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }

            if (!troca) {
                break;
            }
        }
    }

    /**
     * Ordena uma lista de objetos do tipo `Alunos` usando o algoritmo de ordenação por inserção.
     * A ordenação é realizada com base no método `compareTo` dos objetos `Alunos`.
     * 
     * @param lista A lista de objetos `Alunos` a ser ordenada.
     */
    public static void insercaoObjeto(ArrayList<Alunos> lista) {
        int i, j;
        Alunos aux;

        for (i = 1; i < lista.size(); i++) {
            aux = lista.get(i);

            for (j = i - 1; j >= 0 && lista.get(j).compareTo(aux) > 0; j--) {
                lista.set(j + 1, lista.get(j));
            }

            lista.set(j + 1, aux);
        }
    }

    /**
     * Ordena uma lista de objetos do tipo `Alunos` usando o algoritmo de ordenação por seleção.
     * A ordenação é realizada com base no método `compareTo` dos objetos `Alunos`.
     * 
     * @param lista A lista de objetos `Alunos` a ser ordenada.
     */
    public static void selecaoObjeto(ArrayList<Alunos> lista) {
        int i, j, posMenor;
        Alunos aux;
        posMenor = 0;
        
        for (i = 0; i < lista.size(); i++) {
            posMenor = i;
            for (j = i + 1; j < lista.size(); j++) {
                // Verificação de debug
                if (j >= lista.size()) {
                    System.out.println("Índice j fora dos limites: " + j);
                }
                if (lista.get(j).compareTo(lista.get(posMenor)) < 0) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                aux = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, aux);
            }
        }
    }
}
