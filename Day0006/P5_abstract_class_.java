package Day0006;
// P5. Program to demonstrate abstract class

abstract class Animal  // can not create object of abstraact class
{
        abstract void sound(); //abstract method with no body

        void eat() //non-abstract method
        {
            System.out.println("Animal Eats.");

        }

        
}

class Cat extends Animal{

    void sound() // will override the previous sound method
    {
        System.out.println("Meow");
    }

}



public class P5_abstract_class_ {

    public static void main(String[] args) {
    //    Animal a=new Animal(); // will always throw error because you can not create object of abstract class

        Cat c=new Cat(); // Subclass
        c.sound(); //calling overridden method
        c.eat(); // calling non abstract method from abstract class
    }
    
}
