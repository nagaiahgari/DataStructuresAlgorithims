/**
 * 
 */
package com.balajisoft.dsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Balaji Nagaiahgari
 * 
 * Modified Date : 04-DEC-2024
 * 
 */
public class QueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Queue is a FIFO ( First in First Out Datastructure)
		// it is a Collection meant for holding the elements prior to processing.
		// Generally we use below methods with Queue Collections to store and organize
		// the elements.
		// adding elements - offer()
		// removing elements - poll()
		// just returning elements - peek()
		// check if Queue is empty - isEmpty()
		// get the size of the Queue collection - size()
		// check if an element present in the queue collection or not - contains()

		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Balaji");
		queue.offer("Ramu");
		queue.offer("Bharath");
		queue.offer("Manoj");
		
		System.out.println("Size of the queue : "+queue.size());
		System.out.println(queue);
		queue.poll();
		queue.poll();
		System.out.println(queue);
		queue.peek();
		System.out.println(queue);
		System.out.println(queue.contains("Somu"));
		System.out.println(queue.contains("Bharath"));
		System.out.println(queue.isEmpty());
		
		//queue.remove();
		//queue.remove();
		//queue.remove();
		//queue.remove();
		
		//Usecases - Queue Collections can be used to implement printer programs to print the documents in the order of submission.
		
	}

}
