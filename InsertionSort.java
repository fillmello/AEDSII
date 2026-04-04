import java.util.Random;


public class InsertionSort {
    static final int[] TAMANHOS_TESTE_GRANDE =  { 31_250_000, 62_500_000, 125_000_000, 250_000_000, 500_000_000 };
    static final int[] TAMANHOS_TESTE_MEDIO =   {     12_500,     25_000,      50_000,     100_000,     200_000 };
    static final int[] TAMANHOS_TESTE_PEQUENO = {          3,          6,          12,          24,          48 };
    static final double NANO_TO_MILLI = 1.0/1_000_000;
    static Random aleatorio = new Random();
    static long operacoes;
     
    /**
     * 
     * @param tamanho
     * @return
     */
    public static int[] gerarVetor(int tamanho){
        int[] vetor = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            vetor[i] = aleatorio.nextInt()%100;
        }
        return vetor;

    }

    public static int[] insertionSort(int[] vetor){
        for(int ref = 1; ref < vetor.length; ref++){
            boolean posicaoCerta = false;
            int temp = vetor[ref];
            for(int i = ref - 1; i >= 0 && !posicaoCerta; i--){
                if(temp < vetor[i]){
                    vetor[i + 1] = vetor[i];
                }
                else{ 
                    posicaoCerta = true;
                    vetor[i + 1] = temp;
                }
            }
        }
        return vetor;
    }
    

    public static void main(String[] args) {
        int[] vetorTeste = gerarVetor(15);
        int[] teste = insertionSort(vetorTeste);
        for (int i = 0; i < vetorTeste.length; i++){
            System.out.println(teste[i]);
        }
    }
}