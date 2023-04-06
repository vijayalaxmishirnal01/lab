package lab;

class Vehicle{//parent class
	String brand;
	String model;
	int year;
	
	public Vehicle(String brand,String model,int year) {
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	public void drive(){ // parent class method
        System.out.println(brand + " " +model + " " +year+ " is driving.");
	}
}

class Car extends Vehicle { //child class
    private String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }
      public void honk() { //child class method
     System.out.println(brand + " " + model + " " + year + " in " + this.color + " is honk the horn.");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Car c = new Car("Maruti Suzuki", "Maruti Alto", 2022, "Blue");
        c.drive();
        c.honk();
    }

}