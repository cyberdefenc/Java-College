// Design a class `Student` with private variables `name` and `marks`. Write methods to set and get the values. Also, write a method to print student details.

package Day9;

class Student {
    private String name;
    private int marks;

    
    void setValues(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

   
    void getValues() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class P3_student_ {
    public static void main(String[] args) {
        Student s = new Student();
        s.setValues("Ram", 55);     
        s.getValues();              
    }
}
