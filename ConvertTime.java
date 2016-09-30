import java.util.Scanner;

public class ConvertTime {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduzir os segundos: ");
		int seconds = input.nextInt();

		int hour = seconds / 3600;

		seconds = seconds - (hour*3600);

		int minutes = seconds / 60;

		seconds = seconds - (minutes*60);

		System.out.printf("%dh%dm%ds\n",hour , minutes, seconds);
		
	}
}