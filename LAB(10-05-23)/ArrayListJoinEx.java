//3) Write a Java program to join two array lists.
package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJoinEx {

	public static void main(String[] args) {
		//declare an array list1
		List<Integer> list1 =new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("Create a list1: "+list1);
		
		//declare an array list2
		List<Integer> list2 =new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		System.out.println("Create a list2: "+list2);
		
		//Join the ArrayList
		list1.addAll(list2);
		System.out.println("Joined ArrayList: "+list1);
	}
}

//Output
/*	Create a list1: [1, 2, 3, 4]
	Create a list2: [5, 6, 7, 8]
	Joined ArrayList: [1, 2, 3, 4, 5, 6, 7, 8]
*/