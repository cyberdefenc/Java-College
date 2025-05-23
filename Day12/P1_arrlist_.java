

package Day12;
import java.util.ArrayList;

public class P1_arrlist_ {
    public static void main(String[] args) {
        
        ArrayList<String> arr = new ArrayList<>();

        
        arr.add("robin");
        arr.add("bob");
        arr.add("john");
        System.out.println("ArrayList: " + arr);

        arr.add(1,"jane");
         System.out.println("ArrayList: " + arr);


    }
    
}
