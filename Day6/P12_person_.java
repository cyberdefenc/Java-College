//  Create a Person class with a displayDetails method that prints basic details (name, age).


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String grade;
    String school;

    Student(String name, int age, String grade, String school) {
        super(name, age);
        this.grade = grade;
        this.school = school;
    }

    @Override
    void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Grade: " + grade);
        System.out.println("School: " + school);
    }
}

public class P12_person_ {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 16, "10th", "Green Valley High School");
        s.displayDetails();
    }
}
