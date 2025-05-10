// WAP to print all even numbers between two given range


package Day3;

import java.util.Scanner;

public class P2_even_print_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m; 
        System.out.print("Enter the starting number: ");
        n = sc.nextInt();
        System.out.print("Enter the ending number: ");
        m = sc.nextInt();
        System.out.println("Even numbers from " + n + " to " + m + " are: ");

        if(n%2!=0){
            n++;
        }

        for (int i = n; i <= m; i+=2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    
}
