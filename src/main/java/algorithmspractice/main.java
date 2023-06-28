package algorithmspractice;

import java.util.Arrays;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        // * 1. Linked lists

        // You will be given two linked lists in “reverse-digit” format. For example,
        // the number 123 would be represented in a linked list like this: 3 → 2 → 1
        // You should return the sum of these two numbers in the same “reverse-digit” format.
        // For 123 + 456, this should return 579, in the form of a linked list like this: 9 → 7 → 5.

        // ? What is the runtime of this function?
        // ! The runtime complexity of the addTwoNumbers function is O(n),
        // ! where n lengths of the input linked lists l1 and l2

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(3);
        l1.add(2);
        l1.add(1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(6);
        l2.add(5);
        l2.add(4);

        System.out.println(addTwoNumbers(l1, l2));

        // * 2. Sorting

        // Insertion Sort

        int[] arr = { 5, 2, 8, 3, 1, 6 };
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        /* ! Insertion Sort:
            Best Case: O(n),
            Worst Case: O(n^2),
            Average Case: O(n^2)

            ! Quick Sort:
            Best Case: O(n log n),
            Worst Case: O(n^2),
            Average Case: O(n^2)

            ! Merge Sort:
            Best Case: O(n log n),
            Worst Case: O(n log n),
            Average Case: O(n log n),
        */

        // * Recursion

        // Find the index of an item in a list using recursion.
        // Implement a function that takes in an item and an array of items, and returns the 0-based index of a sought
        // item: >>> recursive_search(“hey”, [“hey”, “there”, “you”]) 0
        // If the item isn’t in the list, return -1: >>> recursive_search(“porcupine”, [“hey”, “there”, “you”]) -1
        // Important: Solve this problem only with recursion—you cannot use a for or while loop in your solution!

        // ? What is the runtime of this function?
        // ! O(n)

        String[] words = { "hey", "there", "you" };
        int index = recursiveSearch("hey", words, 0);
        System.out.println(index);  // Output: 0

        index = recursiveSearch("porcupine", words, 0);
        System.out.println(index);  // Output: -1
    }

    public static int recursiveSearch(String item, String[] arr, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index].equals(item)) {
            return index;
        }
        return recursiveSearch(item, arr, index + 1);
    }
    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static  LinkedList<Integer> addTwoNumbers( LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> current = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < l1.size(); i++) {
            sum += l1.get(i);
            sum += l2.get(i);
            current.add(sum);
            sum = 0;
        }

        return current;
    }
}
