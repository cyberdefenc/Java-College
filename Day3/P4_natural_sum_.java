// WAP to find sum of 'n' natural numbers

package Day3;
import java.util.Scanner;

public class P4_natural_sum_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
    
}
