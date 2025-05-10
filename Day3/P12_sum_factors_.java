// WAP to find sum of all factors of a given number

package Day3;

import java.util.Scanner;

public class P12_sum_factors_ {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(),sum=0;

       
        int i=2;
        while (i<n)
        {
            if(n%i==0)
            {
                sum+=i;
           }
            i++;
        }
        System.out.print("Sum of factors of " + n + " is: " +(1+sum+n));
        sc.close();


       
    }
    
}
