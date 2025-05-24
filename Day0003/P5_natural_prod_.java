package Day0003;
// WAP to find product of 'n' natural numbers


import java.util.Scanner;

public class P5_natural_prod_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        
        System.out.println("Product of first " + n + " natural numbers is: " + prod);
        sc.close();
    }
    
}
