import java.util.Scanner;

public class NotaFinal {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Média das FA: ");
		int mediaFA = input.nextInt();
		int notaTF = 0, mediaTP = 0;

		boolean reprovado = false;

		if (mediaFA >= 8) {
			System.out.print("Nota do TF: ");
			notaTF = input.nextInt();

			if (notaTF >= 8) {
				System.out.print("Média dos TP: ");
				mediaTP = input.nextInt();

				if (mediaTP < 8) {
					reprovado = true;
					System.out.println("Reprovado");	
				}

			} else {
				System.out.println("Reprovado");
			}

		} else {
			System.out.println("Reprovado");
		}
		
		if (!reprovado) {

			double notaFinal = (0.2*mediaFA + 0.4*(notaTF + mediaTP));

			boolean suf = notaFinal >= 10 && notaFinal <= 13;
			boolean bom = notaFinal >= 14 && notaFinal <= 15;
			boolean mtBom = notaFinal >= 16 && notaFinal <= 17;
			
			if (suf) {
				System.out.printf("Nota Final: %.0f - Classificação: Suficiente\n", notaFinal);
			} else if (bom) {
				System.out.printf("Nota Final: %.0f - Classificação: Bom\n", notaFinal);
			} else if (mtBom) {
				System.out.printf("Nota Final: %.0f - Classificação: Muito Bom\n", notaFinal);
			} else {
				System.out.printf("Nota Final: %.0f - Classificação: Excelente\n", notaFinal);
			}
		}
	}
}