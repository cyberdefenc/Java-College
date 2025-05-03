//Write a program to reverse a number using while loop

package DAY1;

import java.util.Scanner;

public class Rev_no_ {

public static void main(String[] args)
{
      Scanner sc = new Scanner(System.in);
         System.out.print("Enter number -: ");
         int n=sc.nextInt(),rev=0,x=n;

         while(n>0)
         {
          rev=rev*10+n%10;
          n=n/10;
         }

         System.out.print("So reverse of "+x+" is -: "+rev);
         sc.close();
}
    
}
