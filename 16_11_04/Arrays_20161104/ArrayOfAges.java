/**
Reads ages from the user and shows which are above and which
are below the average of 20 person (maximum).
Author: Matilde P.M. Pato
email: mpato@deetc.isel.ipl.pt
date: April, 27 2016
*/
//package arrays;
import java.util.Scanner;
public class ArrayOfAges{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
				
		// int[] ages = new double[20];

		System.out.println("Enter people number in the room :" );//(0 - 20):");
		int index = keyboard.nextInt();
		
		if (index > 1)  System.out.println("Enter ages for " + 
			index + " subjects" );
		else System.out.println("Enter age for " + index + " a person" );
		
		int[] ages = new int[index];

		int sum = 0;
		for (int count = 0; count < index; count++){
			ages[count] = keyboard.nextInt();
			sum += ages[count];
		}

		int average = sum / ages.length;

		System.out.println("The average is " + average);

		char sep = '[';
		for (int i = 0; i < index; ++i){
			System.out.print(sep + " " + ages[i]);
			sep = ',';
		}
		if (ages.length != 0)
			System.out.println(']');

		// Display each temperature and its relation to the average:
		int countBelow = 0, countAbove = 0, countEqual = 0;
		
		/*System.out.print("There is ");
		for (int count = 0; count < index; count++){
			if (ages[count] < average)
				countBelow++;
			else if (ages[count] > average)
				countAbove++;
			else countEqual++;
		}*/
		System.out.print("There is ");
		for (int value : ages){
			if (value < average) countBelow++;
				else if (value > average) countAbove++;
					else countEqual++;
		}
		System.out.println(countBelow + " below average, " +
			countEqual + " equal to average and " +
			countAbove + " above average.");
		System.out.println("Done!");
	}
}