/**
Using an array, find the maximum and minimum
Author: Matilde P.M. Pato
email: mpato@deetc.isel.ipl.pt
date: April, 27 2016
*/
public class MaxMinArray{
	public static void main(String[] args) {
		int[] arr = { 12 , 4, 5, 21, 6};
		
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("The maximum and minimum are " + max + " and " +
			min +", respectively.");
	}
}