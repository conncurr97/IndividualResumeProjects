package javaClasses;


public class LinkedIntList {

	// Constructs Linked List Node
	private class Node {
		private int item;
		private Node next;
	}

	private Node first; // Sets head of list


	public LinkedIntList() {
		first = null;
	}
	public LinkedIntList(int[] data) {
		first = null;
		for (int i = data.length - 1; i >= 0; i--) {
			Node newNode = new Node();
			newNode.item = data[i];
			newNode.next = first;
			first = newNode;
		}
	}



	public int indexOf(int i) { // Asks for Integer and returns index location of first occurence in list
		
		int count = -1;
		
		for (Node ptr = first; ptr != null; ptr = ptr.next) {
			
			count += 1;
			
			if(ptr.item == i) {
				return count;
			}
			
		}
		
		return -1;
	}


	public boolean removeLastOccurrence(int i) {
		if (first == null)
			return false;
		if (first.item == i) {
			first = first.next;
			return true;
		}
		Node ptr = first;
		while (ptr.next != null && ptr.next.item != i)
			ptr = ptr.next;
		if (ptr.next == null)
			return false;
		ptr.next = ptr.next.next;
		return true;
	}
	public int sum() {
		
		
		int sum = 0;
		if(first == null) {
			return 0;
	}
		for (Node ptr = first; ptr != null; ptr = ptr.next) {
			sum += ptr.item;
	
		}
		
			return sum;
		
	}

	public LinkedIntList evens() { // Returns all of the even integers contained within the list

		LinkedIntList answer = new LinkedIntList();
		Node thisCurrent = first;
		Node answerCurrent = answer.first;


		while (thisCurrent != null) {
			if (thisCurrent.item % 2 == 0) {
				Node newNode = new Node();
				newNode.item = thisCurrent.item;


			}

			if (answerCurrent == null) {
				answer.first = new Node();

			} else {
				answerCurrent.next = new Node();

			}



		}
		return answer;
	}

	//Main function to test the methods

	public static void main(java.lang.String[] args) {
		int[] test = {5, 6, 7, 8, 9, 10, 11};
		LinkedIntList testList = new LinkedIntList(test);
		System.out.println(testList.toString());
		System.out.println(testList.sum());
		System.out.println(testList.indexOf(5));
		testList.removeLastOccurrence(11);
		System.out.println(testList);


	}


	public java.lang.String toString() {
		if (first == null)
			return "List is Empty";
		java.lang.String ans = "[" + first.item;
		Node pointer = first.next;
		while (pointer != null) {
			ans += ", " + pointer.item;
			pointer = pointer.next;
		}
		ans += "]";
		return ans;
	}


}
