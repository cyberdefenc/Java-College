//Check whether a character is vowel or consonant using switch-case 
//logic to convert lower manually by ASCII code without toLowerCase().

package DAY1;
import java.util.Scanner;

public class Q5s2 {
    
    
    public static void main(String args[])
    {
      System.out.print("Enter the character :- ");
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      
      if(ch>='A' &&  ch<='Z')  //logic to convert lower manually by ASCII code
      ch=(char)(ch+32); //add 32 to ASCII value of Ch

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
