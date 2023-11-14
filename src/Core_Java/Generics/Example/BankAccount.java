package Core_Java.Generics.Example;


import java.util.ArrayList;
import java.util.Scanner;


// Account Type with String Generics Saving or Current with Account Number, Account Holder Name and Balance
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

}

// Saving Account Type with String Generics Saving or Current with Account Number, Account Holder Name and Balance
class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

}

// Current Account Type with String Generics Saving or Current with Account Number, Account Holder Name and Balance
class CurrentAccount extends Account {
    private double overDraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overDraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

}

// Bank Class with String Generics Saving or Current with Account Number, Account Holder Name and Balance
class Bank {
    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void printAccounts() {
        for (Account account : accounts) {
            System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());
        }
    }

    public void printAccounts(String accountType) {
        for (Account account : accounts) {
            if (accountType.equals("Saving")) {
                if (account instanceof SavingAccount) {
                    System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());
                }
            } else if (accountType.equals("Current")) {
                if (account instanceof CurrentAccount) {
                    System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());
                }
            }
        }
    }

    public void printAccounts(double balance) {
        for (Account account : accounts) {
            if (account.getBalance() >= balance) {
                System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());
            }
        }
    }

    public void printAccounts(double minimumBalance, double maximumBalance) {
        for (Account account : accounts) {
            if (account.getBalance() >= minimumBalance && account.getBalance() <= maximumBalance) {
                System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());
            }
        }
    }

    public void printAccounts(String accountType, double minimumBalance, double maximumBalance) {
        for (Account account : accounts) {
            if (accountType.equals("Saving")) {
                if (account instanceof SavingAccount) {
                    if (account.getBalance() >= minimumBalance && account.getBalance() <= maximumBalance) {
                        System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());

                    }
                }
            } else if (accountType.equals("Current")) {
                if (account instanceof CurrentAccount) {
                    if (account.getBalance() >= minimumBalance && account.getBalance() <= maximumBalance) {
                        System.out.println(account.getAccountNumber() + " " + account.getAccountHolderName() + " " + account.getBalance());
                    }
                }
            }
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        SavingAccount savingAccount1 = new SavingAccount("SBI001", "Raj", 10000, 4.5);
        SavingAccount savingAccount2 = new SavingAccount("SBI002", "Ravi", 20000, 4.5);
        SavingAccount savingAccount3 = new SavingAccount("SBI003", "Rahul", 30000, 4.5);
        SavingAccount savingAccount4 = new SavingAccount("SBI004", "Ramesh", 40000, 4.5);
        SavingAccount savingAccount5 = new SavingAccount("SBI005", "Rajesh", 50000, 4.5);

        CurrentAccount currentAccount1 = new CurrentAccount("SBI006", "Kirtesh", 10000, 10000);
        CurrentAccount currentAccount2 = new CurrentAccount("SBI007", "Priti", 20000, 10000);
        CurrentAccount currentAccount3 = new CurrentAccount("SBI008", "Shubham", 30000, 10000);
        CurrentAccount currentAccount4 = new CurrentAccount("SBI009", "Pratik", 40000, 10000);
        CurrentAccount currentAccount5 = new CurrentAccount("SBI010", "Rahul", 50000, 10000);

        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);
        bank.addAccount(savingAccount4);
        bank.addAccount(savingAccount5);

        bank.addAccount(currentAccount1);
        bank.addAccount(currentAccount2);
        bank.addAccount(currentAccount3);
        bank.addAccount(currentAccount4);
        bank.addAccount(currentAccount5);

        Scanner scanner = new Scanner(System.in);
        String ch = "y";
        while (ch.equals("y")) {
            System.out.println("1. Print All Accounts");
            System.out.println("2. Print Saving Accounts");
            System.out.println("3. Print Current Accounts");
            System.out.println("4. Print Accounts with Minimum Balance");
            System.out.println("5. Print Accounts with Minimum and Maximum Balance");
            System.out.println("6. Print Saving Accounts with Minimum and Maximum Balance");
            System.out.println("7. Print Current Accounts with Minimum and Maximum Balance");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("All Accounts");
                    bank.printAccounts();
                    break;
                case 2:
                    System.out.println("Saving Accounts");
                    bank.printAccounts("Saving");
                    break;
                case 3:
                    System.out.println("Current Accounts");
                    bank.printAccounts("Current");
                    break;
                case 4:
                    System.out.print("Enter Minimum Balance: ");
                    double minimumBalance = scanner.nextDouble();
                    System.out.println("Accounts with Minimum Balance");
                    bank.printAccounts(minimumBalance);
                    break;
                case 5:
                    System.out.print("Enter Minimum Balance: ");
                    double minimumBalance1 = scanner.nextDouble();
                    System.out.print("Enter Maximum Balance: ");
                    double maximumBalance1 = scanner.nextDouble();
                    System.out.println("Accounts with Minimum and Maximum Balance");
                    bank.printAccounts(minimumBalance1, maximumBalance1);
                    break;
                case 6:
                    System.out.print("Enter Minimum Balance: ");
                    double minimumBalance2 = scanner.nextDouble();
                    System.out.print("Enter Maximum Balance: ");
                    double maximumBalance2 = scanner.nextDouble();
                    System.out.println("Saving Accounts with Minimum and Maximum Balance");
                    bank.printAccounts("Saving", minimumBalance2, maximumBalance2);
                    break;
                case 7:
                    System.out.print("Enter Minimum Balance: ");
                    double minimumBalance3 = scanner.nextDouble();
                    System.out.print("Enter Maximum Balance: ");
                    double maximumBalance3 = scanner.nextDouble();
                    System.out.println("Current Accounts with Minimum and Maximum Balance");
                    bank.printAccounts("Current", minimumBalance3, maximumBalance3);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.print("Do you want to continue (y/n): ");
            ch = scanner.next();
        }
    }
}