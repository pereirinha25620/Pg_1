
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Introduza o número de linhas: "); 
		int lin = input.nextInt();
		int col = 2*lin - 1;

		byte[][] triang = new byte[lin][col];

		fillTriangMethod1(triang);

		//printTriang(triang);
		System.out.println();

		fillTriangMethod2(triang);

		//printTriang(triang);
	}

	// Method 1
	static void fillTriangMethod1(byte[][] triang) {
		long startTime = System.currentTimeMillis();
		for (int i = 0, col = triang[i].length; i < triang.length; i++) {
			int lim = col / 2 - i;
			for (int j = 0; j < triang[i].length; j++) {
				if (j >= lim && j < col - lim) triang[i][j] = 1;
			}
		}
		System.out.println("Method 1 - Executed in " + (System.currentTimeMillis() - startTime) + " ms");
	}

	// Method 2

	static void fillTriangMethod2(byte[][] triang) {
		long startTime = System.currentTimeMillis();
		for (int l = 0; l < triang.length; l++){
			for (int c = triang[l].length/2 - l; c <= triang[l].length/2 + l; c++) {
				triang[l][c] = 1;
			}
		}
		System.out.println("Method 2 - Executed in " + (System.currentTimeMillis() - startTime) + " ms");
	}

	static void printTriang(byte[][] triang) {
		for (int i = 0, col = triang[i].length; i < triang.length; i++) {
			for (int j = 0; j < triang[i].length; j++) {
					if (triang[i][j] != 0) System.out.print(triang[i][j] + " ");
					else System.out.print("  ");
			}
			System.out.println();
		}
	}
}