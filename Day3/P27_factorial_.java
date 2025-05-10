// WAP to find factorial of a number

package Day3;

import java.util.Scanner;

public class P27_factorial_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt(),x=num;

        long factorial = 1;

       
        for (; num>0 ; num--) {
            factorial *= num;
        }

        System.out.println("Factorial of " + x + " is: " + factorial);
        sc.close();
    }
}
