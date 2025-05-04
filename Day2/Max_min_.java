//max and min

package Day2;

import java.util.Scanner;


public class Max_min_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Enter the size of array -: ");
        n=sc.nextInt();
        
        int arr[]=new int[n],max,i,min;

        System.out.println("Enter the array values ");

        for( i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        max=arr[0];
        min=arr[0];

        for( i=1;i<n;i++)
        {
           if(arr[i]>max)
           max=arr[i];

           if(arr[i]<min)
           min=arr[i];
        }
        System.out.println("So Max is "+max+" and Min is "+min);

        

        
        sc.close();
    }
   
}
