/**
Program to converts Base N to Decimal number.
precondition:  num - input - is a integer
Author: Matilde Pato
e-mail address: mpato@deetc.isel.ipl.pt
Last changed: March 10, 2016
*/
import java.util.*;

public class ConvertBaseN2Decimal{	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Read an integer
		System.out.println("Enter a number in a specific base (binary, octal or hexadecimal): ");
		String s = input.next(); // Read a string
		// Read the base which represent the number
		System.out.println("Base: ");
		int base = input.nextInt();
					
		int numBase10 = 0, i = s.length()-1;
		boolean isValid = true;
				
		int pow = 1, exp = 0, digit;
		// Loop while
		while (i >= 0 && isValid) {
			char ch = s.charAt(i); // Get char
			// Validate: number or letter
			if (ch < '0' || ch > '9')  // Is a letter
				digit = ch - 'A' + 10; // Convert to a number, ex: 'F' = 15		
			else digit = ch - '0'; // Convert char to a number, ex: '2' = 2
						
			if (digit >= base) {
				System.err.println("The number " + s + " is not representative of the base " + base);
				isValid = false;
			}
			else {
				numBase10 += digit*pow;
				// Iterative method for Math.pow(base, i) -> next iteration
				pow *= base;
				--i;  // decrement to get the char
			}
		}
		if (isValid)
			System.out.println("Conversion: " + s + "("+ base + ") -> " + numBase10 + "(10)");
	}
}
