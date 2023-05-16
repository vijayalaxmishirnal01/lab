//2) Write a Java program to convert a linked list to an array list.

package collections;

import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		
		//declare the linkedlist
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Abhinadan");
		linkedlist.add("Vijayalaxmi");
		linkedlist.add("Ashmita");
		linkedlist.add("Vittal");
		
		System.out.println("List of Linked List: "+linkedlist);
		
		System.out.println();
		
		//covert a linked list to array list
		System.out.println("Covert a linked list to array list: ");
		for(String var : linkedlist)
		{
			System.out.println(var);
		}
		System.out.println();
	}
}


/*
  Output:
  List of Linked List: [Abhinadan, Vijayalaxmi, Ashmita, Vittal]
  Covert a linked list to array list: 
  Abhinadan
  Vijayalaxmi
  Ashmita
  Vittal
*/