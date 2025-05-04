// WAP to find GCD of two numbers

package Day3;

import java.util.Scanner;

public class Gcd_ {
    // Method to find HCF using Euclidean Algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);
        

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + hcf);

        sc.close();
    }
}

