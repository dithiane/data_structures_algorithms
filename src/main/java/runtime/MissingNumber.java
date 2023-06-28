package runtime;

    public class MissingNumber {
        // * time complexity is O(n)
        // * space complexity is O(n)
        public static int missingNumber(int[] arr, int maxNum) {
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
    }
