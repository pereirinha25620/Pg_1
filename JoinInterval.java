import java.util.Scanner;

public class JoinInterval {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduzir o intervalo A (inteiros separados por um espaço): ");
		int a1 = input.nextInt();
		int a2 = input.nextInt();

		System.out.println("Introduzir o intervalo B (inteiros separados por um espaço): ");
		int b1 = input.nextInt();
		int b2 = input.nextInt();

		int min1 = 0;
		int max1 = 0;
		int min2 = 0;
		int max2 = 0;

		boolean hasOneInterval = true;

		if (a1 <= b1) {
			min1 = a1;
			if (a2 >= b1) {
				if (a2 >= b2) max2 = a2; 
				else max2 = b2; 
			} else {
				max1 = a2;
				min2 = b1;
				max2 = b2;
				hasOneInterval = false;
			}
		} else {
			min1 = b1;
			if (b2 >= a1) {
				if (b2 >= a2) max2 = b2;
				else max2 = a2;
			} else {
				max1 = b2;
				min2 = a1;
				max2 = a2;
				hasOneInterval = false;
			}
		}

		if (hasOneInterval) {
			System.out.printf("A união dos intervalos corresponde a [%d, %d]\n", min1, max2);
		} else {
			System.out.printf("A união dos intervalos corresponde a [%d, %d] + [%d, %d]\n", min1, max1, min2, max2);
		}

	}
}