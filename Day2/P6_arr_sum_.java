//sum of 1d array elements

package Day2;

import java.util.Scanner;


public class P6_arr_sum_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Enter the size of array -: ");
        n=sc.nextInt();
        
        int arr[]=new int[n],sum=0;

        System.out.println("Enter the array values ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
           sum+=arr[i];
        }
        System.out.println("So Sum is = "+sum);

        sc.close();

    }
    
}
