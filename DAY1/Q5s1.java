//Check whether a character is vowel or consonant using switch-case 
//acutal character with ASCII value

package DAY1;
import java.util.Scanner;

public class Q5s1 {
    
    
    public static void main(String args[])
    {
      System.out.print("Enter the character :- ");
      Scanner sc=new Scanner(System.in);
      int ch=sc.next().toLowerCase().charAt(0);

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
