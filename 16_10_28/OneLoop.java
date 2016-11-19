
import java.util.Scanner;

public class OneLoop {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Quantos nomes tens? ");
		int nrNomes = input.nextInt(); input.nextLine();

		String nomeCompleto = "";

		/** For loop
		for (int n = 1; n <= nrNomes ; n++) {
			System.out.print(n + "º nome: ");
			nomeCompleto += input.nextLine() + " ";
		}
		*/

		/* DO-WHILE
		int i = 1;

		do {
			System.out.print(i + "º nome: ");
			nomeCompleto += input.nextLine() + " ";
			i++;
		} while (i <= nrNomes);
		*/

		int j = 1;

		while (j <= nrNomes) {
			System.out.print(j + "º nome: ");
			nomeCompleto += input.nextLine().trim() + " ";
			j++;
		}

		System.out.println(nomeCompleto.trim());

	}
}