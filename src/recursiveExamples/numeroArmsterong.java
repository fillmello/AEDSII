package src.recursiveExamples;

public class numeroArmsterong {
	private static int numeroOriginal;

	public static boolean ehArmstrong(int numero) {
		if (numero < 0) {
			return false;
		}
		numeroOriginal = numero;
		int tamanho = 0;
		for (int n = numero; n > 0; n /= 10) {
			tamanho++;
		}
		if (numero == 0) {
			tamanho = 1;
		}
		return ehArmstrong(numero, 0, 0, tamanho);
	}

	private static boolean ehArmstrong(int numero, int soma, int indice, int tamanho) {
		if (numeroOriginal == soma && indice == tamanho) {
			return true;
		}

		if (indice != tamanho) {
			return ehArmstrong(
				numero / 10,
				soma + (int) Math.pow(numero % 10, tamanho),
				indice + 1,
				tamanho
			);
		}

		else {
			return false;
		}
	}
}
