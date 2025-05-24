package Day0006;
// Method Override



public abstract class Animal {
    abstract void makeSound();
}

// First subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Second subclass
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos.");
    }
}

// Third subclass
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}
 {
    
}
