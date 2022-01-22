package String;

/**
 * 
 * A class that mimics how Java's String class behaves.
 * Look at Java's String API for information on how each of these should behave.
 *
 */



public class String {
	

	
	private char[] data;

	      
	
	

	public String(char[] value) {
		
		
		data = new char [value.length];
		
		for(int i = 0; i < value.length; i++) {
			data[i] = value[i];
			
			
			
			
			
			
			
		}
		
		

	
	}
	
	public char charAt(int index) {
		
		
		
		if (index < 0 || index > data.length - 1) {
			throw new IndexOutOfBoundsException(index);
		}
		
		return data[index];
			
		
	}
		
	
	
	


	public int indexOf(char ch) {
		
		
		
		for(int i = 0; i < data.length; i++) {
			if(ch == data[i]) {
				return i;
			
		}
			 
				
			
		}
		
		return -1;
	}

	public boolean equals(String other) {
		
		
	
		

			
		
		
		if(this.data.length != other.data.length) {
			return false;
		}
		
		
		if(this.data.length == other.data.length) {
			
		
	
		
		
		for(int i = 0; i < data.length; i++) {
			
		
		
		if(this.data[i] != other.data[i]) {
			return false;
		
			
			
		
		}
		
			
		}	
		
		
		
		
		}
		
		return true;
		
	
		}
		
		


	public int compareTo(String anotherString) {
		
		int counter1 = 0;
		
		int counter2 = 0;
		
		int [] numOne = new int[this.data.length];
		
		int[] numTwo = new int [anotherString.data.length];
	
		for(int i = 0; i < this.data.length; i ++) {
			numOne[i] = this.data[i];
			counter1 += numOne[i];
		}
		
		for (int i = 0; i < anotherString.data.length; i++) {
			numTwo[i] = anotherString.data[i];
			counter2 += numTwo[i];
		}
		
		
	
		
			
		return counter1 - counter2;	
		
	}
		
		
		
		
		
	


	public String replace(char oldChar, char newChar) {
		
		
		
		String z = new String(data);
		
		
		
		
		
		if(this.indexOf(oldChar) <= -1) {
			
			return this;
			
		
		}		
			
		
		
		 
		
		for(int i = 0; i < data.length; i++) {
			
			if(z.data[i] != oldChar){
				z = new String(z.data);
			
			
				
				
				
				
				
				
				}
			
			else if(z.data[i] == oldChar){
				
				z.data[i] = newChar;
				z = new String(z.data);
				
				
				
				
			}

			
		
		}
		
		
		return z;
		
	}
	
	
	
	}

	
