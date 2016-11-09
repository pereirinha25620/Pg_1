
import java.util.Scanner;

public class CountVowels {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a phrase: ");
		String text = input.nextLine();

		int vowelCount = 0, aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

		for (int c = 0; c < text.length(); c++) {
			char curChar = text.charAt(c);

			if (curChar >= 'A' && curChar <= 'Z') {
				curChar = (char)(curChar + 32); 
			}

			switch (curChar) {
				case 'a':
					vowelCount++;
					aCount++;
					break;
				case 'e':
					vowelCount++;
					eCount++;
					break;
				case 'i':
					vowelCount++;
					iCount++;
					break;
				case 'o':
					vowelCount++;
					oCount++;
					break;
				case 'u':
					vowelCount++;
					uCount++;
					break;
			}
		}

		System.out.println("Total vowels: " + vowelCount);

		int max = aCount;
		if (eCount > max) max = eCount;
		else if (iCount > max) max = iCount;
		else if (oCount > max) max = oCount;
		else if (uCount > max) max = uCount;
		
		if (vowelCount > 0) {
			System.out.println("Vowels with most occurrences:");
			if (max == aCount) System.out.println("a: " + aCount);
			if (max == eCount) System.out.println("e: " + eCount);
			if (max == iCount) System.out.println("i: " + iCount);
			if (max == oCount) System.out.println("o: " + oCount);
			if (max == uCount) System.out.println("u: " + uCount);
		}
	}
}