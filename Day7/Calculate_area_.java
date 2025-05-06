// P4. Overload a method calculateArea for calculating the area of a circle (use radius as the argument), rectangle (use length and width), and triangle (use base and height).
class AreaCalculator {
    void calculateArea(double radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    void calculateArea(double length, double width) {
        System.out.println("Rectangle Area: " + (length * width));
    }

    void calculateArea(float base, float height) {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

class Calculate_area_ {
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.calculateArea(7.0);
        obj.calculateArea(5.0, 3.0);
        obj.calculateArea(6f, 4f);
    }
}