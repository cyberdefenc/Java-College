// P9. Write a program where you overload a method display in such a way that it can print an array of integers, an array of strings, and a 2D array of integers.
class ArrayDisplay {
    void display(int[] arr) {
        System.out.println("Integer Array:");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    void display(String[] arr) {
        System.out.println("String Array:");
        for (String s : arr) System.out.print(s + " ");
        System.out.println();
    }

    void display(int[][] arr) {
        System.out.println("2D Integer Array:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}

class Array_ovr_ {
    public static void main(String[] args) {
        ArrayDisplay obj = new ArrayDisplay();
        obj.display(new int[]{1, 2, 3});
        obj.display(new String[]{"Java", "Python"});
        obj.display(new int[][]{{1, 2}, {3, 4}});
    }
}
