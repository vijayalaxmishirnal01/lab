package lab;
import java.util.Scanner;
public class Cube {
	public static void main(String[] args) {
		int num,cube;
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		cube=num*num*num;
		System.out.println("The Cube Number is:"+cube);
	}
}