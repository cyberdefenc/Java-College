// P3. Create a class that has overloaded methods for displaying the area of different shapes.
class AreaDisplay {
    void area(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void area(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(int base, int height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

class Area_Overload_ {
    public static void main(String[] args) {
        AreaDisplay obj = new AreaDisplay();
        obj.area(5.0);
        obj.area(4.0, 6.0);
        obj.area(3, 7);
    }
}