public class Util {

    public static void contarBytes(){

        char[] caracteres = {'A', 'C', 'G', 'T'};
        for (char c : caracteres) {
            System.out.println("Caractere: " + c + " | Byte: " + (byte)c);
        }

    }

    public static int contarOcorrencias(byte[] a, int m, byte[] b, int n) {
        int ocorrencias = 0;
        for (int k = m; k <= n; ++k) {
            int i = m - 1, j = k - 1;
            while (i >= 0 && a[i] == b[j]) {
                --i;
                --j;
            }
            if (i < 0) ++ocorrencias;
        }
        return ocorrencias;
    }

}
