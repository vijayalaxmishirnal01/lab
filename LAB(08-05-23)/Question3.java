//Question 3: Demonstrate getPriority() and setPriority() methods in Java threads.
package Threads;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Threads3 extends Thread{ //thread1 class
    public void run(){
        System.out.println("Welcome");
   }
}
class Threads4 extends Thread { //thread2 class
    public void run() {
            System.out.println("Good morning");
    }
}
public class Question3 {
	

	public static void main(String[] args) {
		Threads3 t3 = new Threads3(); //new state
		Threads4 t4 = new Threads4(); //new state
		
		//setpriority method
		 t3.setPriority(7);
	     t4.setPriority(2); 
	     

        //getpriority  method
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
	        
	    t3.start(); //runnable state
        t4.start(); //runnable state
       
 }
	}
	
