package Day0010;

interface Walkable
{
    void walk();  // In interfaace all implicitly public and abstract
    void run();
}

interface Runnable
{
    void walk();
    void run();
    
}

class Human implements Walkable,Runnable
{
    public void walk() // Make all method public explicitly
    {
        System.out.println("Human is walking");
    }
    public void run() 
    {
        System.out.println("Human is running");
    }

}


    


public class P4_inter_walkable_ {

    public static void main(String[] args) {
        Human h=new Human();
        h.walk();
        h.run();
    }
    
}
