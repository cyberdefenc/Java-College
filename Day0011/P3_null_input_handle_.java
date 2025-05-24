package Day0011;

import java.util.Scanner;

public class P3_null_input_handle_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a string:");
            String str = sc.nextLine();

            
            if (str == null || str.trim().isEmpty()) {
               
                throw new IllegalArgumentException("String input is null or empty");
            }

            System.out.println("String entered is: " + str);
        }

        catch (Exception e) {
            System.out.println("You entered a null or empty string.");
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
