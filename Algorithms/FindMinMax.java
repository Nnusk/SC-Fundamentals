/*Lineal search
-> Checking element one by one
-> Comparing each element with the target value
-> Stopping when the element is found or the list ends
-> NO sorting required
-> Complexity O(n)*/

public class FindMinMax {
    public static void main(String[] args) { // entry point
        // ------------Declaring the variables--------------
        int[] numbers = { 4, 2, 7, 1, 9 };
        int min = numbers[0]; // assume the first element is the minimum
        // int max = numbers[0]; //assume the first element is the maximum
        int index = 0;

        // ------------------LOOP---------------------
        // Traverse the array
        for (int i = 0; i < numbers.length; i++) {
            // If current element is smaller, update min
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }

        // --------------Output the result---------------
        System.out.println("Minimum element is:" + min + " found at index: " + index);

    }
}
