// P1. Exception Handling


package Day11;

import java.util.Scanner;

public class P1_exception_handling_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide");
        int a = sc.nextInt();
        int b = sc.nextInt();   

        try {
            int c=a/b;
            System.out.println("The result is: " + c);
        }

        catch(Exception e){
            System.out.println("We cannot divide by zero");


        }

        System.out.println("Hello");
        System.out.println("This is the end of the program");

        sc.close();
        
    }
    
}
