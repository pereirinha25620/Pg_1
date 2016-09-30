
import java.util.Scanner;

public class Sphere {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\nIntroduzir o diâmetro da esfera e unidades (separados por um espaço):");

		double diameter = input.nextDouble();

		String uni = input.next();

		double radius = diameter / 2.0;

		double volume = 4/3.0 * Math.PI * Math.pow(radius, 3);

		System.out.printf("Para um diâmetro de %.2f %s:\n - Raio = %.2f %s\n - Volume = %.2f %s^3\n", diameter, uni, radius, uni, volume, uni);

	}
}