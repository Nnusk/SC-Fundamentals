//Sorting
//Buuble Sort (O(n2))
//Selection Sort (O(n2))
//Insertion Sort (O(n2))
//Merge Sort (O(n log n)) - Divide&Conquer
//Quick Sort (O(n log n))

import java.util.Arrays;
import java.util.Scanner; // Importing Scanner class for user input

public class Sorting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        int arraySize;

        // Array to sort:
        System.out.println("Enter the number of elements in the array:");
        arraySize = scanner.nextInt();
        numbers = new int[arraySize];

        // Input array elements:
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        // Internal method:
        Arrays.sort(numbers);
        System.out.println("The array has to look like: " + Arrays.toString(numbers));

        // Bubble Sort
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
        System.out.println("Buuble Sort:    " + Arrays.toString(numbers));

        // Selection Sort
        // Move through the array one position at a time
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i; // Assume current position is a minumum
            // Find the semallest element in the remaining array
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println("Selection Sort: " + Arrays.toString(numbers));

        // Insertion Sort
        // Start from the second element
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i]; // current element to insert
            int j = i - 1;
            // Shift elements higher than key to the right
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            // Insert the key at the correct position
            numbers[j + 1] = key;
        }
        System.out.println("Insertion Sort: " + Arrays.toString(numbers));
        scanner.close();

        // Merge Sort O(n log n guaranteed)
        /*
         * Merge sort is a divide and conquer algorithm
         * Divide the array in halfs.
         * Sorts recursively
         * Combines (merge) the sorted parts
         */

        // Quick Sort O(n log n usually, but (n2) worst case scenario)
        /*
         * Quick sort is a divide and conquer algorithm
         * Choose a pivot
         * Divide the array
         * Sorts recursively
         * Combines (merge) the sorted parts
         */

        // I understand merge sort and quick sort conceptually. I know how they work,
        // their time and space complexity, and when to use them, even if I don’t
        // implement them from scratch.
    }

}