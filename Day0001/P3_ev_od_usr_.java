package Day0001;
// Java program to check whether a number is even or odd user defined input


import java.util.Scanner;

public class P3_ev_od_usr_ {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :- ");

        int a=sc.nextInt();
        if(a%2==0)
        System.out.println(a+" is even");
        else
        System.out.println(a+" is odd");

        sc.close();

    }

    
}
