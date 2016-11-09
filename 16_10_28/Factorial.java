/**
Author: Pedro Pereirinha
Date: 09/11/2016
*/

import java.util.Scanner;

public class Factorial {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate its factorial: ");
		int n = input.nextInt();
		
		long num = n, fact = 1;
		long startTime = System.currentTimeMillis();
		while (num >= 1) {
			fact *= num;
			num--;
		}
		System.out.printf("The factorial of %d is %d\n", n, fact);
		System.out.println("Executed in " + (System.currentTimeMillis() - startTime) + " ms");
	}
}