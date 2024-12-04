package com.balajisoft.dsa;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class StackExample 
{
    public static void main( String[] args )
    {
        // STACK is a LIFO ( last in first out ) Datastructure.
    	// Major methods that Stack collection provides - push(), pop(), peek(), search(), empty()
    	
    	
    	Stack<String> gameStack=new Stack<String>();
    	
    	System.out.println("Is Stack Empty = "+gameStack.isEmpty());
    	
    	gameStack.push("BorderLands");
    	gameStack.push("DOOM");
    	gameStack.push("Minecraft");
    	gameStack.push("FFVII");
    	gameStack.push("Skyrim");
    	
    	System.out.println("Game Collection : "+gameStack);
    	
    	String favGame = gameStack.pop();
    	System.out.println("My Favorite Game1 : "+favGame);
    	System.out.println("My Favorite Game2: "+gameStack.pop());
    	System.out.println("My Favorite Game3 : "+gameStack.peek());
    	
    	
    	//push() method removes the element from top of the stack.
    	//peek() method only returns the element from top of the stack but it doesn't remove it.
    	System.out.println("Game Collection : "+gameStack);

    	System.out.println(" DOOM index : "+gameStack.search("DOOM"));
    	System.out.println(" BorderLands index : "+gameStack.search("BorderLands"));
    	System.out.println(" FFVII index : "+gameStack.search("FFVII"));
    	System.out.println(" Skyrim index : "+gameStack.search("Skyrim"));
    	
    	// Stack returns -1 if you search stack collection for an element which is not existing.
    	
    	//Stack Datastructure Usecases
    	    // Stack collection used to implement Redo/Undo Features in Notepad.
    	   //Stack collection used to implement forward/backward Features with Web browser's history.
    	  //Stack collection used to implement forward/backward feature in Music Players...etc.
    	
    	//stack data structure throws java.lang.OutOfMemoryError if you continuously add elements to the stack collection in infinite loop.
    	
    	/**
    	while(1>0) {
    		gameStack.push("Final Fantacy");
    	}*/
    }
}
