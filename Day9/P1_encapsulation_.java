// Encapsulation  overview




package Day9;

class Atm
{
    private int a;
    
    void setRupees(int a)
    {
        this.a=a;

    }

    int getRupees()
    
    {
        return a;
    }

}





public class P1_encapsulation_ {

    public static void main(String[] args) {
        Atm o=new Atm();
        o.setRupees(500);
     int x= o.getRupees();
     System.out.println("Amount in Account is -: "+x);
    
    }
    
}
