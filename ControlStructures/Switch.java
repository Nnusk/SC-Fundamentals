//SWITCH
/*  -> Evalues one expression
    -> Compares it against different cases
    -> Executes the matching block
    -)!IMPORTANT: Use "break" to end the block
*/

package ControlStructures;

import java.util.Scanner;

public class Switch {

    public static void main (String[] args){
        int option;
Scanner scanner = new Scanner(System.in);
       do {
        
        System.out.println("Option 1: Salutation");
        System.out.println("Option 2: Random thing");
        System.out.println("Option 3: Mental health");
        System.out.println("Option 4: Life meaning");
        System.out.println("Option 5: End program");
        System.out.print("Choose a number from the menu:");

        option = scanner.nextInt();

        switch(option) {
case 1:
    System.out.println("Hello world!");
break;

case 2:
    System.out.println("Hipopotomonstrodsesquipeidalophobia is the fear for long words");
    break;

case 3:
 System.out.println("You are doing fine :) Keep going!");
 break;

 case 4:
 System.out.println("The meaning of life, universe and everything is 42");
 break;

 case 5:
    System.out.println("End of the program");
    break;
        }

    } while (option !=5);

    scanner.close();

    }
}