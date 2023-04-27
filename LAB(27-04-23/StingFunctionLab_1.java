package lab;

//Write a program which creates a String “Welcome to Java World” and performs the following

public class StingFunctionLab_1 { //class

	public static void main(String[] args) {
		
		//concept of string literal
		String string = "Welcome to Java World"; //create a instance
		System.out.println("String: "+string); //print the string
		
		//• Returns the character at 5th position and display it.
		System.out.println("The character at 5th position: "+string.charAt(5)); //print the 5th position character
		
		//• Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
		String s1 = "Welcome";
		System.out.println("The Compare to above String: "+string.compareTo(s1)); //print the compare to string
		System.out.println("The lexicographically ignoring case differences: "+string.equalsIgnoreCase(s1));
		
		//• Concatenates “- Let us learn” to the above string and display it.
		
		//joining using concat function(explicitly)
		string =string.concat(" Let us learn");
		System.out.println("Concat the String: "+string); //print
		
		//• Returns the position of the first occurrence of character ‘a’ and display it.
		System.out.println("The position of character: "+string.indexOf('a')); //print the position of character 
		
		//• Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
		System.out.println("The replace the string: "+string.replace('a', 'e')); //print the replace the string
		
		//• Returns string between 4th position and 10th position and display it.
		System.out.println("4th Position String: "+string.charAt(4)); //print
		System.out.println("10th Position String: "+string.charAt(10)); //print

		//• Returns the lowercase of the string and display it.
		System.out.println("The lower case of the String: "+string.toLowerCase()); //print the lower case of the string
	}
}
