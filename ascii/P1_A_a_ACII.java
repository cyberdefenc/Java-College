// Prints uppercase letters A-Z with their corresponding lowercase conversions and ASCII differences.

package ascii;

public class P1_A_a_ACII {

        public static void main(String[] args) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                char lower = (char)(ch + 32);
                System.out.println(ch + " -> " + lower + " | Difference: " + ((int)lower - (int)ch));
            }
        }
    
    
}
