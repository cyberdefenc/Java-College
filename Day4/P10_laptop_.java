// P10. Create a class Laptop with brand, RAM, and price. 
// Add a constructor to initialize values and a method to display them.

package Day4;

class Laptop {
    String brand;
    int RAM;
    double price;

    Laptop(String brand, int RAM, double price) {
        this.brand = brand;
        this.RAM = RAM;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Price: " + price);
   
    }
}

public class P10_laptop_ {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16, 65000);
        Laptop l2 = new Laptop("HP", 8, 50000);

        l1.display();
        l2.display();
    }
}
