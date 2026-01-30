/*HASH MAP / DICTIONARIES
-> Stores data as a key-vaule pairs
-> Each key is unique
-> Each key maps to a value
-> Very fast access to the data (O(1))
*/

package DataStructures;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_Map_Dictionaries {

    public static void main (String[] args ) {

        //Inizialise a Map
        Map<String, Integer> storeList = new HashMap<>();
        //String -> Key
        //Integer -> Value

        //Return the size (default size is 16)
        storeList.size();
        
        //---------------ADD ELEMENTS---------------
        storeList.put("apple", 3);
        storeList.put("bannana",2);
        storeList.put("apple", 5); //overrides the value

        //adding via scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nEnter a key: ");
        String key = keyboard.nextLine();
        System.out.println("Enter a value: ");
        int value = keyboard.nextInt();
        storeList.put(key, value); 

        //---------------TRAVERS A MAP---------------
        //Keys and Values
        System.out.println("\nPrinting keys and values: ");

        for (Map.Entry<String, Integer> fullEntry : storeList.entrySet()) {
            System.out.println(fullEntry.getKey() + " -> " + fullEntry.getValue());
        }
        System.out.println();

        //Just Keys
        System.out.println("Printing just keys: ");

        for (String keyEntry : storeList.keySet()){
            System.out.println(keyEntry + " ");
        }

        //just Values
        System.out.println("\nPrinting just values: ");

        for (int valueEntry : storeList.values()){
            System.out.println(valueEntry + " ");
        }
        
        //---------------CHECK IS ELEMENT EXIST---------------
        System.out.println("\nChecking if an element exist ");
        keyboard.nextLine(); // IMPORTANT to consume the \n to avoid " " to enter the checkKey value
        System.out.println("Write an element: ");
        String checkKey = keyboard.nextLine();
        
        System.out.println(storeList.containsKey(checkKey)); // true/false

        //---------------REMOVE ELEMENT---------------
        System.out.println("\nWrite an element to remove: ");
        key = keyboard.nextLine();
        storeList.remove(key);

        System.out.println("The updated map keys are: ");
        for (String keyEntry : storeList.keySet()){
            System.out.println(keyEntry + " ");
        }

        //---------------COUNTING WORDS FREQUENCY---------------
        String[] wordsArray = {"dog", "cat", "elephant", "cat", "dog", "horse"};
        System.out.println("\nWords List: " +Arrays.toString(wordsArray) + " "); //easiest way to print an array
        
        Map<String, Integer> wordsMap = new HashMap<>(); //inisializing the array to fill

        for (String word : wordsArray){
            //getOrDefault avoid "null" and "nullPointerExeption"
            //If the value does not exist, return default value
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordsMap);

       //---------------COUNTING CHARACTERS IN A STRING---------------
    System.out.println("\nWrite a word to count the letters!");
    System.out.println(); //to consume the \n before keyboard entry

    String aWord = keyboard.nextLine();
    aWord = aWord.toLowerCase(); //avoid caps
    Map<Character, Integer> countingChar = new HashMap<>();

    for (char c: aWord.toCharArray()){
        if (c != ' '){ //ignores spaces
        countingChar.put(c, countingChar.getOrDefault(c, 0) +1); //if the char no exist, returns 0. If it exist +1
    }
}

    System.out.println(countingChar);

        keyboard.close();


    }

    //---------------COUNTING WORDS IN A SENTENCE---------------
    //---------------FIND THE FIRST UNREPEATED CHARACTER---------------
    //---------------COMPARING ANAGRAMS---------------


}