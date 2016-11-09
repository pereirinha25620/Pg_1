/**
Program that indicates the number of days, giving the month and year.
In this program we use switch-case instruction
Author: Matilde Pato
e-mail address: mpato@deetc.isel.pt
Last changed: October 29, 2016
*/
import java.util.Scanner;

public class SwitchMonth{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Year: ");
	int year = in.nextInt();
	in.nextLine(); /// IMPORTANT

	/* nextInt(), next() does not consume the ENTER after the year is entered, 
	so nextLine() consumes it, leaving you with an empty string. 
	One way around this is to always use nextLine():*/
	
	System.out.println("Enter month: (lowercase)");
	String month = in.nextLine();

//String month = ""
	switch (month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
		System.out.println("No. of days: 31");
		break;
		case "april":
		case "june":
		case "september":
		case "november":
		System.out.println("No. of days: 30");
		break;
		case "february":
			if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))
		 	System.out.println("No. of  days: 29");

		 else
			System.out.println("No. of days: 28");
		break;
		default:
		System.out.println("Wrong month entered.");
		break;
	}
	in.close();     
}
}