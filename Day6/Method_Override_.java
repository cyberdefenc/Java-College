class Vehicle{
    void run(){
        System.out.println("Runs on Roads");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Has Two wheels");
        super.run();
    }
    
}

public class Method_Override_ {

    public static void main(String[] args) {
        Vehicle obj=new Bike();
        obj.run();
        
    }
    
}
