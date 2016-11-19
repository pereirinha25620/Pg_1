import java.util.Scanner;

public class Euclide {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		//int x = 48;
		//int y = 30;
		int remainder;
		int mdc = 0;

		do {
			remainder = x%y;
			if (remainder != 0) {
				x = y;
				y = remainder;
			} else {
				mdc = y;
			}
		} while (remainder != 0);

		System.out.println("mdc = " + mdc);
	}
}