import java.util.Scanner;

public class Fichas {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduza as notas das 4 fichas: ");
		int f1 = input.nextInt();
		int f2 = input.nextInt();
		int f3 = input.nextInt();
		int f4 = input.nextInt();

		int n1 = f1;
		int n2 = 0, n3 = 0;

		if (f2 > n1) {
			n2 = n1;
			n1 = f2;
		} else {
			n2 = f2;
		}

		if (f3 > n1) {
			n3 = n2;
			n2 = n1;
			n1 = f3;
		} else if (f3 > n2) {
			n3 = n2;
			n2 = f3;
		} else {
			n3 = f3;
		}

		if (f4 > f1) {
			n3 = n2;
			n2 = n1;
			n1 = f4;
		} else if (f4 > n2) {
			n3 = n2;
			n2 = f4;
		} else if (f4 > n3){
			n3 = f4;
		}

		double media = (n1 + n2 + n3)/3.0;

		if (media >= 8) {
			System.out.printf("Média = (%d + %d + %d)/3 = %.2f\n", n1, n2, n3, media);
		} else {
			System.out.println("Reprovado.");
		}
	}
}