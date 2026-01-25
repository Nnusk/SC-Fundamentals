//FOR and FOR EACH 
/* ->Repeat an action x times
    -> Ideal to transvers an Array (as you know the lenght
FOR EACH is the fastest way to read all the elemens from an array
without using index*/

package ControlStructures; //for the projects that are not in the root folder or 1st one

public class ForEach {

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5 };

        // (inicializing; condition; increment)
        for (int i = 0; i < numbers.length; i++) {
            // It repeats while the condition still true
            System.out.print(numbers[i] + " ");
        }

        System.out.println(" ");

        for (int element : numbers) {
            System.out.print(element + " "); // 'element' takes every position value
        }

    }
}