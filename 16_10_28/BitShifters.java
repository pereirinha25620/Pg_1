/**
Author: Pedro Pereirinha
Date: 09/11/2016
*/

import java.util.Scanner;

public class BitShifters {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		boolean toShift = true;

		while (toShift) {
			System.out.print("Enter a number: ");
			long num = Long.parseLong(input.nextLine());

			System.out.print("Shift right or left (R/L): ");
			String dir = input.nextLine();

			System.out.print("Enter how many bits to shift: ");
			int disp = Integer.parseInt(input.nextLine());

			switch (dir) {
			case "R":
				System.out.println(num >> disp);
				break;
			case "L":
				System.out.println(num << disp);
			}

			while(true) {
				System.out.print("Continue? (Y/N) ");
				String toContinue = input.nextLine();

				if (toContinue.toLowerCase().equals("n")) {
					toShift = false;
					break;	
				} 
				else if (toContinue.toLowerCase().equals("y")) break;
				else continue;
			}
		}
	}
}