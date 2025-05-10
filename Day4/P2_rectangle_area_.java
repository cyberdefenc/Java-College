// Create a class Rectangle with length and breadth as fields. Add methods to calculate area and 
// perimeter. Create objects with different values and call those methods.

package Day4;
import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    void setValues(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }

    double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        
    }
}

public class P2_rectangle_area_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Enter length and breadth for Rectangle 1:");
        System.out.print("Length: ");
        double l1 = sc.nextDouble();
        System.out.print("Breadth: ");
        double b1 = sc.nextDouble();
        r1.setValues(l1, b1);

        System.out.println("Enter length and breadth for Rectangle 2:");
        System.out.print("Length: ");
        double l2 = sc.nextDouble();
        System.out.print("Breadth: ");
        double b2 = sc.nextDouble();
        r2.setValues(l2, b2);

        System.out.println("\nRectangle 1 Details:");
        r1.display();

        System.out.println("Rectangle 2 Details:");
        r2.display();

        sc.close();
    }
}
