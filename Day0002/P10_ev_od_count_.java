package Day0002;



import java.util.Scanner;


public class P10_ev_od_count_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Enter the size of array -: ");
        n=sc.nextInt();
        
        int arr[]=new int[n],even,odd;
        even=odd=0;

        System.out.println("Enter the array values ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
           if(arr[i]%2==0)
           even+=1;

           else
           odd+=1;
        }
        System.out.println("So total even is = "+even+" and odd = "+odd);

        sc.close();

    }
    
}
