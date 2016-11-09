
public class PalindromeArray {
	public static void main (String[] args) {

		int[] arr = {1, 2, 3, 4, 3, 2, 1};

		boolean isPal = true;

		for (int i = 0; i < arr.length /2; i++) {
			if (!(arr[i] == arr[arr.length-1-i])) {
				System.out.println("Is not palindrome.");
				isPal = false;
				break;
			} 
		}

		if (isPal) System.out.println("Is palindrome.");
	}
}