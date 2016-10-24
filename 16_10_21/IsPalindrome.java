import java.util.Scanner;

public class IsPalindrome {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduza um número inteiro: ");
		String num = input.nextLine();

		boolean isPalindrome = false;

		for (int i = 0; i < num.length() / 2; i++) {
			isPalindrome = num.charAt(i) == num.charAt(num.length() - 1 - i);
		}

		if (isPalindrome) System.out.println(num + " é capicua.");
		else System.out.println(num + " não é capicua.");
	}
}