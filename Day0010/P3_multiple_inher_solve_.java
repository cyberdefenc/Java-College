package Day0010;

interface Client
{
    
    void show();

}

interface Client2 
{
    
    void show();
}


class Dev implements Client,Client2
{

        public void show() 
    {
        System.out.println("This is common feature needed by both the clients");
    }

    public void print() 
    {
    }

}
public class P3_multiple_inher_solve_ {
    
    public static void main(String[] args) {
        Dev obj= new Dev();
        obj.show();
        
    }
}
