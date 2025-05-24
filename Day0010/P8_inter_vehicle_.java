package Day0010;

interface Vehicle{
    default void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car implements Vehicle{
  
}

public class P8_inter_vehicle_ {
    
    public static void main(String[] args) {
        Car c = new Car();
        c.start(); 
    }
}
