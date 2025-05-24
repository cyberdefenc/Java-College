package Day0010;

interface Animal{
    void makeSound();
}

class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class P6_inter_animal_ {
    public static void main(String[] args) {
        Animal myDog = new Dog(); //used the interface reference to call the method from Dog object
        // This is polymorphism in action
        myDog.makeSound(); 
    }
    
}


