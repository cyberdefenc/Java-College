package Day0004;
// P3. Create a class BankAccount with fields accountNumber, accountHolder, and balance.
// Implement methods to deposit and withdraw money.

import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
       
    }
}

public class P3_bank_account_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account1 = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        account1.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        account1.accountNumber = sc.nextLine();

        System.out.print("Enter Initial Balance: ₹");
        account1.balance = sc.nextDouble();

        account1.displayDetails();

        
        System.out.print("Enter amount to deposit: ₹");
        double dep = sc.nextDouble();
        account1.deposit(dep);
        account1.displayDetails();

       
        System.out.print("Enter amount to withdraw: ₹");
        double wth = sc.nextDouble();
        account1.withdraw(wth);
        account1.displayDetails();

        sc.close();
    }
}
