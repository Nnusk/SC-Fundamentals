//IF - ELSE IF - ELSE
/* -> Most basic conditional structure
    -> If the condition is true, IF runs the code inside
    -> ELSE IF runs if the previous condition is false, but this one is true.
    -> ELSE IF can be repeted multiple times while nested inside an IF
    -> ELSE runs when any of the previous contition is true
*/

package ControlStructures;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int number;
        int conditionA = 10;
        int conditionB = 20;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number to see if it meet the conditions");
        number = scanner.nextInt();

        if (number >= conditionA && number <= conditionB) { // runs if the condition is true
            System.out.println("The number is between " + conditionA + " and " + conditionB);

        } else if (number < conditionA) { // runs if the previous condition is false and this one is true
            System.out.println("The number is lower than " + conditionA);

        } else { // runs if all the previous conditions are false
            System.out.println("The number is higher than " + conditionB);
        }
        scanner.close();
    }

}

