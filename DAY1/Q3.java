//positive ,negative,zero check if else
package DAY1;
import java.util.Scanner;

public class Q3 {
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
