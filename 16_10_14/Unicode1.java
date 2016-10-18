import java.util.Scanner;

public class Unicode1 {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduza um caractér: ");
		char inChar = input.next().charAt(0);
		int inInt = (int)inChar;
		
		boolean isRepresentable = inInt >= 33 && inInt <= 126;
		boolean isDigit = inInt >= 48 && inInt <= 57;
		boolean isUpperCase = inInt >= 65 && inInt <= 90;
		boolean isLowerCase = inInt >= 97 && inInt <= 122;

		if (isRepresentable) {
			if (isDigit) {
				System.out.printf("%c é dígito.\n", inChar);
			} else if (isUpperCase) {
				System.out.printf("%c é maiúscula.\n", inChar);
			} else if (isLowerCase) {
				System.out.printf("%c é minúscula.\n", inChar);
			} else {
				System.out.printf("%c é um símbolo.\n", inChar);
			}
		} else {
			System.out.println("O caractér não é representável");
		}
	}
}