package Day0003;
// WAP to extract and display all digits from a given number

import java.util.Scanner;

public class P6_extract_digits_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        String x=sc.next();

        // Extracting digits from the number
        for( int i=0 ; i<x.length() ; i++ )
        {
            System.out.println(x.charAt(i));
        }
  
        sc.close();
    }    
}
