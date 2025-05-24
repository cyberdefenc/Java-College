package Day0006;
// P1. Write a simple program to demonstrate method overriding using classes

class A{
    void display(){
        System.out.println("Base Class");
    }
}

class B extends A
{
    void display(){
        System.out.println("Derived Class");

    }
}

class P1_Demo_Override_{

    public static void main(String[] args) {
        B obj=new B();
        obj.display();  //Since it is an object of B,so frist it will find function in it first,Will override base class disaply function
        
    }
}
