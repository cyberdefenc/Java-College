package Day0010;
// P1. Multiple Inheritance problem in Java(Ambuigity)

       // TODO Auto-generated method stub
        // Ambiguity in Multiple Inheritance
        // class A
        // class B extends A
        // class C extends A


class A {
    void sum() {
        System.out.println("I am A");
    }
}

class B{
    void sum() {
        System.out.println("I am B");
    }

}

class C extends A,B // Will throw Abugity error //not allowed multiple inheritance in Java
{
    void sum() {
        System.out.println("I am C");
    }
}

class P1_ambuigity_{


    public static void main(String[] args) {
 
        C obj=new C();
        obj.sum(); // Ambiguity error

}

}
