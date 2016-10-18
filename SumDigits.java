
import java.util.Scanner;

public class SumDigits {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduz um número inteiro de 4 digitos:");
		int toSum = input.nextInt();    // Guarda o número a somar

		int sum = toSum % 10; 			// Crias uma variável onde vai ser guardado o resultado e inicializas com o primeiro número
		toSum = toSum / 10;				// Do número inicial retiras o digito da direita (1)
		sum = sum + toSum % 10;			// actualizas a variável final com o seu valor actual + outra parcela do número inicial (2)
		toSum = toSum / 10;				// Repete o passo (1)
		sum = sum + toSum % 10;			// Repete o passo (2)
		toSum = toSum / 10;				// Repete o passo (1)
		sum = sum + toSum;				// Repete o passo (2)

		System.out.println("O resultado é: " + sum);

	}
}