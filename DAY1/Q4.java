package DAY1;
import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number -: ");
        int a=sc.nextInt();

        System.out.print("Enter Second number -: ");
        int b=sc.nextInt();

        if(a>b)
        System.out.print(a+" is greater numbers");

        else
        System.out.print(b+" is greater numbers");

        sc.close();

    }
    
}
