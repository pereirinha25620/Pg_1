import java.util.Scanner;

public class Hipotenusa {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduza o valor dos catetos: ");

		int c1 = input.nextInt();
		int c2 = input.nextInt();
		double hip = 0;

		boolean catValidos = c1 > 0 && c2 > 0 ;

		if (catValidos) {
			hip = Math.sqrt(c1*c1 + c2*c2);
			System.out.printf("Hipotenusa = %.2f\n", hip);
		} else {
			System.out.println("Catetos inválidos");
		}

	}
}