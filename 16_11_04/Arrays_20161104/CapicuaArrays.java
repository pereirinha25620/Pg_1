/**
Using an array, classify it as capicua or not
Author: Matilde P.M. Pato
email: mpato@deetc.isel.ipl.pt
date: April, 27 2016
*/
class CapicuaArrays {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
			
		// Print an array
		char sep = '[';
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(sep + " " + arr[i]);
			sep = ',';
		}
		if (arr.length != 0) System.out.println(" ]");		
				
		boolean capicua = true;		
		for (int i = 0, j = arr.length-1; i < j && capicua == true; ++i, --j) {
			if (arr[i] != arr[j]) 
				capicua = false;
		};
		
		if (capicua == true)	System.out.println("Is a capicua");
			else System.out.println("Isn't a capicua");
	}
}
