package runtime;

import java.util.Arrays;

public class MissingNumberReducedTime {
    // * time complexity is O(n log n)
    // * space complexity is O(1)
    public static int missingNumberReducedTime(int[] arr, int maxNum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return maxNum + 1;
    }
}
