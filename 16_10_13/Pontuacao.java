
import java.util.Scanner;

public class Pontuacao {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduza o número de partidas, vitórias e derrotas: ");

		int jogos = input.nextInt();
		int vit = input.nextInt();
		int der = input.nextInt();
		int emp = jogos - vit - der;

		if (emp > 0) {
			System.out.println("A pontuação é igual a " + (3 * vit + emp));
		} else {
			System.out.println("A pontuação é igual a " + (3 * vit));
		}
	}
}