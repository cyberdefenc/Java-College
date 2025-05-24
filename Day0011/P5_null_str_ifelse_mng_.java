package Day0011;
// P5. Write a program to take string as input if the user proceeed with null input ,handle it using if else


import java.util.Scanner;

class P5_null_str_ifelse_mng_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String str = sc.nextLine();

if (str == null || str.trim().isEmpty()) {
    System.out.println("You entered a null or empty string.");
} else {
    System.out.println("String entered is: " + str);
}
sc.close();
        
    }

    
}

