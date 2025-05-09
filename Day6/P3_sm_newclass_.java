// P3. What if final keyword is used but same method is made in completely new class

class A{
    final void display() // final keyword prevents this method from being overridden in any subclass
    {
         System.out.println("Base Class");
     }
 }
 
 class B 
 {
     void display() // Here it will not throw any error as the method is completely declared in new class,this class is not related to previous class
     {  
         System.out.println("Derived Class");
 
     }
 }
 
 class P3_sm_newclass_{
 
     public static void main(String[] args) {
         B obj=new B();
         obj.display();  
         
     }
 }