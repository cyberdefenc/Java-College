// WAP to check if a number is a Magic Number

package Day3;

import java.util.Scanner;

public class Magic_no_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Add digits
                num /= 10; // Remove last digit
            }
            num = sum; // Replace num with the sum of digits
        }
        
        if (num == 1) {
            System.out.println("The number is a Magic Number.");
        } else {
            System.out.println("The number is NOT a Magic Number.");
        }
        sc.close();
    }
}
