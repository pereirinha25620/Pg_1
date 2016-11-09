
import java.util.Scanner;

public class Fibonacci {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		long n = input.nextLong();

		long fibNumOne = 0, fibNumTwo = 0, fibNum = 0;

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == 2) {
				fibNumOne = 1;
			} else {
				fibNumTwo = fibNumOne;
				fibNumOne = fibNum;
			}
			fibNum = fibNumOne + fibNumTwo;
			System.out.print(fibNum + " ");
		}
		System.out.println();
	}
}