package Day0006;
// P4. The Animal class should have a sound method (like "Animal makes sound"). The Dog class should override the sound method to print "Bark". Create an instance of Dog and call the sound method.

class Animal
{
    void sound()
    {
    System.out.println("Animal make sound");
    }
}

class Dog extends Animal
{
    void sound()
    {
     System.out.println("Dog Bark");
    }
}


public class P4_animal_sound_ {

    public static void main(String[] args) 
    {
        Dog d=new Dog();
        d.sound();
        
    }
    
}
