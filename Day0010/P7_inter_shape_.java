package Day0010;

interface Shape {
    double area(); 
}

class Circle implements Shape {
    private double radius;

   
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

public class P7_inter_shape_ {
    public static void main(String[] args) {
        Circle c = new Circle(5.0); 
        System.out.println("Circle area: " + c.area());
    }
}
