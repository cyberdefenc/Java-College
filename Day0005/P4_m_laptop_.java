package Day0005;
// Multi-Level Inheritance - Laptop Example
//Create a class Device with method powerOn().
//Create a class Laptop that inherits Device and adds method boot().
//Create a class GamingLaptop that inherits Laptop and adds method startGame().
//Create an object of GamingLaptop and call all three methods.




class Device {
    void powerOn() {
        System.out.println("Device is powered on.");
    }
}


class Laptop extends Device {
    void boot() {
        System.out.println("Laptop is booting...");
    }
}


class GamingLaptop extends Laptop {
    void startGame() {
        System.out.println("Starting high-end game on Gaming Laptop!");
    }
}

public class P4_m_laptop_ {
    public static void main(String[] args) {
        GamingLaptop gl = new GamingLaptop();
        gl.powerOn();     // from Device
        gl.boot();        // from Laptop
        gl.startGame();   // from GamingLaptop
    }
}
