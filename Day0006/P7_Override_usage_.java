package Day0006;
// @override usage

// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// First subclass using @Override
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Second subclass also using @Override
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Subclass that doesn't use @Override but still overrides (not recommended)
class Bird extends Animal {
    void makeSound() { // No @Override here — works, but not recommended
        System.out.println("Chirp");
    }
}

public class P7_Override_usage_ {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.makeSound();  // Bark
        cat.makeSound();  // Meow
        bird.makeSound(); // Chirp
    }
}
