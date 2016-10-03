
import java.util.Scanner;

public class ConvertToSeconds {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in).useDelimiter(":|\\p{javaWhitespace}+");

		System.out.print("Introduzir as horas a converter (hh:min:seg): ");

		int hourIn = input.nextInt();
		int minIn = input.nextInt();
		int secIn = input.nextInt();

		int seconds = hourIn * 3600 + minIn * 60 + secIn;

		System.out.println("*** A converter ***");
		System.out.printf("%d:%d:%d --> %d segundos\n", hourIn, minIn, secIn, seconds);

	}
}