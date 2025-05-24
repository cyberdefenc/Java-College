package Day0002;
//Find third Maximum Element and minimum Elements
//int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
//int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;


import java.util.Scanner;

public class P9_third_max_min_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the size of array -: ");
        n = sc.nextInt();

        int arr[] = new int[n], i;

        System.out.println("Enter the array values ");

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize with extreme values
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

        for (i = 0; i < n; i++) {
            // For maximums
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3 && arr[i] != max2 && arr[i] != max1) {
                max3 = arr[i];
            }

            // For minimums
            if (arr[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min3 = min2;
                min2 = arr[i];
            } else if (arr[i] < min3 && arr[i] != min2 && arr[i] != min1) {
                min3 = arr[i];
            }
        }

        // Results
        if (max3 == Integer.MIN_VALUE) {
            System.out.println("No distinct third maximum value found.");
        } else {
            System.out.println("Third Maximum is: " + max3);
        }

        if (min3 == Integer.MAX_VALUE) {
            System.out.println("No distinct third minimum value found.");
        } else {
            System.out.println("Third Minimum is: " + min3);
        }

        sc.close();
    }
}
