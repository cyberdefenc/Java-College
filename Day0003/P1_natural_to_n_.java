package Day0003;
// WAP to print natural numbers up-to 'n'

import java.util.Scanner;

public class P1_natural_to_n_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Natural numbers up to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    
    
}
