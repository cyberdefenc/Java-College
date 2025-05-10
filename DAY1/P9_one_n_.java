// Print numbers from 1 to N using a for loop

package DAY1;
import java.util.Scanner;

public class P9_one_n_ {
    public static void main(String[] args) {
        System.out.print("Enter the number -: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(i);
        }

        sc.close();
    }
    
}
