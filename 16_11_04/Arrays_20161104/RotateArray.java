/**
Using an array and rotate left or right
Author: Matilde P.M. Pato
email: mpato@deetc.isel.ipl.pt
date: April, 27 2016
*/
public class RotateArray{
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5};

		int first = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			arr[i-1] = arr[i];
		}
		// Put old first element in the end
		arr[arr.length-1] = first;
	
	// Print an array
		char sep = '[';
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(sep + " " + arr[i]);
			sep = ',';
		};
		if (arr.length != 0) System.out.println(" ]");
	
	
	// Rotate elements to right
	// Pre-condition: array must be, at least, one position
	/*
		int last = arr[arr.length-1];
		for (int i = arr.length-1; i > 0; --i) {
			arr[i] = arr[i-1];
		}
		// Put old last element in beginning
		arr[0] = last;*/
	}
}