package Day0005;
//  Multi-Level Inheritance - Student Example
// Create a class Person with method displayName().
//Create a class Student that inherits Person and adds method displayClass().
//Create a class Monitor that inherits Student and adds method checkDiscipline().
//Create an object of Monitor and call all three methods.


class Person {
    void displayName() {
        System.out.println("Person Name: Utkarsh");
    }
}

class Student extends Person {
    void displayClass() {
        System.out.println("Student Class: B.Tech IoT & Cybersecurity");
    }
}

class Monitor extends Student {
    void checkDiscipline() {
        System.out.println("Monitor is checking classroom discipline.");
    }
}

public class P2_m_person_ {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        m.displayName();
        m.displayClass();
        m.checkDiscipline();
    }
}
