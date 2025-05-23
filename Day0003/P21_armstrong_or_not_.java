package Day0003;
// WAP to check a number is Armstrong or not


import java.util.Scanner;

public class P21_armstrong_or_not_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;
        int n = 0;

        
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, n); // digit^n
            temp /= 10;
        }

        
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
