import java.util.Scanner;

public class CountEquals {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Introduza 4 números");

		int x1 = input.nextInt();
		int x2 = input.nextInt();
		int x3 = input.nextInt();
		int x4 = input.nextInt();

		// Conjunto de variáveis de resultado
		int num = 0;
		int num2 = 0;
		int n = 0;

		// Combinações
		boolean x1x2 = x1==x2;
		boolean x1x3 = x1==x3;
		boolean x1x4 = x1==x4;
		boolean x2x3 = x2==x3;
		boolean x2x4 = x2==x4;
		boolean x3x4 = x3==x4;

		// Verificar se há 4 números iguais
		boolean fourEquals = x1x2 && x2x3 && x3x4;
		// Se não, verificar se há 3 números iguais
		boolean threeEqualsX1 = (x1x2 && x1x3) || (x1x3 && x1x4) || (x1x2 && x1x4);
		boolean threeEqualsX2 = (x2x3 && x2x4);
		// Se não, verificar se há 2 números iguais
		boolean twoEqualsX1 = x1x2 || x1x3 || x1x4;
		boolean twoEqualsX2 = x2x3 || x2x4;
		boolean twoEqualsX3 = x3x4;

		// Existem 2 conjuntos de 2 números iguais
		boolean twoPairs = false;
		
		// Igualdade
		if (fourEquals) {
			n = 4;
			num = x1;
		} else if (threeEqualsX1) { // 3 números iguais a X1
			n = 3;
			num = x1;
		} else if (threeEqualsX2) { // 3 números iguais a X2
			n = 3;
			num = x2;
		} else if (twoEqualsX1) { // 2 números iguais a X1
			n = 2;
			num = x1;
			if (x2x3 || x2x4){
				num2 = x2;
				twoPairs = true;
			} else if (x3x4) {
				num2 = x3;
				twoPairs = true;
			}
		} else if (twoEqualsX2) { // 2 números iguais a X2
			n = 2;
			num = x2;
			if (x1x3 || x1x4){
				num2 = x1;
				twoPairs = true;
			}
		} else if (twoEqualsX3) { // 2 números iguais a X3
			n = 2;
			num = x3;
			if (x1x2){
				num2 = x1;
				twoPairs = true;
			}
		} else {
			System.out.println("Não há números iguais.");
		}
		
		if (n != 0 && twoPairs) {
			System.out.printf("Existem %d números iguais a %d e a %d\n", n, num, num2);	
		} else if (n != 0 && !twoPairs) {
			System.out.printf("Existem %d números iguais a %d\n", n, num);	
		}

		System.out.println("\nO conjunto introduzido foi: ");
		if (x1 % 2 == 0) {
			System.out.printf("A: %d - número PAR\n", x1);
		} else {
			System.out.printf("A: %d - número ÍMPAR\n", x1);
		}
		if (x2 % 2 == 0) {
			System.out.printf("B: %d - número PAR\n", x2);
		} else {
			System.out.printf("B: %d - número ÍMPAR\n", x2);
		}
		if (x3 % 2 == 0) {
			System.out.printf("C: %d - número PAR\n", x3);
		} else {
			System.out.printf("C: %d - número ÍMPAR\n", x3);
		}
		if (x4 % 2 == 0) {
			System.out.printf("D: %d - número PAR\n", x4);
		} else {
			System.out.printf("D: %d - número ÍMPAR\n", x4);
		}
	}
}