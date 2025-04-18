//Type casting example: Convert float to int and print both

package DAY1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.print("Enter the float number only-: ");
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();

        System.out.println("Before Typecasting = "+n);
        int m=(int)n; //it is explicit or narrowing  typecasting
        
    
        System.out.println("After typecasting from Float to Integer = "+m);
        System.out.println("Typecasting type = explicit or narrowing");
     

        

        sc.close();
    
}
    
}
