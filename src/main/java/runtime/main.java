package runtime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNumber = missingNumber(arr, maxNum);
        System.out.println("This is missing number: "  + missingNumber);

        // * Reduce Runtime *
        missingNumber = missingNumberReducedTime(arr, maxNum);
        System.out.println("This is missing number: "  + missingNumber);

        // * Reduce Memory *
         missingNumber = missingNumberReducedMemory(arr, maxNum);
        System.out.println("This is missing number: "  + missingNumber);


    }

    //  Initially, focus on reducing runtime—this should be solvable in O(n) time. You can create an additional data
    //  structure using a Java library if necessary.
    //  Write a version that uses a straightforward solution and runs in O(n) time.


    // * time complexity is O(n)
    // * space complexity is O(n)
    private static int missingNumber(int [] arr, int maxNum) {
        boolean[] inArray = new boolean[maxNum + 1];
        for (int num : arr) {
            inArray[num] = true;
        }
        for (int i = 1; i <= maxNum; i++) {
            if (!inArray[i]) {
                return i;
            }
        }
        return 0;
    }
    // Now, think about reducing memory use—did your first solution require you to create a new object?
    // Can you think of a different way to think about the problem that doesn’t use additional memory,
    // even if it takes more time?

    // There’s a way you could solve this in O(n log n) time that doesn’t require creating another large
    // data structure (technically, while being O(n log n) in runtime, it is O(1) in “runspace”—it uses the
    // same amount of memory no matter how big n is).


    // * time complexity is O(n log n)
    // * space complexity is O(1)
    private static int missingNumberReducedTime(int[] arr, int maxNum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return maxNum + 1;
    }

    // There’s a solution that has O(n) runtime and O(1) runspace, but it requires a bit of creative thinking about
    // the problem from a math perspective. See if you can find it.

    // * time complexity is O(n)
    // * space complexity is O(1)
    private static int missingNumberReducedMemory(int[] arr, int maxNum) {
        int XORresult = 0;
        for (int i = 1; i <= maxNum; i++) {
            XORresult ^= i;
        }
        for (int num : arr) {
            XORresult ^= num;
        }
        return XORresult;
    }

}