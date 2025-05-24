package Day0002;
//Instialize and empty array but with size and inputs from user and print all one by one with [i]
//and Arrays class is also used here


import java.util.Scanner;
import java.util.Arrays;

public class P5_arr_for_i_ {
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

        System.out.println("Your Entered values is");
        for(int i=0;i<n;i++)
        {
            System.out.println(Arrays.toString(arr)); //all elements at once with box format as String output
        }

        sc.close();

    }
    
}
