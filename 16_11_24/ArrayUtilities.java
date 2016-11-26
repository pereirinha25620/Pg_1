/**
Subject: Top 10 Methods for Java Arrays. 
The following are top 10 methods for Java Array library, i.e. only methods
are defined.
Author: Pedro Pereirinha
e-mail address: 25620@alunos.isel.ipl.pt
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

		/*
		// capicua?
		System.out.print("Is capicua? ");
		System.out.println(isCapicua(arr) + "\n");
		*/
		// reverse
		System.out.println("Reverse array:");
		reverse(arr);
		printArray(arr, 0, arr.length-1);


		// find
		int ind = find(arr, 8);
		System.out.println("Index of 8 = " + ind);
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
		newarr = equalArray(arr, 0, newarr.length-1);
		newarr = append(newarr, num);
		printArray(newarr, 0, newarr.length-1);

		
		//  square of elements
        System.out.println("Square elements of an array: ");
        printArray(quadratic(newarr), 0, newarr.length - 1);

		// order values by increase
		System.out.println("After ordering");
		arr = sort(arr);								
		printArray(arr, 0, arr.length-1);

		/*
		// count repetead numbers
		System.out.print("Number of equals: ");
		int numrepetead = countEquals(arr);
		System.out.println(numrepetead);

		// remove duplicates
		System.out.println("Remove equals if exist!");
		arr = removeEquals(arr);
		printArray(arr, 0, (arr.length-1));
		*/

		// remove zeros from the end of the array
		System.out.println("Remove all zeros from array at right.");
		//arr = trim(arr);
		printArray(arr, 0, arr.length-1);


		// compare arrays
        System.out.println("Enter a new array");
        String str = in.nextLine();
        //int[] nnewarr = new int[str.length()];
        if (str.length() != 0) {
            String[] numbers = str.split(" ");
            int[] nnewarr = new int[numbers.length];
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

		/*
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
		*/
	}




// ---------------------------------------------------------------------
// List of methods
// ---------------------------------------------------------------------

	// Print unidimensional array.
	// input: array (a), first index (beg) and last index (end)
	// output: Print array with brackets
	public static void printArray(int[] a, int beg, int end) {		
		String output = "[";
		for (int i = beg; i <= end; i++) {
			if (i != end) output += a[i] + ", ";
			else output += a[i] + "]";
		}
		System.out.println(output);
	}

	
	// Duplicate an array
	// Pre-condition: array must be, at least, one position
	// input: array (a), first index (beg) and last index (end)
	// output: an array (temp)
	public static int[] equalArray(int[] a, int beg, int end) {
		if (a.length < 1) return null;
		
		int dim = beg == 0 ? end + 1 : end - beg + 1;
		int[] result = new int[dim];
		end = a.length - 1 < end ? a.length - 1 : end;
		
		for (int i = end; i >= 0; i--) {
			result[i] = a[i];
		}
		
		return result;
	}  
	
	
	// Compare arrays
	// input:  two arrays (a and b)
	// output: boolean value or simply true/false
	public static boolean compareArray(int[] a, int[] b) {		
		if (a.length != b.length) return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}

		return true;
	}

	// Reverse the array 
	// Pre-condition: array must be, at least, one position
	// input: array (a)
	// output: the same array, then the return should be "void"
	public static void reverse(int[] a) {
		if (a.length < 1) return;
		
		int temp = 0;
		for (int i = 0; i < a.length / 2; i++) {
			temp = a[a.length - 1 - i];
			a[a.length - 1 - i] = a[i];
			a[i] = temp;
		}
	}

	// Return the index of element if exist or, a.length otherwise
	// input: array (a) and a value (elem)
	// output: position of elem in array or a.length
	public static int find(int[] a, int elem) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == elem) return i;
		}

		return a.length;	
	}
	 
	
	// Return the index of maximum 
	// Pre-condition: array must be, at least, one position
	// input: array (a) 
	// output: position with maximum value
	public static int findMax(int[] a) {
		if (a.length < 1) return -1;

		int max = a[0];
		int indexMax = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				indexMax = i;
			}
		}

		return indexMax;
	}

	
	// Return the index of minimum 
	// Pre-condition: array must be, at least, one position
	// input: array (a) 
	// output: position with minimum value
	public static int findMin(int[] a) {
		if (a.length < 1) return -1;

		int min = a[0];
		int indexMin = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				indexMin = i;
			}
		}

		return indexMin;
	}
	
	
	// Rotate elements to left
	// Pre-condition: array must be, at least, one position
	// input: array (a)
	// output: the same array, then the return should be "void"
	public static void rotateLeft(int[] a) {
		int temp = a[0];

		for (int i = 1; i < a.length; i++) {
			a[i-1] = a[i];
		}
		a[a.length - 1] = temp;
	}
	
	
	// Rotate elements to right
	// Pre-condition: array must be, at least, one position
	// input: array (a)
	// output: the same array, then the return should be "void"
	public static void rotateRight(int[] a) {
		int temp = a[a.length - 1];

		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;
	}

	/*
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
	*/

	// Convert element of an array from string to integer. 
	// Pre-condition: considering negative values
	// input: String
	// output: integer.
	public static int string2Int( String str ){
       int result = 0;

       boolean isNegative = str.charAt(0) == '-' ? true: false;

       int beginIndex = isNegative ? 1 : 0;

       for (int c = str.length() - 1, mult = 1; c >= beginIndex ; c--, mult *=10) {
                       result += (str.charAt(c) - '0') * mult;
       }

       result = isNegative ? result * -1 : result;

       return result;
	}


	/*
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

	*/
	// Add number in array
	// Pre-condition: array must be, at least, one position
	// input: array (a) and number (num)
	// output: a second array with num
	public static int[] append(int[] a, int num) {
		int[] result = a;
		result[result.length-1] = num;
		return result;
	}

	
	// Square elements of an array
	public static int[] quadratic(int[] a){
		int[] result = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = a[i]*a[i];
		}

		return result;
	}

	// Remove all zeros at the end of the array
	public static int[] trim(int[] a) {
		int countZeros = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) break;
			countZeros++;
		}

		int[] result = equalArray(a, 0, a.length - 1 - countZeros);

		return result;
	}

	// Ascending order 
	// Pre-condition: array must be, at least, one position
	public static int[] sort(int[] a){
		if (a.length < 1) return null;

		int[] result = equalArray(a, 0, a.length - 1);

		for (int i = 1; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (result[j] > result[i]) {
					int aux = result[j];
					result[j] = result[i];
					result[i] = aux;
				}
			}
		}

		return result;
	}
}
