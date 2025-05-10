// WAP to check if a number is a Buzz Number

package Day3;

import java.util.Scanner;

public class P34_buzz_n_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // A Buzz Number ends in 7 or is divisible by 7
        if (num % 10 == 7 || num % 7 == 0) {
            System.out.println(num + " is a Buzz Number.");
        } else {
            System.out.println(num + " is NOT a Buzz Number.");
        }
        sc.close();
    }
}
