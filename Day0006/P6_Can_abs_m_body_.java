package Day0006;
// P6. Can Abstract methods in abstract class can have body

abstract class Animal {

    // Abstract method – MUST be overridden in subclass
    abstract void makeSound();  // No body allowed

    // Non-abstract method – can be used as-is
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class P6_Can_abs_m_body_ {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();  // Calls overridden abstract method
        d.eat();        // Calls defined method from abstract class
    }
}
