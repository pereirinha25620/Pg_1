
import java.util.Scanner;

public class TempConvert {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza uma temperatura em ºC: ");

		double tempC = input.nextDouble();

		input.close();

		System.out.printf("\nA temperatura de %.2fºC equivale a:\n", tempC);
		System.out.printf("F = %.2f\n", convertCtoF(tempC));
		System.out.printf("K = %.2f\n", convertFtoK(convertCtoF(tempC)));
		System.out.printf("R = %.2f\n", convertKtoR(convertFtoK(convertCtoF(tempC))));
	}

	public static double convertCtoF(double tempC) {
		return 9/5.0 * tempC + 32;
	}

	public static double convertFtoK(double tempF) {
		return 5/9.0 * (tempF - 32) + 273.15;
	}

	public static double convertKtoR(double tempK) {
		return 9/5.0 * tempK;
	}

}