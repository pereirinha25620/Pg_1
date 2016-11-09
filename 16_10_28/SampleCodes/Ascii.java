/**
Program to generate a ASCII Table
Author: Matilde Pato
e-mail address: mpato@deetc.isel.pt
Last changed: March 10, 2016
*/
public class Ascii{
	public static void main(String[] args) {
		// Generate a ASCII Table
		int i = 32;	
		int x=0b00100000;
	
		// '\t' e' o TAB (tabulation)
		System.out.println("Code  \t Caracter"); 
		System.out.println("----------------------"); 
		while (i <= 128) {
			System.out.println(i + " \t " + (char)i);
			++i; // increment
		}
	}
}
