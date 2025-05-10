// P4. Create a class Car with fields brand, model, and price. 
// Write a method to display car details. 
// Create multiple objects and display info.

package Day4;

class Car {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
       
    }
}

public class P4_car_info_ {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Tata";
        c1.model = "Punch";
        c1.price = 700000;

        Car c2 = new Car();
        c2.brand = "Hyundai";
        c2.model = "i20";
        c2.price = 850000;

        c1.displayDetails();
        c2.displayDetails();
    }
}
