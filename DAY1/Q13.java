//Find factorial of a number using for loop

package DAY1;

import java.util.Scanner;

public class Q13 
{

    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number -: ");
         int n=sc.nextInt(), fact=1,x=n;
         sc.close();
         for(;n>0;n--)
         {
            fact*=n;
         }
         System.out.print("So factorial of "+x+" is = "+fact);

       
    }
    
}
