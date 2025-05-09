// P2. Prevent overriding of a method across the program using the final keyword

class A{
   final void display() // // final keyword prevents this method from being overridden in any subclass
   {
        System.out.println("Base Class");
    }
}

class B extends A
{
    void display() // Here it will always throw compile time error as final keyword is used in base class
    {  
        System.out.println("Derived Class");

    }
}

class P1_Demo_Override_{

    public static void main(String[] args) {
        B obj=new B();
        obj.display();  //Since it is an object of B,so frist it will find function in it first,Will override base class disaply function
        
    }
}