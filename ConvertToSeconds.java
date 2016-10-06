
/*
	Program that allows to convert to seconds the any amount of hours within a full day [00:00:00 - 24:00:00]

	Pedro Pereirinha - 25620 - LEIC - 2016/17
	
*/

import java.util.Scanner;

public class ConvertToSeconds {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in).useDelimiter(":|\\p{javaWhitespace}+");

		System.out.print("Introduzir as horas a converter (hh:min:seg): ");

		int hourIn = input.nextInt();
		int minIn = input.nextInt();
		int secIn = input.nextInt();

		boolean timeIsValid;

		if (hourIn == 24) {
			timeIsValid = minIn == 0 && secIn == 0;
		} else {
			timeIsValid = hourIn >= 0 && hourIn < 24 && minIn >= 0 && minIn < 60 && secIn >= 0 && secIn < 60;
		}

		if (timeIsValid) {
			int seconds = hourIn * 3600 + minIn * 60 + secIn;

			System.out.println("*** A converter ***");
			System.out.printf("%d:%d:%d --> %d segundos\n", hourIn, minIn, secIn, seconds);
		} else {
			System.out.println("A hora introduzida não é válida.");
		}
	}
}