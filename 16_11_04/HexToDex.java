
import java.util.Scanner;

class HexToDex {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number (0-9) and (A-F)");
		
		String hexInput = input.nextLine();
		String hexUpper = "";

		for (int c = 0; c < hexInput.length(); c++) {
			if (hexInput.charAt(c) >= 'a' && hexInput.charAt(c) <= 'z') {
				hexUpper += (char)(hexInput.charAt(c)-32);
			} else {
				hexUpper += hexInput.charAt(c);
			}
		}

		System.out.println(hexUpper);
	}
}