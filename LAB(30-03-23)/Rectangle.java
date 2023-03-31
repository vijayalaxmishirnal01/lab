package lab;

class Rectangle {
	private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

public class Rectangle_Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20.0, 40.0);
        double area = rect.getArea();
        System.out.println("Area = " + area);
        
        rect.setLength(30.0);
        rect.setBreadth(30.0);
        double newArea = rect.getArea();
        System.out.println("New area = " + newArea);
    }
}
}

