
import java.util.Scanner;

public class Senha {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int password = 1234;
		boolean isNotValid = false;
		int userPass = 0;

		do {
			System.out.println("Introduza a senha: ");
			userPass = input.nextInt();
			isNotValid = userPass != password;
		} while (isNotValid);

		System.out.println("Login successful!");
	}
}