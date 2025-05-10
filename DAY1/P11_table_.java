//Print multiplication table of a number using loop

package DAY1;

import java.util.Scanner;

public class P11_table_ {
     public static void main(String[] args) {
        System.out.print("Enter the number -: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Table of "+n+" is ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(+n+" * "+i+" = "+n*i);
            
        }

        

        sc.close();
    
}
    
}
