import java.util.Scanner;

public class InterInterval {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduzir o intervalo A (inteiros separados por um espaço): ");
		int a1 = input.nextInt();
		int a2 = input.nextInt();

		System.out.println("Introduzir o intervalo B (inteiros separados por um espaço): ");
		int b1 = input.nextInt();
		int b2 = input.nextInt();

		int min = 0;
		int max = 0;

		boolean hasIntersection = true;
		boolean interIsAPoint = false;

		if (a1 < b1) {
			if (a2 == b1) { 
				min = a2; 
				interIsAPoint = true;
			} else if (b1 < a2) {
				min = b1;
				if (a2 <= b2) max = a2;
				else max = b2;
			} else {
				hasIntersection = false;
			}	
		} else {
			if (b2 == a1) { 
				min = b2; 
				interIsAPoint = true; 
			} else if (a1 < b2) {
				min = a1;
				if (b2 <= a2) max = b2;
				else max = a2;
			} else {
				hasIntersection = false;
			}
		}

		if (hasIntersection && interIsAPoint) {
			System.out.printf("A intersecção dos intervalos corresponde a [%d]\n", min);
		} else if (hasIntersection) {
			System.out.printf("A intersecção dos intervalos corresponde a [%d, %d]\n", min, max);
		} else {
			System.out.println("Não há intersecção.");
		}
	}
}