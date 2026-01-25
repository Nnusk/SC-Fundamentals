/*TWO POINTERS ALGORITHM
-> Uses two index to traverse the array simultaneously
-> Solves problems faster than nested loops
 */

import java.util.Scanner;

public class TwoPointers {

    // Find two numbers that add up to a target in a sorted array

    public static void main(String[] args) { // entry point
        int[] numbers = { 1, 2, 4, 5, 7, 11 };
        int target = 9;
        int left = 0; // pointer at the beggining
        int right = numbers.length - 1; // pointer at the end
        int sum;
        boolean result;

        while (left < right) {

            sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println(numbers[left] + " + " + numbers[right] + " = " + target);
                result = true; // found the pair thay returns target number
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        result = false; // did not found the pair that returns target
        System.out.println("No number sum returns " + target);
    }

}