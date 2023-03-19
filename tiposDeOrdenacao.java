import java.util.Random;

public class tiposDeOrdenacao {
    Random r = new Random();

    public void geraVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(v.length * 10);
        }
    }

    public static void mostrarVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public void bubbleSort(int[] v) {
        int aux = 0;
        int i = 0;
        for (i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public void ordernarInsercao(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int index = i;
            while (index > 0 && v[index] < v[index - 1]) {
                int aux = v[index];
                v[index] = v[index - 1];
                v[index - 1] = aux;
                index = index - 1;
            }
        }
    }

    public void ordernarSelecao(int[] v) {
        int index = 0;
        for (int i = 0; i < v.length; i++) {
            index = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[index]) {
                    index = j;
                }

            }
            int menor_elemento = v[index];
            v[index] = v[i];
            v[i] = menor_elemento;
        }
    }
    public static long calcular_Tempo_ordenacao () {
        long tempo = System.currentTimeMillis();
        return tempo;

    }

}