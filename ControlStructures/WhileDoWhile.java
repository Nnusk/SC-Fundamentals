//wHILE & DO-WHILE
/*  -> WHILE checks the condition before executing the code
    -> Executes the loop only if the condition is TRUE
    -> DO-WHILE check the condition after the execution
    -> Executes the loop at leat once
*/

package ControlStructures;

import java.util.Scanner;


public class WhileDoWhile{

public static void main (String[] args){

    int phoneNum;
    int number = 7;
    int counting = 0;
    boolean endLoop = false;
Scanner scanner = new Scanner(System.in);

//-------------WHILE------------------------
while (counting < number) {
    counting++;
    System.out.println("Counting " + counting);
}

//--------------DO/WHILE--------------------
do {
    System.out.print("Guess the number 1 to 10: ");
    number = scanner.nextInt();
} while (number != 7); 
    
System.out.print("Well done!");

//----------------Using both----------------
do { 
    System.out.print("Type your phone number: ");
    phoneNum = scanner.nextInt();

    while (phoneNum >= 111111111 && phoneNum <= 999999999){
        System.out.println("Your phone number is saved");
        endLoop = true;
break;
       }
       if (endLoop == false){
 System.out.println("Wrong format");
       }

} while (endLoop == false);

scanner.close();


}
}
