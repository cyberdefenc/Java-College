package Day0009;
//  Create a class `BankAccount` with a private balance variable. Write getter and setter methods to
// deposit and withdraw money


import java.util.Scanner;

class BankAccount {
    private int balance;

    void setBalance(int amount) // Deposit money
    {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid amount. Cannot deposit.");
    }

    void withdraw(int withdraw_amount) {
        if (withdraw_amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (withdraw_amount > 0) {
            balance -= withdraw_amount;
            System.out.println("Amount Withdrawn Successfully");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    int getBalance() {
        return balance;
    }
}

public class P2_bankAccount_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount(); 
        System.out.println("Welcome to SBI ATM");


        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Amount to Deposit: ");
                    int depositAmount = sc.nextInt();
                    b.setBalance(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the Amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    b.withdraw(withdrawAmount);
                    break;

                case 3:
                    int currentBalance = b.getBalance();
                    System.out.println("Balance in Your Account is: " + currentBalance);
                    break;

                case 4:
                    System.out.println("Thank you for using SBI ATM.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice. Try Again.");
            }
        }
    }
}
