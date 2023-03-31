package lab;

class Stu1{
	int value=10;
	
	void display(){
		System.out.println("Student Construtor");
	}
}
public class Student {
public static void main(String[] args) {
	Stu1 obj=new Stu1();
	System.out.println("Value:"+obj.value);
}
}
