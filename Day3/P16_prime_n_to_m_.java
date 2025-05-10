// WAP to print all prime numbers between two given range

package Day3;
import java.util.Scanner;

public class P16_prime_n_to_m_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int s = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int e = sc.nextInt();

        System.out.print("Prime numbers from " + s + " to " + e + " are: ");

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
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
