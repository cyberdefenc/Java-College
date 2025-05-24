package Day0002;
//Linear Search


import java.util.Scanner;


public class P12_linear_search_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Enter the size of array -: ");
        n=sc.nextInt();
        
        int arr[]=new int[n],key,index=0,pos=0;
        

        System.out.println("Enter the array values ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        System.out.print("Enter the Element that you want to Search -: ");
        key=sc.nextInt();

        for(int i=0;i<n;i++)
        {
           if(arr[i]==key)
           {
            index=i;pos=i+1;
            break;
           }

          
        }
        System.out.println("So your key("+key+") is found at index "+index+" and position is "+pos+" th");

        sc.close();

    }
    
}

