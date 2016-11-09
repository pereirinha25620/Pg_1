
import java.util.Scanner;

public class RotateArray {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int arraySize = input.nextInt();

		int[] arr = new int[arraySize];

		for (int s=0; s<arraySize; s++) {
			arr[s] = input.nextInt();
		}

		int[] rotArr = new int[arraySize];

		rotArr[0] = arr[arraySize-1];
		for (int i = 1; i < arraySize; i++) {
			rotArr[i] = arr[i-1];
		}

		printArray(rotArr);
	}

	static void printArray(int[] intArray) {
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}