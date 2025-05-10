// Create a class that has overloaded methods for displaying the area of different shapes.


class AreaCalculator {

    // Area of a circle: π * r^2
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    // Area of a rectangle: length * width
    void area(double length, double width) {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }

    // Area of a triangle: 0.5 * base * height
    void area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            double result = 0.5 * base * height;
            System.out.println("Area of Triangle: " + result);
        } else {
            System.out.println("Invalid shape type.");
        }
    }
}


public class P3_area_ {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        calc.area(5.0);                  // Circle
        calc.area(4.0, 6.0);             // Rectangle
        calc.area(3.0, 4.0, true);       // Triangle
    }
}

