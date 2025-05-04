// WAP to calculate the sum of alternate digits in a number

package Day3;

import java.util.Scanner;

public class Alter_sum_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        boolean isEven = true;
        
        while (num > 0) {
            int digit = num % 10; 
            if (isEven) {
                sum += digit; 
            }
            isEven = !isEven; 
            num /= 10; 
        }
        
        System.out.println("Sum of alternate digits: " + sum);
        sc.close();
    }
}
