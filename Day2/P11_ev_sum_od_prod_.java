//sum of even and product of odd

package Day2;

import java.util.Scanner;


public class P11_ev_sum_od_prod_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Enter the size of array -: ");
        n=sc.nextInt();
        
        int arr[]=new int[n],even=0,odd=1;
        

        System.out.println("Enter the array values ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
           if(arr[i]%2==0)
           even+=arr[i];

           else
           odd*=arr[i];
        }
        System.out.println("So Sum of even is = "+even+" and Product of odd is = "+odd);

        sc.close();

    }
    
}

