// Write a program to check whether the given number is positive, negative or zero.
package DAY1;
import java.util.Scanner;

public class Pos_neg_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number -: ");
        int a=sc.nextInt();
        if(a<0)
        System.out.println(a+" is negative number");

        else if(a>0)
        System.out.println(a+" is positive number");

        else
        System.out.println(a+" is zero");

        sc.close();
    }
    
}
