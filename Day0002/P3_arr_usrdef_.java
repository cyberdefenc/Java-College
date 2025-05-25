package Day0002;



import java.util.Scanner;
import java.util.Arrays;

public class P3_arr_usrdef_ {
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
        System.out.println(Arrays.toString(arr)); //all elemetns at once
        

        sc.close();

    }
    
}
