package src;

public class RecursivoInverteVetor {
    
    /**
     * Questao 1: inverte recursivamente o vetor e devolve o proprio vetor invertido.
     */

    
    public static int[] inverteVetor(int[] vetor, int i){
        if(i >= vetor.length / 2){
            return vetor;
        }
        int temp = vetor[i];
        vetor[i] = vetor[vetor.length - 1 - i];
        vetor[vetor.length - 1 - i] = temp;
        return inverteVetor(vetor, i + 1);
    }

    /**
     * Questao 1: percorre recursivamente e imprime os numeros do vetor em ordem inversa.
     */
    public static int inverteVetorInt(int[] vetor, int i){
        if(i >= vetor.length){
            return 0;
        }
        else{
            System.out.println(vetor[vetor.length - 1 - i]);
            return inverteVetorInt(vetor, i + 1);
        }
    }

    /* ==================================================================== */
    
    /**
     * Questao 2: Numero de vogais de uma String
     */
    public static int contarVogais(String String){
        return(contaVogais(String, 0));
    }

    private static int contaVogais(String string, int i){
        if(i >= string.length()){
            return 0;
        }

        char c = string.toLowerCase().charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return contaVogais(string, i + 1) + 1;
        }
        else{
            return contaVogais(string, i + 1);
        }
    }



    /* ==================================================================== */
    
    /**
     * Questao 3: verifica recursivamente se uma String e palindromo.
     */
    public static boolean ehPalindromo(String string){
        return verificaPalindromo(string.toLowerCase(), 0);
    }

    private static boolean verificaPalindromo(String string, int i){
        if(i >= string.length() / 2){
            return true;
        }

        if(string.charAt(i) != string.charAt(string.length() - 1 - i)){
            return false;
        }

        return verificaPalindromo(string, i + 1);
    }

     /* ==================================================================== */
    
    /**
     * Questao 6: encontra maior e menor por comparacao em pares.
     * Retorna vetor no formato [maior, menor].
     */
    public static int[] maiorMenorPorPares(int[] A){
        if(A == null || A.length == 0){
            throw new IllegalArgumentException("O vetor deve ter pelo menos um elemento.");
        }

        int maior;
        int menor;
        int i;

        if(A.length % 2 == 0){
            if(A[0] > A[1]){
                maior = A[0];
                menor = A[1];
            }
            else{
                maior = A[1];
                menor = A[0];
            }
            i = 2;
        }
        else{
            maior = A[0];
            menor = A[0];
            i = 1;
        }

        while(i < A.length - 1){
            int maiorPar;
            int menorPar;

            if(A[i] > A[i + 1]){
                maiorPar = A[i];
                menorPar = A[i + 1];
            }
            else{
                maiorPar = A[i + 1];
                menorPar = A[i];
            }

            if(maiorPar > maior){
                maior = maiorPar;
            }
            if(menorPar < menor){
                menor = menorPar;
            }

            i += 2;
        }

        return new int[] {maior, menor};
    }

    public static void main(String[] args) {
        int[] vetor = new int[] {1,2,3,4,5,6,7,8,9};
        int[] vetorInvertido = inverteVetor(vetor, 0);
        for (int i = 0; i < vetorInvertido.length; i++){
            System.out.println(vetorInvertido[i]);
        }
        inverteVetorInt(vetorInvertido, 0);
    }    
}
