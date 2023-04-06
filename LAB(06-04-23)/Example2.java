package lab;

class Person{ //parent class
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		}
	public void speak() {//parent class method
		System.out.println("Student Name:"+name);
		System.out.println("Student age:"+age);
	}
}

class Student1 extends Person{ //child class
	int grade;
	
	public Student1(String name,int age,int grade) {
		super(name, age);
		this.grade=grade;
	}
	public void study() { //child class method
		System.out.println("Student grade:"+grade);
	}
}
//main class
public class Example2 {
	public static void main(String[] args) {
		Student1 s1=new Student1("Ashmita",20,90);
		s1.speak();
		s1.study();
	}
}
