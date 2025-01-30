import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example data for demonstration
        System.out.println("Enter account holder's name:");
        String name = scanner.nextLine();

        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();

        // Creating an account instance
        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        // Display menu for balance enquiry
        System.out.println("\nWelcome to the Bank Balance Enquiry System");
        System.out.println("1. Check Balance");
        System.out.println("2. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.displayBalance();
                    break;
                case 2:
                    System.out.println("Thank you for using the Bank Balance Enquiry System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 2);

        scanner.close();
    }
}
