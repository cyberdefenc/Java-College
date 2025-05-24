package Day0007;
// Overload the method print in a class to accept a string and an integer argument.


class Classroom {
    String name;
    int age;

   
    Classroom(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    
    void print(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class P4_overload_print_ {
    public static void main(String[] args) {
        
        Classroom obj = new Classroom("Utkarsh", 21);

       
        obj.print();

       
        obj.print("Ravi", 19);
    }
}
