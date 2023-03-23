package lab;

public class Pattern {
public static void main(String[] args) {
	for(int i=5; i>=1; i--) { //Comment Print the row
		for(int j=1; j<=i; j++) {
			System.out.print("@");
		}
		System.out.println();
	}
}
}
