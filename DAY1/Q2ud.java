//even odd using if else user defined program
package DAY1;
import java.util.Scanner;

public class Q2ud {

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
