package lab;

//Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.

public class StringBufferLab_2 {//class
	
	public static void main(String[] args) {
		
		//String Buffer -modifiable
		StringBuffer buf = new StringBuffer("This is StringBuffer"); //Initialized String buffer 
		System.out.println("String Buffer String-: "+buf); //print the String buffer
		System.out.println("==============================================");
		
		//4. Replaces the word “Buffer” with “Builder” and display it.

		buf.replace(14, 21, "Builder"); //replace the word
		System.out.println("Replace the word Buffer to Builder-: "+buf); //print
		System.out.println("==============================================");

		//1. Adds the string- "This is a sample program” to existing string and display it.
		
		buf.append(" This is a sample program"); //add the string
		System.out.println("Adds the String-: "+buf); //print
		System.out.println("==============================================");

		//2. Inserts the string “Object” into the existing string at 21st position and display it.

		buf.insert(21," Object "); //insert the character
		System.out.println("Insert the string in 21 position-: "+buf);//print
		System.out.println("==============================================");

		//3. Reverses the entire string and displays it.
		
		buf.reverse(); //reverse the string
		System.out.println("Reverse the String-: "+buf); //print
		System.out.println("==============================================");	
	}
}
