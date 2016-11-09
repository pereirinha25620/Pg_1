/**
Program to convert String to Integer number
Author: Matilde Pato
e-mail address: mpato@deetc.isel.pt
Last changed: October 29, 2016
*/
import java.util.Scanner;
public class StringToInt {
	public static void main(String[] args) {
		System.out.println("StringToInt");
		Scanner input = new Scanner(System.in);
		// Read string
		System.out.println("String: ");
		String s = input.nextLine();
		boolean isNumber = true; // Assume initially that is a number
		// Iteration index
		int i = 0;
		// String length
		int len = s.length();
		char ch;
		int digit, number = 0;		
		while (i < len && isNumber) {
			ch = s.charAt(i); // Get char
			if (ch < '0' || ch > '9') {
				isNumber = false; // In order to break the while loop
			}
			else { 
				digit = ch - '0'; // Convert char to number
				number = number*10 + digit; // Number construction
			}
			i++; // Increment i by one
		}		
		// If is number
		if (isNumber) {
			System.out.println(number + " is a number");
			System.out.print("> 100 ? ");
			if (number > 100)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else // Not number
			System.out.println(s + " isn't a number");
			
	}
}

/*
StringToInt
String: 
123
123 is a number
> 100 ? Yes

----
StringToInt
String: 
12a
12a isn't a number
 */ 