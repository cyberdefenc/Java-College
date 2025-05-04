// WAP to print alternate prime numbers between 1 to 100

package Day3;

import java.util.Scanner;

public class Alter_prime_ {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int s = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int e = sc.nextInt();

        System.out.print("Prime numbers from " + s + " to " + e + " are: ");

        int count = 0; // to count primes

        for (int i = s; i <= e; i++) {
            if (i < 2) continue; // Skip numbers less than 2

            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (count % 2 == 0) {
                    System.out.print(i + " ");
                }
                count++; // increment only if a prime is found
            }
        }
        sc.close();
    }
    
}
