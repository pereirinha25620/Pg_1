import java.util.Scanner;

public class JoinInterval {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("introduzir o intervalo A: ");

		int a1 = input.nextInt();
		int a2 = input.nextInt();

		System.out.println("introduzir o intervalo B: ");
		int b1 = input.nextInt();
		int b2 = input.nextInt();

		int min1 = 0;
		int max1 = 0;
		int min2 = 0;
		int max2 = 0;

		boolean hasIntersection = true;

		if (a1 <= b1) {
			if (a2 > b1) {
				
				min1 = b1;

				if (a2 >= b2) {
					max2 = a2;
				} else {
					max2 = b2;
				}

			} else if (a2 = b1) {
				// UM ponto
			}
			else {
				/*
				min1 = a1;
				max1 = a2;
				min2 = b1;
				max2 = b2;
				*/
				hasIntersection = false;
			}
		} else {
			if (b2 >= a1) {
				
				min1 = a1;

				if (b2 >= a2) {
					max2 = b2;
				} else {
					max2 = a2;
				}

			} else {
				/*
				min1 = b1;
				max1 = b2;
				min2 = a1;
				max2 = a2;
				*/
				hasIntersection = false;
			}
		}

		if (hasOneinterval) {
			System.out.printf("A união dos intervalos corresponde a [%d, %d]\n", min1, max2);
		} else {
			System.out.printf("A união dos intervalos corresponde a [%d, %d] + [%d, %d]\n", min1, max1, min2, max2);
		}
	}
}