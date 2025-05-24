package Day0010;

interface AA{

    void display();
}

interface BB{

    void display();
}

class Demo implements AA, BB {

    @Override
    public void display() {
        System.out.println("Display method from both interfaces A and B");
    }
}

public class P5_inter_A_B_ {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.display(); 
    }
    
}
