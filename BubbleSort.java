import java.util.Random;


public class BubbleSort {
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

    public static int[] bubbleSort(int[] vetor){
        for(int ref = vetor.length - 1; ref > 0; ref--){
            for(int i = 0; i < ref; i++){
                if(vetor[i] > vetor[i+1]){
                int temp = vetor[i+1];
                vetor[i+1] = vetor[i];
                vetor[i] = temp;
                }
            }
        }
        return vetor;
    }
    

    public static void main(String[] args) {
        int[] vetorTeste = gerarVetor(15);
        int[] teste = bubbleSort(vetorTeste);
        for (int i = 0; i < vetorTeste.length; i++){
            System.out.println(teste[i]);
        }
    }
}