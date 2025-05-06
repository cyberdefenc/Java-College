// P6. The method should print the string and then print the square of the integer.
class SquarePrinter {
    void print(String msg, int num) {
        System.out.println("Message: " + msg);
        System.out.println("Square: " + (num * num));
    }
}

class Print_ovr_ {
    public static void main(String[] args) {
        SquarePrinter obj = new SquarePrinter();
        obj.print("Test", 4);
    }
}