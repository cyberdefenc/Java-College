package Day0003;
// WAP to check the factor of a number is prime or not


import java.util.Scanner;
import java.util.ArrayList;

public class P14_prime_Factor_chk_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

       
        int i=2;
        ArrayList<Integer> oddarr=new ArrayList<>();
        ArrayList<Integer> evenarr=new ArrayList<>();
        oddarr.add(1);
        if(n%2==0)
        {
            evenarr.add(n);
        }
        else
        {
            oddarr.add(n);
        }
        
        int count=0;

        while (i<n)
        {
            if(n%i==0)
            {
                if(i%2!=0)
                {
                    oddarr.add(i);
                }
                else{
                    evenarr.add(i);
                }
                count+=1;
            }
            i++;
        }
        System.out.print("Count of factors of " + n + " is: " +(count+2));
        System.out.println("\nEven factors are: " + evenarr);
        System.out.println("Odd factors are: " + oddarr);
        sc.close();


       
    }
    
}
