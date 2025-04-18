//Check whether a character is vowel or consonant using switch-case 
//logic to convert lower manually by ASCII code without toLowerCase().
//restric user to type other than character

package DAY1;
import java.util.Scanner;

public class Q5s3 {
    
    
    public static void main(String args[])
    {
      System.out.print("Enter the character :- ");
      Scanner sc=new Scanner(System.in);
      char ch;

      while (true) {
        System.out.print("Enter a single alphabetic character (A-Z or a-z): ");
        String input = sc.next();

        // Validate: only 1 character and it must be a letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            ch = input.charAt(0);
            break; // valid input, break the loop
        } else {
            System.out.println("Invalid input! Please enter only ONE alphabetic character.");
        }
    }

      switch(ch)
      {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(ch+" is vowel.");
            break;

            default:
            System.out.println(ch+" is consonant.");
      }

      sc.close();
   
   
    }

}
