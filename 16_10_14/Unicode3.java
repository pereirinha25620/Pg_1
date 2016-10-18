import java.util.Scanner;

public class Unicode3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduzir uma leta: ");
		char inChar = input.next().charAt(0);
		int asciiChar = inChar;

		boolean isUpperCase = asciiChar >= 65 && asciiChar <= 90;
		boolean isLowerCase = asciiChar >= 97 && asciiChar <= 122;

		int asciiSwapCase;
		char swapCaseChar;

		if (isUpperCase) {
			asciiSwapCase = asciiChar + 32;
			swapCaseChar = (char)asciiSwapCase;
			System.out.printf("ASCII: %d; Minúscula: %c\n", asciiChar, swapCaseChar);
		}
		else if (isLowerCase) {
			asciiSwapCase = asciiChar - 32;
			swapCaseChar = (char)asciiSwapCase;
			System.out.printf("ASCII: %d; Maiúscula: %c\n", asciiChar, swapCaseChar);
		}
	}
}