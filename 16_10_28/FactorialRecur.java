
import java.util.Scanner;

public class FactorialRecur {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n = Long.parseLong(input.nextLine());

		long startTime = System.currentTimeMillis();
		System.out.println(getFactorial(n));
		System.out.println("Executed in " + (System.currentTimeMillis() - startTime) + " ms");

	}

	static private long getFactorial(long num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num*getFactorial(num-1);
		}
	}
}