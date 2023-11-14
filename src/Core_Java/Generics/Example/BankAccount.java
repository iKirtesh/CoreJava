package Core_Java.Generics.Example;


import java.util.ArrayList;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account account1 = new Account(1, "John", 1000);
        Account account2 = new Account(2, "Smith", 2000);
        Account account3 = new Account(3, "Mary", 3000);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        for (Account account : accounts) {
            System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());
        }
    }
}
