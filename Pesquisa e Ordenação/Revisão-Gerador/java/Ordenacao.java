import java.util.ArrayList;

public class Ordenacao {
    
    /**
	 * Ordenação por metodo bolha para INTEIROS
	 * @param lista = lista de inteiros que será ordenada
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

    public static void bolhaPalavras(ArrayList<String> lista) {
        String aux;
        boolean troca;
    
        for (int i = 0; i < lista.size() - 1; i++) {
            troca = false;
    
            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    troca = true;
                    // Troca dos elementos
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
    
            // Se nenhuma troca ocorreu, a lista já está ordenada
            if (!troca) {
                break;
            }
        }
    }
    
}
