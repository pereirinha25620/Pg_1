
import java.util.Scanner;

public class Bin2Dec {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		boolean binNumberIsValid = false;
		String binNumber = "";
		
		while (!binNumberIsValid) {
			System.out.print("Enter a binary number: ");
			binNumber = input.nextLine();

			for (int i=0; i < binNumber.length(); i++) {
				char c = binNumber.charAt(i);
				if (c < '0' || c > '1') {
					binNumberIsValid = false;
					break;
				} else {
					binNumberIsValid = true;
				}
			}
			if (!binNumberIsValid) System.out.println("Binary number is not valid. Type again.");
			else break;
		}

		long decNumber = 0;

		for (int i = 0, pow = binNumber.length() - 1; i < binNumber.length(); i++, pow--) {
			int num = binNumber.charAt(i) - '0';
			decNumber += num*(int)Math.pow(2, pow);
		}
		System.out.println("\nBinary: " + binNumber + " -> Decimal: " + decNumber);
	}
}