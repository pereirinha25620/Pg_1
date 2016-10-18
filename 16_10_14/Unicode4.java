import java.util.Scanner;

public class Unicode4 {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Introduzir duas letras maiúsculas: ");
		char l1 = input.next().charAt(0);
		char l2 = input.next().charAt(0);

		int l1Ascii = l1;
		int l2Ascii = l2;

		int offset = l2 > l1 ? l2 - l1 + 1: l1 - l2 + 1;

		System.out.printf("Letra %c e Letra %c, existem %d letras no alfabeto.\n", l1, l2, offset);
	}
}