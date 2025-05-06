// P1. Program to demonstrate method overloading with different return types
class OverloadDemo {
    void show() {
        System.out.println("No parameters");
    }

    int show(int a) {
        System.out.println("One parameter: " + a);
        return a;
    }

    double show(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
        return a + b;
    }
}

public class Meth_two_Overl_ {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.show();                    // No parameters
        int x = obj.show(5);          // One parameter: 5
        double y = obj.show(10, 15);  // Two parameters: 10, 15

        System.out.println("Returned int: " + x);
        System.out.println("Returned double: " + y);
    }
}
