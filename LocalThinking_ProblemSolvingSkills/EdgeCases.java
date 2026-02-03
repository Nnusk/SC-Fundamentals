/*EDGE CASES
A rare or unexpected scenario
that occurs at an extreme (max or min)
operating parameter or framework 
and usually leads to a bug*/

package LocalThinking_ProblemSolvingSkills;
 import java.util.Deque;
 import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;

public class EdgeCases {

    public static void main(String[] args){

        //-----------------ARRAYS/LISTS-----------------
        //Empty Array
        //Index out of bounds
        int[] numsArray = {1, 2, 3};

        if (numsArray == null || numsArray.length == 0) return; //if the method is void
        if (numsArray == null || numsArray.length == 0) return 0; //If the method is not void

        //-----------------MATRIX-----------------
        //Empty index
        //Index out of bounds
        int[][] matrix = new int[3][3];

        if (matrix == null || matrix.length ==0 || matrix[0].length == 0) return; //if the method is void
        if (matrix == null || matrix.length ==0 || matrix[0].length == 0) return 0; //If the method is not void

        //-----------------STRINGS-----------------
        //Empty or null String
        //Comparing Strings

        //-----------------DEQUE-----------------
        //Empty structure
        Deque<Integer> numsDeque = new ArrayDeque<Integer>();

        numsDeque.removeFirst(); //Throws exeption if empty
        numsDeque.removeLast(); //Throws exeption if empty

        //Use poll instead of remove
        numsDeque.pollFirst(); //Returns false if empty
        numsDeque.pollLast();  //Returns false if empty

        //-----------------QUEUE-----------------
        //Empty structure
        Queue<Integer> numsQueue = new LinkedList<Integer>();

        numsQueue.remove(); //Throws an exemption if the queue is empty
        numsQueue.poll(); //Returns false if empty

        //-----------------LINEAR/BINARY SEARCH/TWO POINTERS-----------------
        //Empty Array
        if (numsArray == null || numsArray.length == 0) return; //if the method is void
        if (numsArray == null || numsArray.length == 0) return 0; //If the method is not void
        
        //Target not found
        int target = 3;
    if (numsArray == null || numsArray.length == 0) {
        return -1; // not found
        return; // if the method is void
    }

    for (int i = 0; i < numsArray.length; i++) {
        if (numsArray[i] == target) {
            return i;
            System.out.println(i); //if the method is void
            return; //if the method is void
        }
    }
    return -1;
    System.out.println("Not found"); //if the method is void.


        //Binary search with unsorted array
        Arrays.sort(numsArray);

        //Binary search mid overflow
        int left = 0, right =numsArray.length - 1;
        while (left <= right){
            int mid = left + (right - left) /2;
        //avoid using:
            /*int mid = (right - left) /2;*/
        //if right and left are big
            
        }
            
        //-----------------SETS/MAPS-----------------
        //Non existent key
        Map<String, Integer> numsMap = new HashMap<>();

        numsMap.getOrDefault("a", 3); //if not exist returns 0, avoid NullPointerExeption
        numsMap.get("a"); //if not exist returns null (possible NullPointerExeption)

        //Avoid overriding key
        numsMap.putIfAbsent("a" , 3);

        if (!numsMap.containsKey("a")){
            numsMap.put("a", 3);
        }

        //-----------------TREES/GRAPHS-----------------
        //Null root node
        //Cicles

        //-----------------SCANNER-----------------
        //Dirty buffer
        Scanner keyboard = new Scanner(System.in);

        

        //-----------------USER INPUT-----------------
        //Invalid input
    
    
    
    
    
    
    
    
    }  

}

