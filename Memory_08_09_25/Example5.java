package Memory_08_09_25;

import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    int accountNumber;
    double balance;

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        } else {
            System.out.println("❌ Insufficient Balance!");
        }
    }

    // Display account information
    void displayAccountInfo() {
        System.out.println("----- Account Info -----");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Check balance
    void checkBalance() {
        System.out.println("✅ Current Balance: " + balance);
    }
}

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        BankAccount B1 = new BankAccount();
        System.out.print("Enter name of account holder: ");
        B1.accountHolderName = sc.nextLine();
        System.out.print("Enter account number: ");
        B1.accountNumber = sc.nextInt();
        System.out.print("Enter account balance: ");
        B1.balance = sc.nextDouble();

        int choice;
        do {
            System.out.println("\n===== Banking Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    B1.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    B1.deposit(depAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = sc.nextDouble();
                    B1.withdraw(withAmount);
                    break;
                case 4:
                    System.out.println("🚪 Exiting... Thank you!");
                    break;
                default:
                    System.out.println("⚠ Invalid choice. Try again!");
            }
        } while (choice != 4);

        sc.close();
    }
}
