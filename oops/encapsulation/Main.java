package encapsulation;

class BankAccount {
    private double balance;
    private String accountHolder;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rudraprasad", 100000);
        account.deposit(23000);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());
    }
}
