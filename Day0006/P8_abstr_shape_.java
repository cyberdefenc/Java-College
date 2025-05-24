package Day0006;
//  Create an abstract class Shape with an abstract method draw.

abstract class Shape{
     
    abstract void draw(); // abstract method can not have body,they need to be overridden in subclasses
} 

class Circle extends Shape{
    @Override
    void draw(){
        
        System.out.println("It's Circle");

    }

}

class Square extends Shape { 
    @Override
    void draw() {
        System.out.println("It's Square");
    }
}
    


public class P8_abstr_shape_ {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();

        Square s=new Square();
        s.draw();
        
    }
    
}
