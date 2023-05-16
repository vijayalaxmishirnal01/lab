//Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
package Threads;

class Thread1 extends Thread{ //thread1 class
    public void run(){
    	while(true) {
        System.out.println("Good Morning");
    }
   }
}
class Thread2 extends Thread { //thread2 class
    public void run() {
    	while(true) {
            System.out.println("Welcome");
    }
    }
}
public class Question1  {
    public static void main(String[] args) {
        Thread1 t1= new Thread1(); //new state
        Thread2 t2= new Thread2(); //new state
        t1.start(); //runnable state
        t2.start(); //runnable state
    }
}

