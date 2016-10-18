
import java.util.Scanner;

public class DecToBinRecur {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Introduzir o número de base decimenal a converter para binário: ");
		long decInitialValue = input.nextLong();

		System.out.println(convToBin(decInitialValue));
		
	}
	
	static String convToBin(long binInt) {
		String out = "";
		if (binInt > 2) {
			out = binInt % 2 + out;
			out = convToBin(binInt/2) + out;
		} else if (binInt == 2) {
			out += "10";
		}
		return out;
	}	
}
