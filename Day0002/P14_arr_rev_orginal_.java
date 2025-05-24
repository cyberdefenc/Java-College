package Day0002;
//Reverse the Array but make changes in orignal array


import java.util.Scanner;


public class P14_arr_rev_orginal_ {
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

        System.out.println("Original Array is");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


        //We Reversing the original array 
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Reversed Array is");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
          
        }
       

        
    

    }
    


