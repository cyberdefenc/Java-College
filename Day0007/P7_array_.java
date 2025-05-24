package Day0007;
// Write a program where you overload a method display in such a way that it can print an array of integers, an array of strings, and a 2D array of integers.

class Array {

    
    void display(int[] arr) {
        System.out.println("Displaying Integer Array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(); // for new line
    }

    
    void display(String[] arr) {
        System.out.println("Displaying String Array:");
        for (String val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(); // for new line
    }

    
    void display(int[][] arr) {
        System.out.println("Displaying 2D Integer Array:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println(); // new row
        }
    }
}

public class P7_array_ {
    public static void main(String[] args) {
        Array obj = new Array();

        int[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Cyber", "Security", "Ethical", "Hacking"};
        int[][] int2DArray = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        obj.display(intArray);
        obj.display(strArray);
        obj.display(int2DArray);
    }
}

