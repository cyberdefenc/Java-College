// WAP to print Fibonacci numbers in a given range

package Day3;

import java.util.Scanner;

public class Fibo_in_range_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number of range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number of range: ");
        int end = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci numbers between " + start + " and " + end + " are: ");

        while (first <= end) {
            if (first >= start) {
                System.out.print(first + " ");
            }

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
