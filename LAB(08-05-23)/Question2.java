//Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
package Threads;

class Threads1 extends Thread{ //thread1 class
    public void run(){
    	try {
    		//sleep method 
    		Thread.sleep(200); //200 milliseconds
    	}
    	catch(InterruptedException e)
    	{
    		System.out.println(e.getMessage());
    	}
        System.out.println("Good Morning");
   }
}
class Threads2 extends Thread { //thread2 class
    public void run() {
            System.out.println("Welcome");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Threads1 t1= new Threads1(); //new state
        Threads2 t2= new Threads2(); //new state
        t1.start();//runnable state
        t2.start();//runnable state
    }
}