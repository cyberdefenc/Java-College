package Day0012;

import java.util.ArrayList;
import java.util.Scanner;

public class P4_usrdef_max_subarr_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
            arr.add(original[i]);
        }

        
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }

        System.out.println("Manually Sorted ArrayList: " + arr);

        // Kadane's Algorithm with subarray tracking
        int maxSoFar = original[0];
        int currentMax = original[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (original[i] > currentMax + original[i]) {
                currentMax = original[i];
                tempStart = i;
            } else {
                currentMax += original[i];
            }

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
                start = tempStart;
                end = i;
            }
        }

        // Step 5: Print max subarray
        System.out.print("Maximum Subarray: [ ");
        for (int i = start; i <= end; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println("]");
        System.out.println("Maximum Subarray Sum: " + maxSoFar);

        sc.close();
    }
}
