package Day0006;
// Write a program where a base class Vehicle has a startEngine method.


class Vehicle{
    void startEngine()
    {
        System.out.println("Engine is On.");

    }
}

class Car extends Vehicle{
    @Override
   void startEngine(){
    System.out.println("Car Engine Starting.");
   }

}

public class P10_engine_ {
    public static void main(String[] args) {

        Car c=new Car();
        c.startEngine();
        
    }
    
}
