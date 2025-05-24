package Day0003;
// WAP to print all Armstrong number between 1 to 100


public class P22_armstrong_1_100_ {
    
    public static void main(String[] args) {
        
        // Loop through numbers from 1 to 100
        System.out.println("Armstrong numbers between 1 and 100 are:");
        
        for (int num = 1; num <= 100; num++) {
            int originalNum = num;
            int result = 0;
            int n = 0;
            
            // Count digits
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                n++;
            }
            
            // Calculate the Armstrong number sum
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                result += Math.pow(digit, n); // digit^n
                temp /= 10;
            }
            
            // Check if it is an Armstrong number
            if (result == originalNum) {
                System.out.println(originalNum);
            }
        }
    }
}
