// Write a program to demonstrate method overloading.



package Day7;


class Add{

  void sum(int a){
    System.out.println(a);
  }   

  void sum(double a){
    System.out.println(a);
    
  } 
}

public class P1_metho_overloading_ {

    public static void main(String[] args) {
            Add c=new Add();
            c.sum(5);
            c.sum(5.5);
        
    }


    
}
