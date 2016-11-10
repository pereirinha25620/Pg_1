
import java.util.Scanner;

public class Oct2Dec {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an Octal number [0-8]: ");
		String octal = input.nextLine();

		long decNumber = 0;

		for (int i = 0, pow = octal.length() - 1; i < octal.length(); i++, pow--) {
			int c = octal.charAt(i) - '0';
			decNumber += c * Math.pow(8, pow);
		}

		System.out.println("Octal number: " + octal + " -> Decimal: " + decNumber);
	}
}