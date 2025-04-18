//ASCII code for Upper and Lower Case Alphabets

package ascii;

public class Q1 {

        public static void main(String[] args) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                char lower = (char)(ch + 32);
                System.out.println(ch + " -> " + lower + " | Difference: " + ((int)lower - (int)ch));
            }
        }
    
    
}
