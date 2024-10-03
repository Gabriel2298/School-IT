package Sesiunea10;
//Bank Account Management System
//Imagine you're designing a simple Bank Account management system. Given the sensitive nature of financial information, you need to make sure that the data of an account holder is securely encapsulated and cannot be directly accessed or modified without appropriate checks.
//Requirements:
//
//Classes:
//        BankAccount
//Attributes:
//           accountHolderName: The name of the account holder.
//           accountNumber: A unique identifier for the bank account. This should be automatically generated and read-only after account creation.
//           balance: The current balance in the account. This should not be directly accessible.
//Methods:
//        deposit(double amount): Allow a specified amount to be added to the balance. Ensure the deposited amount is positive.
//        withdraw(double amount): Allow a specified amount to be subtracted from the balance. Ensure the account has enough funds and that the withdrawal amount is positive. If not, print an appropriate error message.
//        getBalance(): Return the current balance. This is the only way to access the balance attribute from outside the class.
//        getAccountDetails(): Print details about the account, including the account holder's name and account number.
//
//Instructions:
//            Use private access modifiers for the attributes to ensure they are not directly accessible from outside the BankAccount class.
//            Implement public methods to provide controlled access and modification of these attributes.
//            Ensure that all methods have necessary checks to protect the integrity of the account data.
//       Bonus:
//            Implement a transferFunds(BankAccount targetAccount, double amount) method that allows money to be transferred from one account to another.
//            Ensure all required checks are in place for a successful transaction.
public class BankAccount {
    // Private attributes for encapsulation
    private String accountHolderName;
    private final String accountNumber; // Read-only after creation
    private double balance; // Not directly accessible

    // Static variable to help generate unique account numbers
    private static int accountCounter = 1000;

    // Constructor to initialize account holder name and generate account number
    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0; // Default balance starts at 0
    }

    // Generate a unique account number
    private String generateAccountNumber() {
        return "ACC" + (accountCounter++);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: " + balance);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance (read-only access)
    public double getBalance() {
        return balance;
    }

    // Method to print account details
    public void getAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    // Bonus: Method to transfer funds between accounts
    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Successfully transferred " + amount + " to " + targetAccount.accountHolderName);
        } else if (amount > balance) {
            System.out.println("Insufficient funds to transfer. Current balance: " + balance);
        } else {
            System.out.println("Transfer amount must be positive.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        BankAccount account1 = new BankAccount("Gabi");
        BankAccount account2 = new BankAccount("Ioan");

        account1.getAccountDetails();
        account2.getAccountDetails();

        account1.deposit(350);
        account1.withdraw(100);

        System.out.println("Alice's balance: " + account1.getBalance());

        account1.transferFunds(account2, 200);
        System.out.println("Bob's balance after transfer: " + account2.getBalance());
    }
}
