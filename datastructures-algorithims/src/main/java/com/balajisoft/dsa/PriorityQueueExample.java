/**
 * 
 */
package com.balajisoft.dsa;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Balaji Nagaiahgari
 * 
 * Modified Date : 04-DEC-2024
 * 
 */
public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Priority Queue is a linear datastructure and follows FIFO ( First In First
		// Out) order to serve the elements.

		Queue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.offer("A");
		priorityQueue.offer("D");
		priorityQueue.offer("C");
		priorityQueue.offer("B");
		
		System.out.println(priorityQueue);
		System.out.println("Size of the priority queue : " + priorityQueue.size());
		System.out.println(priorityQueue.isEmpty());
		
		priorityQueue = new PriorityQueue<String>(Collections.reverseOrder());
		priorityQueue.offer("A");
		priorityQueue.offer("D");
		priorityQueue.offer("C");
		priorityQueue.offer("B");
		
		System.out.println(priorityQueue);

	}

}
