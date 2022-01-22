package javaClasses;

import java.util.NoSuchElementException;


public class Deque<T> {

	private Node first; 	// A reference to the first item in the Dequeue (or
							// null if empty)
	private Node last; 		// A reference to the last item in the Dequeue (or
							// null if empty)
	private int N; 			// The number of items currently in the Dequeue

	private class Node {

		public T item; 		// The data stored at this node.
		public Node next; 	// The node to the right (or null if there is no
							// node to the right)
		public Node prev; 	// The node to the lett (or null if there is no
							// node to the left)
	}


	public Deque() { // Creates empty Deque
		first = null;
		last = null;
		N = 0;
		
	}


	public boolean isEmpty() { // Sees if Deque is empty

		
		
		
		if(N == 0) {
			
		
		return true;
		}
	
		return false;
	
	}
	
	


	public int size() { // returns size of Deque

		return N;
	}


	public void pushFront(T item) { // Inserts item too front of Deque

		Node oldfirst = first;
	       first = new Node();
	       first.item = item;
	       first.next = oldfirst;
	       first.prev = null;

	       if (last == null)
	       {
	           last = first;
	       }
	       else
	       {
	           oldfirst.prev = first;
	       }

	       N++;
	}
	        
	        
	        
	
	
	
	
	
	


	public void pushBack(T item) { //Inserts item to back of Deque

			 if (last == null)
		       {
		           first = new Node();
		           first.item = item;
		           first.next = null;
		           first.prev = null;
		           last = first;
		       }
		       else
		       {
		           last.next = new Node();
		           last.next.item = item;
		           last.next.next = null;
		           last.next.prev = last;
		           last = last.next;
		       }

		       N++;
		}



	public T popFront() {
		// Removes item from first of deque
	
		if (N == 0)
	           throw new NoSuchElementException();

	       Node pop = first;
	       first = first.next;

	       if (first == null)
	       {
	           last = null;
	       }
	       else
	       {
	           first.prev = null;
	       }

	       N--;
	       return pop.item;
		
		
		
		
		
		
		
	}


	public T popBack() { //Removes item from back of Deque

		if (N == 0)
	           throw new NoSuchElementException();

	        Node pop = last;
	       last = last.prev;

	       if (last == null)
	       {
	           first = null;
	       }
	       else
	       {
	           last.next = null;
	       }

	       N--;
	       return pop.item;
	}

	
	
    // check internal invariants
    private boolean check() {
        if (N < 0) {
            return false;
        }
        else if (N == 0) {
            if (first != null) return false;
            if (last  != null) return false;
        }
        else if (N == 1) {
            if (first == null || last == null) return false;
            if (first != last)                 return false;
            if (first.next != null)            return false;
        }
        else {
            if (first == null || last == null) return false;
            if (first == last)      return false;
            if (first.next == null) return false;
            if (last.next  != null) return false;

            // check internal consistency of instance variable n
            int numberOfNodes = 0;
            for (Node x = first; x != null && numberOfNodes <= N; x = x.next) {
                numberOfNodes++;
            }
            if (numberOfNodes != N) return false;

            // check internal consistency of instance variable last
            Node lastNode = first;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            if (last != lastNode) return false;
        }

        return true;


    
    }

	public static void main(java.lang.String[] args){
		Deque<Integer> testDeque = new Deque<>();
		System.out.println(testDeque.size());
		testDeque.pushFront(5);
		testDeque.pushFront(4);
		testDeque.pushFront(2);
		System.out.println(testDeque.size());
		testDeque.popBack();
		System.out.println(testDeque.size());
		testDeque.pushBack(4);
		System.out.println(testDeque.isEmpty());
		testDeque.check();



	}
    


}





