
import java.util.Scanner;

public class Unicode2 {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduzir um caractér: ");
		char inChar = input.next().charAt(0);
		int asciiChar = inChar;
		
		boolean isUpperCase = asciiChar >= 65 && asciiChar <= 90;
		boolean isLowerCase = asciiChar >= 97 && asciiChar <= 122;

		int offSet;

		if (isUpperCase) {
			offSet = asciiChar - 64;
			System.out.printf("A letra %c é a %dª maiúscula.\n", inChar, offSet);
		} else if (isLowerCase) {
			offSet = asciiChar - 96;
			System.out.printf("A letra %c é a %dª minúscula.\n", inChar, offSet);
		} else {
			System.out.println("O caractér inserido não é uma letra.");
		}
	}
}