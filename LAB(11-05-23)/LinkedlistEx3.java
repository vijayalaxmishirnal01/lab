//3) Write a Java program to convert a linked list to an array using toArray() method.

package collections;

import java.util.LinkedList;

public class LinkedlistEx3{

	public static void main(String[] args) {
		
		//declare the linkedlist
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Abhinadan");
		linkedlist.add("Vijayalaxmi");
		linkedlist.add("Ashmita");
		linkedlist.add("Vittal");
		
		System.out.println("List of Linked List: "+linkedlist);
		
		// Covert Linkedlist to array 
	    String[] array = linkedlist.toArray(new String[0]);

	    // Printing the ArrayList
	    System.out.println("List of Array List: ");
	    for(String arraylist:array) {
	      System.out.print(arraylist+" ");
	    }
	}
}

/*
Output:
List of Linked List: [Abhinadan, Vijayalaxmi, Ashmita, Vittal]
List of Array List: 
Abhinadan Vijayalaxmi Ashmita Vittal 
*/