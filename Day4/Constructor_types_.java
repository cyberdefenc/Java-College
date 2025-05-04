// Java Program Demonstrating All Three Types of Constructors
// ----------------------------------------------------------
// | Constructor Type     | Parameters       | Purpose                     |
// |----------------------|------------------|-----------------------------|
// | Default Constructor  | None             | Initializes default values  |
// | Parameterized        | Yes              | Initializes with user data  |
// | Copy Constructor     | Object reference | Creates copy of object      |
// ----------------------------------------------------------


package Day4;

class Student {
    String name;
    int rollNo;
    double marks;

    // Default Constructor
    Student() {
        name = "Not Assigned";
        rollNo = 0;
        marks = 0.0;
    }

    // Parameterized Constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = s.marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        
    }
}

public class Constructor_types_ {
    public static void main(String[] args) {

        System.out.println("Using Default Constructor:");
        Student s1 = new Student();
        s1.display();

        System.out.println("Using Parameterized Constructor:");
        Student s2 = new Student("Utkarsh", 101, 95.5);
        s2.display();

        System.out.println("Using Copy Constructor:");
        Student s3 = new Student(s2); // copy of s2
        s3.display();
    }
}
