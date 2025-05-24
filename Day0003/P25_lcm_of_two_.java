package Day0003;
// WAP to find LCM of two numbers


import java.util.Scanner;

public class P25_lcm_of_two_ {
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
        int lcm = (num1 * num2) / hcf;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}

