package Core_Java.Generics.Example;

class NewAccount<T> {
    private T accountHolder;
    private double balance;

    public NewAccount(){
        this(null, 0.0);
    }

    public NewAccount(T accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void setAccountHolder(T accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public T getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }

    @Override
    public String toString() {
        return "Account Holder: " + accountHolder + "\nBalance: $" + balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Creating a Saving Account for an individual
        NewAccount<String> savingAccount = new NewAccount<>();
        savingAccount.setAccountHolder("John Doe");
        savingAccount.setBalance(1000.0);

        System.out.println("Saving Account Details:");
        System.out.println(savingAccount);

        savingAccount.deposit(100.0);
        savingAccount.withdraw(200.0);

        // Creating a Current Account for a company
        NewAccount<String> currentAccount = new NewAccount<>();
        currentAccount.setAccountHolder("ABC Company");
        currentAccount.setBalance(10000.0);

        System.out.println("\nCurrent Account Details:");
        System.out.println(currentAccount);

        currentAccount.deposit(1000.0);
        currentAccount.withdraw(3000.0);
    }
}
