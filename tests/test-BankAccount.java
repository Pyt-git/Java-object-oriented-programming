import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

  void testConstructorInitializesFields() {
    BankAccount acc = new BankAccount("Alice", 100.0);
    assertEquals("Alice", acc.owner);
    assertEquals("100.0", acc.balance);
  }

  void testDepositIncreasesBalance() {
    BankAccount acc = new BankAccount("Bob", 50.0); 
    acc.deposit(25.0);
    assertEquals(75.0, acc.getBalance());
  }

  void testWithdrawDecreasesBalance() {
    BankAccount acc = new BankAccount("Charlie", 80.0);
    acc.withdraw(30.0);
    assertEquals(50.0, acc.getBalance());
  }

  void testWithdrawZero() {
    BankAccount acc = new BankAccount("Max", 100.0);
    acc.withdraw(0.0);
    assertEquals(100.0, acc.getBalance());
  }

  void testDepositZero() {
    BankAccount acc = new BankAccount("Victor", 94.0);
    acc.withdraw(0.0);
    assertEquals(94.0, acc.getBalance());
  }

  void testMultipleOperations() {
    BankAccount acc = new BankAccount("Dana", 100.0);
    acc.deposit(50.0); // 150.0
    acc.withdraw(20.0); // 130.0
    acc.deposit(10.0); // 140.0
    assertEquals(140.0, acc.getBalance());

  }
}
  
