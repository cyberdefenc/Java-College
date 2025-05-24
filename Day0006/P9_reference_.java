package Day0006;
// P6. Program to demonstrate reference and reference variable

class A {
    void show() {
        System.out.println("Hello from A");
    }
}

public class P9_reference_ {
    public static void main(String[] args) {
        A obj = new A();  // 'obj' is a reference to the object of class A
        obj.show();       // accessing the object via the reference
    }
}

