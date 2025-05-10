// WAP to print all the perfect number between two given range

package Day3;

import java.util.Scanner;

public class P20_all_perf_n_m_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("\nPerfect numbers from " + start + " to " + end + " are:");

        
        for (int num = start; num <= end; num++) {
            int sum = 0;

            
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

           
            if (sum == num) {
                System.out.println(num + " is a Perfect Number");
            }
        }

        sc.close();
    }
}
