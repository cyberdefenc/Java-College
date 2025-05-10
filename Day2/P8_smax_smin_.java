//Find second Maximum Element and minimum Elements

package Day2;

import java.util.Scanner;


public class P8_smax_smin_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Enter the size of array -: ");
        n=sc.nextInt();
        
        int arr[]=new int[n],i;

        System.out.println("Enter the array values ");

        for( i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE; //here in maxim we given min value because as soon as we get bigger value we will replace it
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE; //here in min we given max value because as soon as we get smaller value we will replace it
 
        for(i=0;i<n;i++)
        {
         //max1 and max2
          if(arr[i]>max1)
          {
            max2=max1;
            max1=arr[i];
          }

          else if(arr[i]>max2 && arr[i]!=max1)
          max2=arr[i];

          //min 1 and min2
          if(arr[i]<min1)
          {
            min2=min1;
            min1=arr[i];
          }

          else if(arr[i]<min2 && arr[i]!=min1)
          min2=arr[i];

        }

        
        if (max2 == Integer.MIN_VALUE) {
         System.out.println("No distinct second maximum value found.");
     } else {
         System.out.println("Second Maximum is: " + max2);
     }

     if (min2 == Integer.MAX_VALUE) {
         System.out.println("No distinct second minimum value found.");
     } else {
         System.out.println("Second Minimum is: " + min2);
     }
        
        sc.close();

      }

        

    }
    

