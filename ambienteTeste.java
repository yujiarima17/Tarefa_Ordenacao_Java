import java.util.ArrayList;

public class ambienteTeste {
    static tiposDeOrdenacao ordenador = new tiposDeOrdenacao();
    // método para calcular diferenca de tempo para cada ordenação;
    public static ArrayList<Long> gerar_Lista_Teste(ArrayList<Long> tempos, int tamanho_vetor,int numero_testes) {
        int i = 0;
        // laço while para gerar amplitude do teste;
        while (i <numero_testes) {
            int[] v = new int[tamanho_vetor];
            ordenador.geraVetor(v);
            // tempo pré-teste;
            long inicio = tiposDeOrdenacao.calcular_Tempo_ordenacao() ;
            ordenador.ordernarInsercao(v);
            // tempo pré-teste;
            long fim = tiposDeOrdenacao.calcular_Tempo_ordenacao();
            // duração do teste ;
            tempos.add(fim - inicio);
            i++;
        }
        // lista com os temps unitários dos testes;
        return tempos;
    }
    public static void main(String[] args) {
        // arrayList que armazena os valores dos tempos;
        ArrayList <Long> array_tempos = new ArrayList<>();
        // gera uma lista de tempos no terminal;
        System.out.println("ArrayList com respectivos tempos de ordenacao:");
        System.out.print("\n");
        System.out.print(gerar_Lista_Teste(array_tempos,,));
      

    }
}
