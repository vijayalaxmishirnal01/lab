// 1)Write a Java program to print all the elements of an ArrayList using the elements' position.
package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrintAll {
	
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
		System.out.println("Print all the elements: ");
		//using for loop
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}
}

//Output
/* 	Print all the elements: 
	22
	24
	26
	18
	55
	6
	[22, 24, 26, 18, 55, 6]
*/