// WAP to find all factors of a given number

package Day3;
import java.util.Scanner;

class P11_factors_n_{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Factors of " + n + " are: 1,");
        int i=2;
        while (i<n)
        {
            if(n%i==0)
            {
                System.out.print(i + ",");
           }
            i++;
        }
        System.out.print(n);
        sc.close();


       
    }

}