package Day0008;
// Make a method in the same class which has main method,and call that method in main method



public class P1_method_in_main_class_ {
    public static void main(String[] args) {
     
        P1_method_in_main_class_ obj=new P1_method_in_main_class_();
     
        obj.hello();
    }

       
    int hello()
    {
        int a=5;
        System.out.println("In Main Class");
        return a;

    }
    
}
