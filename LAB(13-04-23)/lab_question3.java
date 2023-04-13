package lab;

interface BankAccount1 {//parent interface class
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount1 implements BankAccount1 { //child class 
    private int accountNumber;
    private double balance;

    public CheckingAccount1(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " dollars.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " dollars.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class lab_question3 {
	public static void main(String[] args) {
		//object of child class
        CheckingAccount account = new CheckingAccount(15000, 1000.0);
      //child class method
        account.deposit(700.0);
        account.withdraw(400.0);
        account.withdraw(1500.0);
    }
}
