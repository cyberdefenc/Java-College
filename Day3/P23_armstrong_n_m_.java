// WAP to print all Armstrong number between two given range

package Day3;

import java.util.Scanner;

public class P23_armstrong_n_m_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the starting number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the ending number (m): ");
        int m = sc.nextInt();

        System.out.println("Armstrong numbers between " + n + " and " + m + " are:");

        
        for (int num = n; num <= m; num++) {
            int originalNum = num;
            int result = 0;
            int digitCount = 0;

            
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }

            
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                result += Math.pow(digit, digitCount); 
                temp /= 10;
            }

            
            if (result == originalNum) {
                System.out.println(originalNum);
            }
        }

        sc.close();
    }
}
