// Java program to check whether a number is even or odd user defined input


package DAY1;
import java.util.Scanner;

public class Ev_od_usr_ {

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
