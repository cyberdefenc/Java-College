package Day0001;

import java.util.Scanner;

public class P4_pos_neg_ {
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
