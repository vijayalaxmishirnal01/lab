package lab;

abstract class Shapes{ //Abstract parent class
	abstract void CalculateArea(); //Abstract class method
}
class Circles extends Shapes{
	double radius;
	
	public Circles(double radius) {
		this.radius=radius;
	}
	@Override
	void CalculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is:"+(3.14*radius*radius));
	}
}
class Rectangles extends Shapes{
	double length;
	double breadth;

	public Rectangles(double lenght, double breadth) {
		this.length=lenght;
		this.breadth=breadth;
	}
		
	@Override
	void CalculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is:"+(length*breadth));
	}
}
public class CalculateArea_AbsMethod {
	public static void main(String[] args) {
		Rectangles rect =new Rectangles(3, 4);
		rect.CalculateArea();
		
		Circles cir=new Circles(5);
		cir.CalculateArea();
	}
}
