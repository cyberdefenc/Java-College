package Day0007;
//  The method should print the string and then print the square of the integer.

class Classroom {
    String name;
    int age;

   
    Classroom(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void print() {
        System.out.println("Name: " + name + ", Age: " + (age*age));
    }

    
    void print(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + (age*age));
    }
}

public class P5_square_int_ {
    public static void main(String[] args) {
        
        Classroom obj = new Classroom("Utkarsh", 21);

       
        obj.print();

       
        obj.print("Ravi", 19);
    }
}
