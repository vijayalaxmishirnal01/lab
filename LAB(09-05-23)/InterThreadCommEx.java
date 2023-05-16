//1) Create deposit and display balance methods in the program for inter-thread communication.
package Threads;

class Account
{
	//initial account balance
	int balance = 20000;
	
	//synchronized withdraw method
	synchronized void withdraw(int amount)
	{
		System.out.println("Starting withdrawl...");
		if(this.balance<amount)
		{
			System.out.println("Balance is insufficient !!");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			this.balance = balance-amount; //ctrl+alt+4($)
			System.out.println("₹(Rs.)"+amount+" witdraw successfully");
		}
	}
	//synchronized deposit method
		synchronized void deposit(int amount)
		{
			System.out.println("Starting deposit...");
			this.balance=balance+amount;
			System.out.println("₹(Rs.)"+amount+" Deposited");
			try
			{
				notify();
			}
			catch(IllegalMonitorStateException e)
			{
					System.out.println(e.getMessage());
			}
				
		}
		//synchronized display method
			synchronized void display()
			{
				System.out.println("Balance is ₹(Rs.): "+this.balance);
			}
	}

public class InterThreadCommEx {

	public static void main(String[] args) {
		Account acc = new Account();
		
		//anonymous class
		new Thread()
		{
			public void run()
			{
				acc.withdraw(30000);
			}
		}.start(); //starting the thread

		new Thread()
		{
			public void run()
			{
				acc.deposit(20000);
			}
		}.start(); //starting the thread
		new Thread()
		{
			public void run()
			{
				acc.display();
			}
		}.start(); //starting the thread
	}
}


/*Output:
	Starting withdrawl...
	Balance is insufficient !!
	Starting deposit...
	₹(Rs.)20000 Deposited
	Balance is ₹(Rs.): 40000
*/