//Single-Level Inheritance - Shape Example
//Create a class Shape with method draw().
//Create a class Circle that inherits from Shape and adds method calculateArea().
//Create an object of Circle and call both methods.

package Day5;

class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    void calculateArea() {
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle with radius 5: " + area);
    }
}

public class P3_s_shape_ {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.calculateArea();
    }
}
