package Day0010;
// P2. Program to demonstrate Interface in Java


interface Clinet 
{
    void print();
    void show();

}


class Dev implements Clinet 
{
    public void print() 
    {
        System.out.println("Print the bill");
    }
    public void show() 
    {
        System.out.println("Show the menu");
    }
}

public class P2_interface_ 
{

    public static void main(String[] args)
     {
        Dev d = new Dev();
        d.print();
        d.show();
     }
    
}
