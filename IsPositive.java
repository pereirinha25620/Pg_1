
import java.util.Scanner;

public class IsPositive {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\nIntroduza um número inteiro:");

		int num = input.nextInt();

		boolean isPositive = num > 0;
		boolean isNegative = num < 0;

		if (isPositive) System.out.println(num + " é positivo");
		else if (isNegative) System.out.println(num + " é negativo");
		else System.out.println("É ZERO!");

	}
}