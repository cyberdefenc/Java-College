package Day0001;



import java.util.Scanner;

public class P18_prime_chk_ {
    public static void main(String[] args) {
        System.out.print("Enter number -: ");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         

        boolean isprime=true;
        if(n<=1)
        isprime=false;

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isprime=false;
                break;
            }
        }

        if(isprime)
        System.out.println(n+" is prime.");

        else
        System.out.println(n+" is not prime.");
        
      sc.close();
    }
    
}
