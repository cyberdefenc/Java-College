package Day0012;

import java.util.ArrayList;

public class P3_max_subarr_ {
    public static void main(String[] args) {

      
        int[] original = {-4, 6, 0, -7, 3, 4, -8};

        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : original) {
            arr.add(num);
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

        // Step 4: Kadane's Algorithm with subarray tracking
        int maxSoFar = original[0];
        int currentMax = original[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < original.length; i++) {
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

        // Step 5: Print the maximum subarray and sum
        System.out.print("Maximum Subarray: [ ");
        for (int i = start; i <= end; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println("]");
        System.out.println("Maximum Subarray Sum: " + maxSoFar);
    }
}
