import java.util.Scanner;

public class BilheteIdentidade {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduzir os 8 algarismos do CC e o dígito extra: ");

		int numCC = input.nextInt();
		int numVer = input.nextInt();

		int a, b, c, d, e, f, g, h;	

		h = numCC % 10;
		numCC = numCC / 10;
		g = numCC % 10;
		numCC = numCC / 10;
		f = numCC % 10;
		numCC = numCC / 10;
		e = numCC % 10;
		numCC = numCC / 10;
		d = numCC % 10;
		numCC = numCC / 10;
		c = numCC % 10;
		numCC = numCC / 10;
		b = numCC % 10;
		a = numCC / 10;

		int z = 9*a + 8*b + 7*c + 6*d + 5*e + 4*f + 3*g + 2*h + numVer;

		boolean isValid = z % 11 == 0;

		System.out.printf("CC número %d%d%d%d%d%d%d%d-%d é ", a, b, c, d, e, f, g, h, numVer);
		if (isValid) System.out.println("válido.");
		else System.out.println("inválido.");

	}
}