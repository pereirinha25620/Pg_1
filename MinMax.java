
import java.util.Scanner;
import java.util.InputMismatchException;

public class MinMax {
	
	public static void main (String[] args) {

		System.out.println("Introduza quatro valores inteiros.");

		int min, max;

		Scanner input = new Scanner(System.in);
		int n1, n2, n3, n4;

		long starTime = System.currentTimeMillis();

		try {
			n1 = input.nextInt();
			min = n1;
			max = n1;

			n2 = input.nextInt();
			if (n2 < min) {
				min = n2;
			} else if (n2 > max ){
				max = n2;
			}

			n3 = input.nextInt();
			if (n3 < min) {
				min = n3;
			} else if (n3 > max ){
				max = n3;
			}

			n4 = input.nextInt();
			if (n4 < min) {
				min = n4;
			} else if (n4 > max ){
				max = n4;
			}

			long elapsedTime = System.currentTimeMillis() - starTime;
			System.out.printf("Os valores mínimo e máximo são: (%d, %d).\n", min, max);
			System.out.println("Execution time: " + elapsedTime);


		} catch (InputMismatchException e) {
			System.out.println("Valor inválido. Por favor introduza um número inteiro.");
		}

	}
}