/*Lineal search
-> Checking element one by one
-> Comparing each element with the target value
-> Stopping when the element is found or the list ends
-> NO sorting required
-> Complexity O(n)*/

import java.util.Scanner; // Importing Scanner class for user input

public class LinearSearch {
    public static void main(String[] args) { // entry point
        // ------------Declaring the variables--------------
        int[] numbers = { 4, 2, 7, 1, 9 };
        int target;
        int result = -1;
        Scanner choosenNum = new Scanner(System.in);

        System.out.println("Enter a number to search:");
        target = choosenNum.nextInt();

        // ------------------LOOP---------------------
        // Search the array item by item
        for (int i = 0; i < numbers.length; i++) {
            // We compare the actual element with the target
            if (numbers[i] == target) {
                result = i; // element found
                break; // exit the loop
            }
        }
        // If we finish the loop and the target is not found result remains -1

        // --------------Output the result---------------
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);

        }
        choosenNum.close();
    }
}
