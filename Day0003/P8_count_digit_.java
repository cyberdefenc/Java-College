package Day0003;
// WAP to find the count of all digits in a given number

import java.util.Scanner;

public class P8_count_digit_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        String n=sc.next();
        System.out.println("The count of digits in the number is: "+n.length());
        sc.close();
    }
    
    
}
