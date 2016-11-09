import java.util.Scanner;

public class FibonacciRecur {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n = input.nextLong();

		System.out.println(getFibo(n));
	}

	private static long getFibo(long n) {
		long fibNum = 0;
		if (n > 0) {
			if (n == 1 || n == 2) {
				fibNum = 1;
			} else {
				fibNum = getFibo(n-1)+getFibo(n-2);
			}
		}
		return fibNum;
	}
}