import java.util.ArrayList;

public class ambienteTeste {
    static tiposDeOrdenacao ordenador = new tiposDeOrdenacao();
    // metodo para calcular diferenca de tempo para cada ordenacao
    public static ArrayList<Long> gerar_Lista_Teste(ArrayList<Long> tempos, int tamanho_vetor,int numero_testes) {
        int i = 0;
        while (i <numero_testes) {
            int[] v = new int[tamanho_vetor];
            ordenador.geraVetor(v);
            long inicio = tiposDeOrdenacao.calcular_Tempo_ordenacao() ;
            ordenador.ordernarInsercao(v);
            long fim = tiposDeOrdenacao.calcular_Tempo_ordenacao();
            tempos.add(fim - inicio);
            i++;
        }
        return tempos;
    }
    public static void main(String[] args) {
        ArrayList <Long> teste1 = new ArrayList<>();
        // gera uma lista de tempos no terminal
        System.out.println("ArrayList com respectivos tempos de ordenacao:");
        System.out.print("\n");
        System.out.print(gerar_Lista_Teste(teste1,160000,100));
      

    }
}
