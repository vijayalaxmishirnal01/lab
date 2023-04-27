package lab;

abstract class Shape1{ //Abstract parent class
	abstract void CalculateArea(); //Abstract class method
}
class Circle1 extends Shape1{ //child 1 class
	double radius;
	
	public Circle1(double radius) { //child class 1 method
		this.radius=radius;
	}
	@Override
	void CalculateArea() {
		System.out.println("Area of Circle is:"+(3.14*radius*radius));
	}
}
class Rectangle1 extends Shape1{ //child class 2
	double length;
	double breadth;

	public Rectangle1(double lenght, double breadth) { //child class 2 method
		this.length=lenght;
		this.breadth=breadth;
	}
		
	@Override
	void CalculateArea() {
		System.out.println("Area of Rectangle is:"+(length*breadth));
	}
}
public class CalculateAreaLab_3  { //main class
	public static void main(String[] args) {
		//Object the child class 2
		Rectangle1 rect =new Rectangle1(3, 4);
		rect.CalculateArea(); //child class 2 override method
		
		//object the child class 1
		Circle1 cir=new Circle1(5);
		cir.CalculateArea(); //child class 1 override method
	}
}
