/**
 * 
 */
package com.balajisoft.dsa;

import java.util.LinkedList;

/**
 * Balaji Nagaiahgari
 * 
 * Modified Date : 04-DEC-2024
 * 
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// LinkedList is a non-linear datastructure which stores the data in the form of nodes.
		// Node represents a [data+address pointer to another node] .
		// Two Types of LinkedList datastructures  : 1. Single LinkedList & 2. Double LinkedList.
		// Single LinkedList ---> [data+address pointer to next node]
		// Double LinkedList ---> [address pointer of previous node + data + address pointer to next node]
		
		
		//
		
		
		// Advantages : 
		    // insertion and deletion of elements is really fast [ O(1) time ].
		    // Memory will be allocated as when required dynamically.
		    // Double LinkedList can be traversed forward or backward.
		    // Linked List can be used as Stack and Queue datastructures.
		
		// Disadvantages : 
		    // Searching a element is slow since there are no indexes available with LinkedList. [O(n) time].
		    // Double LinkedList wastes memory more since it has keep additional addresses of nodes.
		
		// Usecases :
		         // GPS Navigation Systems.
		         
		
		LinkedList<String> linkedListStack = new LinkedList<String>();
		
		//LinkedList can be used as a Stack datastructure.
		linkedListStack.push("DAVIDSON");
		linkedListStack.push("CONCORD");
		linkedListStack.push("CHARLOTTE");
		linkedListStack.push("ATLANTA");
		linkedListStack.push("VIRGINIA");
		
		System.out.println("Stack Datastructure -------> "+linkedListStack);
		linkedListStack.pop();
		System.out.println("Stack Datastructure -------> "+linkedListStack);
		
		
		//LinkedList can be used as Queue Datastructure.
		LinkedList<String> linkedListQueue = new LinkedList<String>();
        linkedListQueue.offer("TRUMP");
        linkedListQueue.offer("BIDEN");
        linkedListQueue.offer("KAMALA");
        linkedListQueue.offer("VANCE");
        linkedListQueue.offer("TIM");
        
		System.out.println("Queue Datastructure -------> "+linkedListQueue);
		linkedListQueue.poll();
		System.out.println("Queue Datastructure -------> "+linkedListQueue);

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Friend");
		linkedList.add("Brother");
		linkedList.add("Dad");
		linkedList.add("Mom");
		
		linkedList.addFirst("Mom-In-Law");
		
		System.out.println(linkedList);
		
		linkedList.add(2,"Brother-In-Law");
		System.out.println(linkedList);
		System.out.println(linkedList.get(3));
		
		linkedList.addFirst("Sister-in-Law");
		linkedList.addLast("Co-Brother");
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
	
	}

}
