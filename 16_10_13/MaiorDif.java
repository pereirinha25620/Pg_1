/*
	Programação 1 - 2016/17
	Exercício 3 - Ficha de Exercícios 1 - Aula 13/10/2016
	Pedro Pereirinha, Fábio Teixeira e Bruno Anjos - LI11N
*/

import java.util.Scanner;

public class MaiorDif {
	
	public static void main (String[] args)	{

		Scanner input = new Scanner(System.in);

		System.out.println("Introduza quatro números inteiros (separados por um espaço)");

		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int n4 = input.nextInt();

		int min = n1; 								
		int max = n1; 

		if (n2 < min) min = n2;
		else if (n2 > max) max = n2;
		if (n3 < min) min = n3;
		else if (n3 > max) max = n3;
		if (n4 < min) min = n4;
		else if (n4 > max) max = n4;

		System.out.println("A maior diferença é " + (max - min));
	}
}