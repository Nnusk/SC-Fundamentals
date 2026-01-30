/*STACKS
-> LIFO data structure (Last In First Out)
-> Very used in DFS (Depth-First Search)
*/

package DataStructures;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    public static void main (String[] args){
Scanner keyboard = new Scanner(System.in);

    //Inisializing the Stack
      Stack<String> bookPile = new Stack<>(); 

      //Adding elements to the stack
      bookPile.push("Name of the Wind");
      bookPile.push("Hitchikker guide to the galaxy");
      bookPile.push("The colour of magic");

      //Printing stack
      System.out.println("You found a pile of books!:");
      System.out.println(bookPile);

      //Removing an element
      System.out.println("You take the first book");
      bookPile.pop();

      //Check the top element
      System.out.println("The book at the top is now " + bookPile.peek());
      
      //Adding an element
      System.out.println("You put a new book to the pile");
      System.out.println("The book you put is named: ");
      String newBook = keyboard.nextLine();
      
      bookPile.push(newBook);

      //Checking everything was done right
      System.out.println("Now the pile contains the following books: ");
      System.out.println(bookPile);

      //Checking if the stack is empty
      System.out.println("Is the pile of book empty? " + bookPile.isEmpty());

      keyboard.close();



       
    }
}