// Create a class with multiple sum methods where one takes two integers, another takes three integers, and another takes two double values. All methods should print the sum of the arguments passed.

package Day7;

class Addo{
    void sum(int a, int b){
        System.out.println(a+b);
    }

        void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

        void sum(double a, double b){
        System.out.println(a+b);
    }

}

public class P2_multi_sum_ {
    public static void main(String[] args) {
        Addo a=new Addo();

        a.sum(5,3);
        a.sum(5,3,5);
        a.sum(5.5,6.6);
        
    }
    
}
