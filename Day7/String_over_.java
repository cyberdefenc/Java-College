// P5. Overload the method print in a class to accept a string and an integer argument.
class Printer {
    void print(String message) {
        System.out.println("Message: " + message);
    }

    void print(int number) {
        System.out.println("Number: " + number);
    }
}

class String_over_ {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.print("Hello World");
        obj.print(10);
    }
}