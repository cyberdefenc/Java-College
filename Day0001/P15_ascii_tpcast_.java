package Day0001;
// Take a character input and print its ASCII value (Type casting)


import java.util.Scanner;

public class P15_ascii_tpcast_ 
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
