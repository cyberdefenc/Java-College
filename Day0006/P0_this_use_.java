package Day0006;
//  Use of this keyword

class Student {
    int age;

    Student(int age) {
        this.age = age;
    }

    void print() {
        System.out.println(age);
    }
}

public class P0_this_use_ {

    public static void main(String[] args) {
        Student obj = new Student(16);
        obj.print();
    }

}
