import java.util.Scanner;

public class IsBIValid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduzir o número de BI: ");
		String bi = in.nextLine(); 
		
		String biCopy = bi.substring(0, 8) + bi.substring(bi.length()-1);
		
		int z = 0;
		
		for (int i = biCopy.length(); i > 0; i--) {
			z += i * (biCopy.charAt(biCopy.length()-i) - '0');
		}
		
		String output = z % 11 == 0 ? "válido": "inválido";
		
		System.out.printf("O número de identificação %s é %s.\n", bi, output);	
	}
}