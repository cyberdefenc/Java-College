// WAP to find sum of all digits in a given number

package Day3;
import java.util.Scanner;

public class P7_digits_sum_ {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt(),sum=0,d=0;

        while( n > 0 )
        {
            d=n%10;
            sum+=d;
            n=n/10;
        }
        System.out.println("Sum of digits is: "+sum);
        sc.close();
    }
    
}
