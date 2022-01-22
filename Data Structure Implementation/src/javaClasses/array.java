package javaClasses;



public class array {

	public int sum(int[] a) {
		int sum = 0;
		for (int value: a) {
			sum += value;
			
		}
		
		return sum; 
	}
	

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

	public int countEvens(int[] a) {
		int count = 0; 
		
		for(int k = 0; k < a.length; k++) {
			if(a[k] % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}

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


		public static void main (java.lang.String[] args){

		int[] testArray = new int[]{};

		for (int i = 0; i < testArray.length; i++){
			System.out.println(testArray[i]);
		}

	}

}