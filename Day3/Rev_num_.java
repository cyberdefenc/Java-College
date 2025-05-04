// WAP to print reverse of a given number

package Day3;
import java.util.Scanner;

public class Rev_num_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
        sc.close();
    }
    
}
