
import java.util.Scanner;

class HexToDex {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an hexadecimal number [0:9;A:F]: ");
		
		String hexInput = input.nextLine();
		String hexUpper = "";

		for (int c = 0; c < hexInput.length(); c++) {
			if (hexInput.charAt(c) >= 'a' && hexInput.charAt(c) <= 'z') {
				hexUpper += (char)(hexInput.charAt(c)-32);
			} else {
				hexUpper += hexInput.charAt(c);
			}
		}

		long decNumber = 0;

		for (int i = 0, pow = hexUpper.length() - 1; i < hexUpper.length(); i++, pow--) {
			char curChar = hexUpper.charAt(i);
			if (curChar >= '0' && curChar <= '9') {
				decNumber += (curChar - '0') * Math.pow(16, pow);
			} else {
				decNumber += (curChar - 'A' + 10) * Math.pow(16, pow);
			}
		}

		System.out.println("Hexadecimal: " + hexUpper + " -> Decimal: " + decNumber);
	}
}