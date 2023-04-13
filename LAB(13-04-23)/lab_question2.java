package lab;

abstract class BankAccount { //abstract parent  class
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) { //parent class method
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
  //abstract parent class method
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount { //child class
    public CheckingAccount(int accountNumber, double balance) { // child class method
        super(accountNumber, balance);
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit " + amount + " dollars.");
    }
    
    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw " + amount + " dollars.");
        } else {
            System.out.println("Insufficient balance.");
        }
   }
}
public class lab_question2 {
	public static void main(String[] args) {
		//object of child class
        CheckingAccount account = new CheckingAccount(12345, 1000.0);
        //child class method
        account.deposit(500.0);
        account.withdraw(2000.0);
        account.withdraw(1500.0);
    }

}

