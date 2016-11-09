
import java.util.Scanner;

public class MaxMinArray {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int arraySize = input.nextInt();

		int[] arr = new int[arraySize];

		for (int s=0; s<arraySize; s++) {
			arr[s] = input.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arraySize; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.printf("Min: %d - Max: %d\n", min, max);

	}

	static void printArray(int[] intArray) {
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}