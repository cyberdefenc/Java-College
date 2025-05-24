package Day0003;
// WAP to print 'n' natural numbers in reverse order

import java.util.Scanner;

public class P3_natural_in_rev_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        
        System.out.println("Natural numbers in reverse order up to " + n + " are: ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    
}
