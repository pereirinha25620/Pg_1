/**
Program to converts Hexadecimal2Decimal.
precondition:  str - input - is a string between 0 - 9 and A - F
Author: Matilde Pato
e-mail address: mpato@deetc.isel.ipl.pt
Last changed: March 10, 2016
*/
import java.util.*;

public class Hexa2Decimal{
	public static void main(String[] args){

     System.out.println("Enter a hexadecimal number (0 - 9 and A - F)?");
     Scanner keyboard = new Scanner(System.in);
     String str = keyboard.nextLine();
     //str = str.toUpperCase();
     String newstr = "";

     // toUpperCase manually
     for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
            newstr = newstr + str.charAt(i);
         else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            newstr = newstr + str.charAt(i);
        else
            newstr = newstr + (char)(str.charAt(i) - ('a' - 'A'));
     }

    	/*String digits = "0123456789ABCDEF";
        
        int result = 0;
        for (int i = 0; i < newstr.length(); i++) {
            char c = newstr.charAt(i);
            int d = digits.indexOf(c); //Searches for the first occurrence of a character or substring
            result = 16*result + d;            
        }*/

/**
Using array
*/

    // For storing remainder
    int rem;

     // For storing result
    int result = 0, i = 0; 

     // Digits in hexadecimal number system
    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    while (i < newstr.length()){
        char c = newstr.charAt(i); 
        // For storing remainder
        if (c < '0' || c > '9') { // Is a word
                rem = c - 'A' + 10; // Convert to a number, ex: F -> 15
                result = 16*result + (hex[rem] - 'A' + 10);
            } 
            else {
            rem = c - '0'; // convert char to a number. Ex: '2' -> 2
            result = 16*result + (hex[rem] - '0');
        } 
        i++;
    }

    System.out.printf("The value is: %s. \n", result);

    System.out.println("And, using \'parseInt method\' is: " + 
        Integer.parseInt(str, 16) + ".");
}
}