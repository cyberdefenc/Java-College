package Day0011;
// P4. Write a program to take string as input if the user proceeed with null input ,handle it using throw keyword


import java.util.Scanner;

public class P4_throw_mng_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a string:");
            String str = sc.nextLine();

            // Check for null or blank input
            if (str == null || str.trim().isEmpty()) {
                // Manually throw an exception
                throw new IllegalArgumentException("Input is null or empty");
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


