package Day0001;


import java.util.Scanner;

public class P7_vow_ASCII_ {
    
    
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
