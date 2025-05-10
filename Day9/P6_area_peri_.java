// Create a class `Rectangle` with private fields `length` and `width`. Write setter methods to assign values and getter methods to return area and perimeter.
package Day9;

class Rectangle {
    private int length;
    private int width;

    
    void setLength(int length) {
        this.length = length;
    }

    void setWidth(int width) {
        this.width = width;
    }

    
    int getArea() {
        return length * width;
    }

   
    int getPerimeter() {
        return 2 * (length + width);
    }
}

public class P6_area_peri_ {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Area of Rectangle: " + r.getArea());
        System.out.println("Perimeter of Rectangle: " + r.getPerimeter());
    }
}

