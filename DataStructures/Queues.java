/*QUEUE
-> FIFO data structure (First In First Out)
-> Used is BFS
*/

package DataStructures;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Queues{

    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    //Inisializing a queue    
    Queue<String> peopleWaiting =  new LinkedList<>();
    

    //Adding elements by "add" (throw excemption if element cannot be added)
    peopleWaiting.add("Michael Scott");
    peopleWaiting.add("Dwight Schrute");
    peopleWaiting.add("Homer Simpson");
    peopleWaiting.add("Doctor House");

    //Printing the queue
    System.out.println("\n" + peopleWaiting);

    //Adding elements by "offer" (returns false if element cannot be added)
    System.out.println("Add one more person to the queue:");
    String queueElement = keyboard.nextLine();

    peopleWaiting.offer(queueElement);

    //Remove element by "remove" (throw exception if element cannot be removed)
    peopleWaiting.remove(); // remove the first element in the queue
    peopleWaiting.remove("Homer Simpson");

    System.out.println("Remove one person from the queue: ");
    queueElement = keyboard.nextLine();
    peopleWaiting.remove(queueElement); // does not throw exemption when there is an argument, just true/false or null if the queue is empty
    
    
    //Remove element by "poll" (returns null if first element cannot be removed)
    peopleWaiting.poll(); // does not accept any arguments.

    //Checking first element
    System.out.println("The first element of the queue now is: " + peopleWaiting.peek());

    //Checking is the queue es empty
    System.out.println("Is the queue empty? " + peopleWaiting.isEmpty());

    //Printing the queue
    System.out.println("Current queue is: " + peopleWaiting);

    keyboard.close();

    }
}