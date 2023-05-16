//1) Write a Java program to join two linked lists.

package collections;

import java.util.LinkedList;

public class LinkedListJoinEx {

	public static void main(String[] args) {
		
		//declare the linkedlist
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Java");
		list1.add("C");
		list1.add("C++");
		list1.add("Advanced Java");
		list1.add("Python");
		System.out.println("Printing the list of first linked list: "+list1);
		
		//declare the linkedlist
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Bootstrap");
		list2.add("HTML");
		list2.add("CSS");
		list2.add("PHP");
		list2.add("JavaScript");
		System.out.println("Printing the list of second linked list: "+list2);
		
		//join the two linkedlist
		list1.addAll(list2);
		System.out.println("Printing the join two list: "+list1);
	}
}

/*
 Output:
 Printing the list of first linked list: [Java, C, C++, Advanced Java, Python]
 Printing the list of second linked list: [Bootstrap, HTML, CSS, PHP, JavaScript]
 Printing the join two list: [Java, C, C++, Advanced Java, Python, Bootstrap, HTML, CSS, PHP, JavaScript]
*/