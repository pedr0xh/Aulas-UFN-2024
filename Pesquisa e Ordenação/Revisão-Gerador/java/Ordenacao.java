import java.util.ArrayList;

public class Ordenacao {

    // Método para ordenação por bolha de inteiros
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

    // Método para ordenação por bolha de strings
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

    // Método para ordenação por bolha de objetos do tipo Alunos
    public static void bolhaObjeto(ArrayList<Alunos> lista) {
        Alunos aux;
        boolean troca;

        for (int i = 0; i < lista.size() - 1; i++) {
            troca = false;

            for (int j = 0; j < lista.size() - i - 1; j++) {
                // Corrigido: Remove o parêntese extra na comparação
                if (lista.get(j).getNome().compareTo(lista.get(j + 1).getNome()) > 0) {
                    troca = true;
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }

            if (!troca) {
            }
        }
    }

    // public static void selecao(ArrayList<Alunos> lista) {
    
    //     int posMenor, i, j;
    //     int tmp;
    
    //     for (i = 0; i < lista.size()-1; i++) {
    //         posMenor = i;
    //         for (j = i + 1; j < lista.size(); j++ ) {
    //             if (lista.get(j).getNome().compareTo(lista.get(posMenor).getNome())) {
    //                 posMenor = j;
    //             }
    //         }
    //         if (i != posMenor) { 
    //             tmp = lista.get(i);
    //             lista.set(i, lista.get(posMenor));
    //             lista.set(posMenor, tmp);
    //         }
    //     }

    // }

    

}       	
            
