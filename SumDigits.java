
import java.util.Scanner;

public class SumDigits {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza um número inteiro:");

		int toSum = input.nextInt();
		// int toSum = 123;

		int sum = toSum % 10;
		toSum = toSum / 10;
		sum = sum + toSum % 10;
		toSum = toSum / 10;
		sum = sum + toSum;

		System.out.println("O resultado é: " + sum);

	}

}