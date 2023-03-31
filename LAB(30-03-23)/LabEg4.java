package lab;

import java.util.Scanner;
public class LabEg4 {
	public static void main(String args[])
	{
	int a,b,c;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the first number:");
	a = s.nextInt();
	System.out.print("Enter the second number:");
	b = s.nextInt();
	System.out.print("Enter the third number:");
	c = s.nextInt();
	if(a<b && a<c)
	{
	System.out.println(a+"smallest number is A.");
	}
	else if(b<c)
	{
	System.out.println(b+"smallest number is B.");
	}
	else
	{
	System.out.println(c+"smallest number is C.");
	}
	}
	}

