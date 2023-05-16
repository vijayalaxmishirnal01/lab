//2) WAP showing the deadlock problem and solve it using thread join method.
package Threads;

public class DeadlockDemo {
	
	public static void main(String[] args) {
		//initialize
		final String resource1 = "Cat";
		final String resource2 = "Dog";
		
		//Thread 1 locks resource Cat
		Thread thread1 = new Thread()
		{
			public void run() {
				synchronized (resource1) 
				{
					System.out.println("Thread1 Locked Resource1: Cat");
				}
				try {
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				//thread 1 wants to lock resource 1:Dog
				synchronized (resource2) 
				{
					System.out.println("wanted to lock resource2: Dog");
				}
			}
		};
		

		//Thread 1 locks resource Dog
		Thread thread2 = new Thread()
		{
			public void run() {
				synchronized (resource2) 
				{
					System.out.println("Thread2 Locked Resource1: Dog");
				}
				try {
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				//thread 2 wants to lock resource 1:Cat
				synchronized (resource1) 
				{
					System.out.println("wanted to lock resource2: Cat");
				}
			}
		};
		thread1.start();
		try
		{
			thread1.join(); //with the help of join
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		thread2.start();
	}
}

//Output
/*
	Thread1 Locked Resource1: Cat
	wanted to lock resource2: Dog
	Thread2 Locked Resource1: Dog
	wanted to lock resource2: Cat
*/