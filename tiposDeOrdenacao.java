import java.util.Random;

public class tiposDeOrdenacao {
    Random r = new Random();

    public void geraVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(v.length * 10);
        }
    }

    public void mostrarVetor(int[] v) {
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
        int index;
        int j;
        // 30 20 10 40
        // 30 30 10 40
        // 
        // 20 30 30 40
        // 20 20 30 40
        // 20 10 30 40
        for(int i =1;i<v.length;i++){
            index = v[i];
            for( j= i -1; j>=0 && v[j]>index;j--){
                v[j+1] = v[j];
            }
            v[j+1] = index;
        }
    }

    public void ordernarSelecao(int[] v) {
        int index;
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