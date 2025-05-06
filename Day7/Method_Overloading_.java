// P1. Write a program to demonstrate method overloading.
class OverloadDemo {
    void show() {
        System.out.println("No parameters");
    }

    void show(int a) {
        System.out.println("One parameter: " + a);
    }

    void show(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }
}

public class Method_Overloading_ {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.show();
        obj.show(5);
        obj.show(10, 15);
    }
}