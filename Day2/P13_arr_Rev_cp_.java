//Reverse the Array, do not make changes in orginal array just print output in reverse

package Day2;

import java.util.Scanner;


public class P13_arr_Rev_cp_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Enter the size of array -: ");
        n=sc.nextInt();
        
        int arr[]=new int[n];
        

        System.out.println("Enter the array values ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }


        System.out.println("So reverse array is ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
           
        }

        sc.close();
          
        }
       

        
    

    }
    


