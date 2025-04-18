package DAY1;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Logic to check multiple of 3
        if (number % 3 == 0) {
            System.out.println(number + " is a multiple of 3.");
        } else {
            System.out.println(number + " is NOT a multiple of 3.");
        }

        sc.close();
    }
    
}
