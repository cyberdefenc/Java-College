// P2. Create a class with multiple sum methods where one takes two integers, another takes three integers, and another takes two double values. All methods should print the sum of the arguments passed.
class SumDemo {
    void sum(int a, int b) {
        System.out.println("Sum of 2 integers: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }

    void sum(double a, double b) {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }
}

class Sum_Over_ {
    public static void main(String[] args) {
        SumDemo obj = new SumDemo();
        obj.sum(10, 20);
        obj.sum(1, 2, 3);
        obj.sum(5.5, 6.5);
    }
}