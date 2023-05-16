//2) Write a Java program to reverse elements in descending order in an array list.
package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListReverseEle {

	public static void main(String[] args) {
		//declare an array
		List<Integer> list =new ArrayList<Integer>();
		
		//insert element in the list
		list.add(22);
		list.add(24);
		list.add(26);
		list.add(18);
		list.add(55);
		list.add(6);
		
		//Before insertion
		System.out.println("Array Before insertion: "+list);
		
		//sort the arraylist in ascending order
		Collections.sort(list);
		System.out.println("Reverse Sorting: "+list);
		
		//sort the arraylist in ascending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Sorting in descending order: "+list);
}
}
//Output
/* 	Array Before insertion: [22, 24, 26, 18, 55, 6]
	Reverse Sorting: [6, 18, 22, 24, 26, 55]
	Sorting in descending order: [55, 26, 24, 22, 18, 6]

*/
