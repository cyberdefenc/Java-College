// P2. Exception Handling in array


package Day11;

public class P2_array_exception_ {
    public static void main(String[] args) {
        int arr[]={1,2,3,55};
        try{
            System.out.println(arr[8]);
        }

        catch(Exception e){
            System.out.println(e);

        }
        System.out.println("This is the end of the program");
    }
    
}
