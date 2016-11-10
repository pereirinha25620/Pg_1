/**
Program to converts Binary2Decimal.
precondition:  num - input - is a integer 0 and 1
Author: Matilde Pato
e-mail address: mpato@deetc.isel.ipl.pt
Last changed: March 10, 2016
*/
import java.util.*;

public class Binary2Decimal{
	public static void main(String[] args){
    	
    	System.out.println("Enter a binary number?");
    	Scanner keyboard = new Scanner(System.in);

    	String str = keyboard.next();

     	// For storing result
    	int result = 0;

    	// 1st version
    	/*for (int i = 0; i < str.length(); i++){
        	if (str.charAt(i) == '1'){
            result += (int)Math.pow(2,str.length()-1-i);
            //int value = str.charAt(i) - '0'; // Minus the ASCII code of '0' to get the value of the charAt(i) 
         	//result += value * (int)Math.pow(2,str.length()-1-i);
     		}
     	}*/

    	// 2nd version
        /*if (str == "0") result = 0;
        for (int i = str.length()-1; i > 0 ; i--) {
            int value = str.charAt(i) - '0';         
            int base = 1, count = 0;
            while (count < str.length()-1-i){
            	base *= 2;
            	count++;
            }
            result = value*base + result; // string concatenation
     	}*/

    	// 3rd version
        /*String digits = "01";        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int d = digits.indexOf(c); //Searches for the first occurrence of a character or substring
            result = 2*result + d;   
            System.out.printf("%d %5d %10d \n", i, d, result);         
        }*/

    	// 4th version
		        
		// Digits in binary number system
		char bin [] = {'0','1'};
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // For storing remainder
            int rem = c - '0';
 v            result = 2*result + (bin[rem]-'0');   
        }

    System.out.printf("The value is: %d. \n", result);

    // Using a method from class Integer:: parseInt

    System.out.println("And, using \'parseInt method\' is: " + 
    	Integer.parseInt(str, 2) + ".");
	}
}