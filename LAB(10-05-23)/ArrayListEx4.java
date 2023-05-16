//4) WAP where the type of arraylist is of type String, take the input from the user using Scanner and print it in ascending order.
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare a array
		List<String> list =new ArrayList<String>();
		
		System.out.println("ArrayList Elements Of Size: ");
		 int size = sc.nextInt();
		 Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the arraylist in String elements: ");
		int i=0;
		while(i<size)
		{
		  list.add(sc2.nextLine());
		  i++;
		}

		//Before insertion
		System.out.println("Array Before inseration: "+ list);

		// Sorting the list in descending order
		Collections.sort(list, Collections.reverseOrder());

		//After insertion
		System.out.println("Array After insertion: "+ list);
		}
		}


/* Output:
	ArrayList Elements Of Size: 
	5
	Enter the arraylist in String elements: 
	Java
	C
	C++
	Python
	SQL
	Array Before inseration: [Java, C, C++, Python, SQL]
	Array After insertion: [SQL, Python, Java, C++, C]
*/
	