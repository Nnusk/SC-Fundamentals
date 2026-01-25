/*Binary search
-> Requires a sorted array
-> Searches the element by dividing the array in half:
    -> Compares the middle element with the target
    -> If the target is less than the middle element, it searches in the left half
    -> If the target is greater than the middle element, it searches in the right half
-> Complexity O(log n)*/

import java.util.Arrays;
import java.util.Scanner; // Importing Scanner class for user input

public class BinarySearch {
    public static void main(String[] args) { // entry point

        // ------------Declaring the variables--------------
        int[] numbers = { 4, 2, 7, 1, 9 };
        int target;
        int result = -1;
        Scanner choosenNum = new Scanner(System.in);
        int left = 0;
        int right = numbers.length - 1;

        System.out.println("Enter a number to search:");
        target = choosenNum.nextInt();

        // ----------------------SORT-------------------------
        // Sort the array using internal method O(n log n)
        Arrays.sort(numbers);
        // Sort the array using Buuble Sort O(n2)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                // Compare adjacent elements
                if (numbers[j] > numbers[j + 1]) {

                    // Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Making sure the array is sorted (Loop for method)
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
        // Making sure the array is sorted (for-each method)
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        // Making sure the array is sorted (Arrays.toString method)
        System.out.println(Arrays.toString(numbers));
        System.out.println(" ");

        // --------------BINARY SEARCH----------------------

        while (left <= right) {
            // Calculate middle index
            int mid = left + (right - left) / 2;

            // If target is found
            if (numbers[mid] == target) {
                result = mid;
            }

            // If target is higher, ignore left half
            if (numbers[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // --------------Output the result---------------
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);

        }
        choosenNum.close();
    }
}
