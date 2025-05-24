package Day0001;
//Use switch-case to build a simple calculator (Add, Sub, Mul, Div)
//direct from keyboard press


import java.util.Scanner;


public class P20_cal_frm_keybd_ {
   
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        
        Scanner sc=new Scanner(System.in);
        

         while(true)
         {
        
         System.out.print("Enter 1st number  -: ");
         
         float n=sc.nextInt(),m;
         System.out.print("\nEnter 2st number  -: ");
         m=sc.nextInt();
        
         System.out.print("Enter operation (+, -, *, /, %, x to exit): ");
         char op = sc.next().charAt(0); 

         switch(op)
         {
            case '+':
            System.out.println("Addition =  "+(n+m));
            break;

            case '-':
            System.out.println("Substraction =  "+(n-m));
            break;

            case '*':
            System.out.println("Multiplication = "+(n*m));
            break;

            case '/':
            if (m == 0) 
            System.out.println("! Denominator cannot be zero");
            else 
            System.out.println("Division (Quotient) = " + (n / m));
            break;

            case '%':
            if (m == 0) 
            System.out.println("! Denominator cannot be zero");
            else 
            System.out.println("Remainder = "+(n%m));
            break;

            case 'x':
            case 'X':
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
