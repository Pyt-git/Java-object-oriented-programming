public class BankAccount {
  String owner;
  double balance;
  
  public BankAccount(String o, double b) {
    owner = o; 
    balance = b; 
  }

  public void deposit(double amount) {
    balance += amount; 
  }

  public void withdraw(double amount) {
    balance -= amount; 
  }

  public double getBalance() {
    return balance; 
  }
}

