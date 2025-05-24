package Day0011;

import java.util.Scanner;

public class P7_str_uppercase_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

           
            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Input string is null or empty.");
            }

            
            String upper = input.toUpperCase();
            System.out.println("Uppercase: " + upper);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

