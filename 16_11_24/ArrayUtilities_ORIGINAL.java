/**
Subject: Top 10 Methods for Java Arrays. 
The following are top 10 methods for Java Array library, i.e. only methods
are defined.
Author: LI11N students
e-mail address: *@alunos.isel.ipl.pt
Last changed: November, 2016
*/
import java.util.Scanner;

public class ArrayUtilities {

// ************************************************************************
// Considering the values inserted in command line, eg
// java ArrayUtilities 7 3 4 3 12 29 2 3 8 3 1 9 16

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] arr = new int[args.length];

		for(int i = 0; i < args.length; ++i){
			arr[i] = string2Int(args[i]);
		}

		System.out.println("Original array:");
		printArray(arr,0,arr.length-1);

		// capicua?
		System.out.print("Is capicua? ");
		System.out.println(isCapicua(arr) + "\n");

		// reverse
		System.out.println("Reverse array:");
		reverse(arr);
		printArray(arr, 0, arr.length-1);
		
		// find
		int i = find(arr, 8);
		System.out.println("Index of 8 = " + i);
		System.out.println("Index of 99 (non exist) -> return arr.length = " + find(arr, 99) + "\n");
		
		// findMax
		int idxMax = findMax(arr);
		System.out.println("Max = " + arr[idxMax] + " in position " + idxMax + "\n");
		
		// findMin
		int idxMin = findMin(arr);
		System.out.println("Min = " + arr[idxMin] + " in position " + idxMin + "\n");
		
		// rotateLeft
		System.out.println("After rotate left");
		rotateLeft(arr);
		printArray(arr, 0, arr.length-1);
		
		// rotateRight
		System.out.println("After rotate right");
		rotateRight(arr);
		printArray(arr, 0, arr.length-1);

		// add num
		int num = 10;
		int[] newarr = new int[arr.length+1];
		newarr = equalArray(arr, 0, newarr.length);
		newarr = append(newarr, num);
		printArray(newarr, 0, newarr.length-1);

		//  square of elements
        System.out.println("Square elements of an array: ");
        printArray(quadratic(newarr), 0, newarr.length - 1);

		// order values by increase
		System.out.println("After ordering");
		sort(arr);
		printArray(arr, 0, arr.length-1);

		// count repetead numbers
		System.out.print("Number of equals: ");
		int numrepetead = countEquals(arr);
		System.out.println(numrepetead);

		// remove duplicates
		System.out.println("Remove equals if exist!");
		arr = removeEquals(arr);
		printArray(arr, 0, (arr.length-1));

		// remove zeros from the end of the array
		System.out.println("Remove all zeros from array at right.");
		arr = trim(arr);
		printArray(arr, 0, arr.length-1);


		// compare arrays
        System.out.println("Enter a new array");
        String str = in.nextLine();
        int[] nnewarr = new int[str.length()];
        if (str.length() != 0) {
            String[] numbers = str.split(" ");
            
            for (int i = 0; i < numbers.length; ++i) {
                nnewarr[i] = string2Int(numbers[i]);
            }
            if (compareArray(arr, nnewarr) == true)
                System.out.println("Arrays are equals.\n" );
            else
                System.out.println("Arrays are different.\n");
        }
        else
            System.out.println("None array exist.\n");

	
        // Intersection of 2 ordered arrays
		System.out.print("Intersection: ");
		nnewarr = sort(trim(nnewarr));  	// last array
		arr = sort(arr);		// original array
		int [] intersecArr = new int[arr.length];
		intersecArr = trim(intersection(arr, nnewarr));
		printArray(intersecArr, 0, (intersecArr.length-1));


        // Union of 2 ordered arrays
		System.out.print("Union: ");
		int[] unionArr = new int[arr.length];
		unionArr = trim(union(arr, nnewarr));
		printArray(unionArr, 0, (unionArr.length-1));
	}





// ---------------------------------------------------------------------
// List of methods
// ---------------------------------------------------------------------

	// Print unidimensional array.
	// input: array (a), first index (beg) and last index (end)
	// output: Print array with brackets
	public static void printArray(int[] a, int beg, int end) {		
		
	}


	// Duplicate an array
	// Pre-condition: array must be, at least, one position
	// input: array (a), first index (beg) and last index (end)
	// output: an array (temp)
	public static int[] equalArray(int[] a, int beg, int end) {
		
	}
	

	// Compare arrays
	// input:  two arrays (a and b)
	// output: boolean value or simply true/false
	public static boolean compareArray(int[] a, int[] b) {		
		
	}


	// Reverse the array 
	// Pre-condition: array must be, at least, one position
	// input: array (a)
	// output: the same array, then the return should be "void"
	public static void reverse(int[] a) {
		
	}
	

	// Return the index of element if exist or, a.length otherwise
	// input: array (a) and a value (elem)
	// output: position of elem in array or a.length
	public static int find(int[] a, int elem) {
		
	}
	 

	// Return the index of maximum 
	// Pre-condition: array must be, at least, one position
	// input: array (a) 
	// output: position with maximum value
	public static int findMax(int[] a) {
		
	}
	
	// Return the index of minimum 
	// Pre-condition: array must be, at least, one position
	// input: array (a) 
	// output: position with minimum value
	public static int findMin(int[] a) {
		
	}
	
	// Rotate elements to left
	// Pre-condition: array must be, at least, one position
	// input: array (a)
	// output: the same array, then the return should be "void"
	public static void rotateLeft(int[] a) {
		
	}
	
	
	// Rotate elements to right
	// Pre-condition: array must be, at least, one position
	// input: array (a)
	// output: the same array, then the return should be "void"
	public static void rotateRight(int[] a) {
		
	}


	// Intersection of 2 ordered arrays
	// Pre-condition: array must be, at least, one position
	// input: two ordered arrays (a and b)
	// output: an array with result of intersection
	public static int[] intersection(int[] a, int[] b){
		
    }

	// Union of 2 ordered arrays
	// Pre-condition: array must be, at least, one position
	// input: two ordered arrays (a and b)
	// output: an array with result of union
	public static int[] union(int[] ... arrays){
		
	}

	public static boolean findDuplicated(int[] a, int counter, int value) {
		
	}

	// Remove equals 
	// Pre-condition: array must be, at least, one position
	// input: array
	// output: an array without equals values
	public static int[] removeEquals(int[] a){
		
    }


    // Count equals numbers 
	// Pre-condition: array must be, at least, one position
	// input: array
	// output: number of equals
    public static int countEquals(int[] a){
    	
	}


	// Convert element of an array from string to integer. 
	// Pre-condition: considering negative values
	// input: String
	// output: integer. 
	public static int string2Int( String str ){
       
	}   

	// Convert element of an array from integer to string. 
	// Pre-condition: considering negative values
	// input: integer
	// output: String. 
	public static String[] int2String( int[] a ){
       
	}   

	// Is a capicua 
	// Pre-condition: array must be, at least, one position
	// input: array (a)
	// output: boolean result
	public static boolean isCapicua(int[] a){ 
		
	}


	// Add number in array
	// Pre-condition: array must be, at least, one position
	// input: array (a) and number (num)
	// output: a second array with num
	public static int[] append(int[] a, int num) {
		
	}


	// Square elements of an array
	public static int[] quadratic(int[] a){
		
	}


	// Remove all zeros at the end of the array
	public static int[] trim(int[] a) {
		
	}

	// Ascending order 
	// Pre-condition: array must be, at least, one position
	public static int[] sort(int[] a){
		
	}

}
