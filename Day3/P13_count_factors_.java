// WAP to count all the factors of a given number and display it

package Day3;

import java.util.Scanner;

public class P13_count_factors_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(),count=0;

       
        int i=2;
        while (i<n)
        {
            if(n%i==0)
            {
                count+=1;
           }
            i++;
        }
        System.out.print("Count of factors of " + n + " is: " +(count+2));
        sc.close();


       
    }
}
