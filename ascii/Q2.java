//ASCII code of every buttons pressed in keyboard

package ascii;

import java.util.Scanner;

public class Q2 
{

    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);
        System.out.println("Type any key to see its ASCII code (Type 'exit' to stop):");

        while (true) {
            System.out.print("Input: ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program.");
                break;
            }

            // Loop through every character typed by user
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                int ascii = (int) ch; //typecasting
                System.out.println("Character: '" + ch + "' | ASCII Code: " + ascii);
            }
        }

        sc.close();
    }

}