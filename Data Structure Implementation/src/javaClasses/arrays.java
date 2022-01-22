package javaClasses;

import java.util.Arrays;

public class arrays {
	/**
	 * Computes the sum of the ints in an array.
	 * 
	 * @param a the array of ints to be summed
	 * @return the sum of the ints in <code>a</code>
	 */
	public int sum(int[] a) {
		int sum = 0;
		for (int value: a) {
			sum += value;
			
		}
		
		return sum; 
	}
	
	
	/**
	 * Finds the maximum int in a non-empty array.
	 * 
	 * @param a a non-empty array of ints
	 * @return the maximum int in the array
	 */
	public int largest(int[] a) {
		
		
		int value;
		int max = a[0];
		for(value = 1; value < a.length; value++) {
			if(a[value] > max) {
				max = a[value];
				
			}
			
		
				
				
		}
		
		
			
		return max;
		
	}
	
	/**
	 * Finds the second largest int in an array of unique ints
	 * 
	 * @param a an int array of unique ints with size > 1
	 * @return the second largest int in the array
	 */
	public int secondLargest(int[] a) {
		
		
		int j;
		int largest = a[0];
		int largestTwo = a[1];


		
		for(j = 1; j < a.length; j++) {
			if (a[j] > largest){
				largestTwo = largest;
				largest = a[j];
				
			}
			
			else if (a[j] > largestTwo) {
				largestTwo = a[j];
			}
			 

			
			
			
			
		}
		
	
		
		return largestTwo;
		
	}
		
	
		
		
	/**
	 * Returns the number of even ints in an array.
	 * 
	 * @param a an array of ints
	 * @return the number of even ints in the array
	 */
	public int countEvens(int[] a) {
		int count = 0; 
		
		for(int k = 0; k < a.length; k++) {
			if(a[k] % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}
	
	/**
	 * Returns a new array containing the even ints from an input array in
	 * the same order they appear in the array.
	 * 
	 * @param a an array of ints
	 * @return a new array containing the even ints from an input array in
	 * the same order they appear in the array
	 */
	public int[] getEvens(int[] a) {
		
	
		int[]array2 = new int[countEvens(a)]; 
		
		int i = 0; 
		while(i < array2.length) {
			for(int j = 0; j < a.length; j++) {
				if (a[j] % 2 == 0) {
					array2[i] = a[j];
					i++;
				}
			
		
			}
			
			
			
			
			
			
			
			
			
			
		}
	
		
		return array2;
		
	
	
 
	}


		public static void main (String[] args){

		}

}