//  WAP to check if a number is a Harshad number

package Day3;

import java.util.Scanner;

public class Harshad_no_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sumOfDigits = 0;
        int temp = num;

        // Calculate the sum of digits
        while (temp != 0) {
            sumOfDigits += temp % 10;  // Add the last digit
            temp /= 10;  // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (num % sumOfDigits == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
