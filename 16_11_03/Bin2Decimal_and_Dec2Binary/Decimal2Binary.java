/**
Program to converts Decimal2Binary.
precondition:  num - input - is a nonnegative integer
Author: Matilde Pato
e-mail address: matilde.pato@gmail.com
Last changed: March 10, 2016
*/

import java.util.Scanner;
import java.lang.*;

public class Decimal2Binary
{
	public static void main(String[] args)
	{
    	
    	System.out.println("Enter a decimal number (0 - 9)?");
    	Scanner keyboard = new Scanner(System.in);
        Integer num = keyboard.nextInt();

    	String result = "";

        if (num == 0) result = Integer.toString(0);

        for (int auxn = num ; auxn > 0; auxn = auxn/2) {
            int digit = auxn % 2;         // rightmost digit
            //System.out.println("d " + digit);
            char ch = (char)(digit + '0');
            result = ch + result;
            //result = Integer.toString(digit) + result; // string concatenation
            //System.out.println("hexa " + result);

        };

        System.out.printf("The value is: %s. \n", result);

    /* calling method toBinaryString(): returns the string representation 
     of the unsigned integer value represented by the argument in Binary 
    (base 2) */
        String outputBinary = Integer.toBinaryString(num);
        System.out.println("And, using \'toBinaryString method\' is: " + 
    	   outputBinary + ".");
	}
}