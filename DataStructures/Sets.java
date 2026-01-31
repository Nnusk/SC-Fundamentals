/*SETS
-> A colletion that stores unique elements
-> Does not allow duplicates
-> Does not has indexs
*/

package DataStructures;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        //Inisializing Sets
        Set<String> namesHS = new HashSet<>(); //unordered
        Set<String> namesLHS = new LinkedHashSet<>(); //ordered by insertion
        Set<String> namesTS = new TreeSet<>(); //natural order (1-100, a-z...)

        System.out.println("\nAdd names to the Set");
        System.out.println("Type 'Stop' to stop");

        while (true) {
            String name = keyboard.nextLine();
            if (name.equals("Stop")) break; //equals is used to compare the content of a string or objects
            //Adding elements to the sets
            namesHS.add(name);
            namesLHS.add(name);
            namesTS.add(name);
        }

        //Printing sets
        System.out.println("\nHash Set: ");
        System.out.println(namesHS);

        System.out.println("\nLinked Hash Set: ");
        System.out.println(namesLHS);

        System.out.println("\nTree Set: ");
        System.out.println(namesTS);

        //Checking sets size
        System.out.println("\nThe sets contain " + namesHS.size() + " elements.");

        System.out.println("Write a name you want to remove from the set: ");
        String name = keyboard.nextLine();

        //Checking if an element exist in the set
        if (namesHS.contains(name) == true){

        //Removing elements from the sets
            namesHS.remove(name);
            namesLHS.remove(name);
            namesTS.remove(name);

            System.out.println(namesHS);
            System.out.println(namesLHS);
            System.out.println(namesTS);
        }
        else{
            System.out.println("Any set contains that name.");


        }

keyboard.close();


    }
}


