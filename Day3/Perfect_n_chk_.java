package Day3;

import java.util.Scanner;

public class Perfect_n_chk_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number to check if it is a perfect number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find sum of proper divisors (excluding the number itself)
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check for perfection
        if (sum == num) {
            System.out.println(num + " is a Perfect Number ");
        } else {
            System.out.println(num + " is NOT a Perfect Number ");
        }

        sc.close();
    }
}
