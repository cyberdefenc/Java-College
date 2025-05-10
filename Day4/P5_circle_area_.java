// P5. Create a class Circle with radius. 
// Write methods to calculate area and circumference of the circle.

package Day4;

class Circle {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
        
    }
}

public class P5_circle_area_ {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5.0;
        c1.display();
    }
}
