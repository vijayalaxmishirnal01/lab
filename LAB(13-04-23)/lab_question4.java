package lab;

interface Person1 { //parent interface class
    void speak();//abstract method
}

class Students1 implements Person1 { //child class 1
    public void speak() { 
        System.out.println("Hello,I am a Student.");
    }
}

class Teacher implements Person1 { // child class 2
    public void speak() {
        System.out.println("Hello Student,I am a teacher.");
    }
}
public class lab_question4 {
	public static void main(String[] args) {
		//object of child class 1
        Person1 person1 = new Students1();
        person1.speak();//child class 1 method
        
        //object of child class 2
        Person1 person2 = new Teacher();  
        person2.speak();//child class 2 method
    }

}



