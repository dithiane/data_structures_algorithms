package runtime;

public class MissingNumberReducedMemory {
    // * time complexity is O(n)
    // * space complexity is O(1)
    public static int missingNumberReducedMemory(int[] arr, int maxNum) {
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
