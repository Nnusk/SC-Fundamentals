/*DEQUES
-> Is a double-ended queue pronunced "Deck"
-> Allows insertion and deletion from front and rear ends
-> It acts as a stacks (LIFO) and queues (FIFO)
*/

package DataStructures;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {

    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        //Inisializing a deque
        Deque<String> bookShelf = new ArrayDeque();

        //Remove element by "poll" (returns null if first/last element cannot be removed)
        //"poll" without "First" should work the same way
        bookShelf.pollFirst(); // does not accept any arguments.
        bookShelf.pollLast(); // does not accept any arguments.

        //Adding elements by "add" (throws excemption if element cannot be added)
        bookShelf.addFirst("Sushi 101"); //add the element to the beggining
        bookShelf.addFirst("Best pizza toppings");
        //"add" without "Last" works the same way
        bookShelf.addLast("Middle earth recipes"); //add the element to the end
        bookShelf.addLast("The Sims cooking book");
        bookShelf.addLast("Mistborn");

        
        //Printing a Deque
        System.out.println("You run to a shelve that contains the following books: ");
        System.out.println(bookShelf);

        //Remove element by "remove" (throws exception if element cannot be removed)
        System.out.println("Write the name of the book you wanna take: ");
        String book = keyboard.nextLine();
        bookShelf.remove(book); // does not throw exemption when there is an argument, just true/false or null if the queue is empty
        
        System.out.println("You take the first book from the shelf");
        bookShelf.removeFirst(); //"remove" without "First" should work the same way

        System.out.println("You also take the last book from the shelf");
        bookShelf.removeLast();  
                
        System.out.println("Now the remaining books are " + bookShelf);

        //Adding elements by "offer" (returns false if element cannot be added)
        System.out.println("Now you add a new book at the beggining of the shelf: ");
        book = keyboard.nextLine();
        bookShelf.offerFirst(book);

        System.out.println("And you put another book an the end of the shelf:");
        book = keyboard.nextLine();
        bookShelf.offer(book); //"offer" without "Last" should work the same way

        //Check first/last element of the deque
        System.out.println("The first book in the shelf now is: " + bookShelf.peekFirst()); //"peek" without "First" should work the same way
        System.out.println("The last book in the shelf now is: " + bookShelf.peekLast());

        System.out.println("Now the shelf looks like this:");
        System.out.println(bookShelf);

        //Cheking if the deque is empty
        System.out.println("Is the shelf empty? " + bookShelf.isEmpty());

        keyboard.close(); 
        

        

        
        
        
    }
}