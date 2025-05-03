//Use switch-case to build a simple calculator (Add, Sub, Mul, Div)

package DAY1;

import java.util.Scanner;

public class Cal_swh_ {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        

         while(true)
         {
        
         System.out.print("Enter 1st number  -: ");
         Scanner sc=new Scanner(System.in);
         float n=sc.nextInt(),m;
         int choice;
         System.out.print("\nEnter 2st number  -: ");
         m=sc.nextInt();
         System.out.println("Menu");
         System.out.println("1 to Add(+)");
         System.out.println("2 to Subtract(-)");
         System.out.println("3 to Multiply(*)");
         System.out.println("4 to Divide(Quotient)");
         System.out.println("5 for Modulus(%)");
         System.out.println("6 to exit");
         System.out.println("Enter Your choice -: ");
         choice=sc.nextInt();

         switch(choice)
         {
            case 1:
            System.out.println("Addition =  "+(n+m));
            break;

            case 2:
            System.out.println("Substraction =  "+(n-m));
            break;

            case 3:
            System.out.println("Multiplication = "+(n*m));
            break;

            case 4:
            if (m == 0) 
            System.out.println("! Denominator cannot be zero");
            else 
            System.out.println("Division (Quotient) = " + (n / m));
            break;

            case 5:
            if (m == 0) 
            System.out.println("! Denominator cannot be zero");
            else 
            System.out.println("Remainder = "+(n%m));
            break;

            case 6:
            System.out.println("Exiting the calculator...");
            sc.close();
            return; 

            default:
            System.out.println("Try again");

          }
          System.out.println();
          

        }
        
    }
}
