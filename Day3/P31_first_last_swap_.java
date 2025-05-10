// WAP to swap first and last digit of a number

package Day3;

import java.util.Scanner;

public class P31_first_last_swap_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
       
        String numStr = Integer.toString(num);
        
       
        if (numStr.length() == 1) {
            System.out.println("Number after swapping: " + num);
        } else {
            
            char firstDigit = numStr.charAt(0);
            char lastDigit = numStr.charAt(numStr.length() - 1);
            
            
            String swappedNum = lastDigit + numStr.substring(1, numStr.length() - 1) + firstDigit;
            System.out.println("Number after swapping: " + swappedNum);
        }
        sc.close();
    }
}
