package Day0002;
//Instialize and empty array but with size and inputs from user and print all one by onewith [i]


import java.util.Scanner;


public class P4_arr_size_input_usr {
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
            System.out.println(arr[i]); //each elements one by one 
        }

        sc.close();

    }
    
}
