public class Main {
    
    public static void main(String[] args) {
        
        String palavra = "AAA";
        String texto = "AAAAA";
        int ocorrencias = Util.contarOcorrencias(palavra.getBytes(), palavra.length(), texto.getBytes(), texto.length());
        System.out.println("A palavra \"" + palavra + "\" ocorre " + ocorrencias + " vezes no texto \"" + texto + "\".");

        Util.contarBytes();

    }

}
