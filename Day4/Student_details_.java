// Create a class Student with fields name, rollNumber, and marks. Write a method to display 
// student details. Create 3 student objects and display their data

package Day4;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    void Display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
        
}

public class Student_details_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Enter the details of student 1:");
        System.out.print("Name: ");
        s1.name = sc.nextLine();
        System.out.print("Roll Number: ");
        s1.rollNumber = sc.nextInt();
        System.out.print("Marks: ");
        s1.marks = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter the details of student 2:");
        System.out.print("Name: ");
        s2.name = sc.nextLine();
        System.out.print("Roll Number: ");
        s2.rollNumber = sc.nextInt();
        System.out.print("Marks: ");
        s2.marks = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the details of student 3:");
        System.out.print("Name: ");
        s3.name = sc.nextLine();
        System.out.print("Roll Number: ");
        s3.rollNumber = sc.nextInt();
        System.out.print("Marks: ");
        s3.marks = sc.nextDouble();

        System.out.println("\n---- Student Details ----");
        s1.Display();
        s2.Display();
        s3.Display();

        sc.close();
    }
}
