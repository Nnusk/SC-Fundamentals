/*ARRAY
-> Data structure
-> Can store multiples values at the same time
-> Fixed size (you choose it when ini)
-> Basic structure: type[] arrayName; 
*/

package DataStructures ;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
public static void main (String[] args){

int[] inizialisedArray = {1, 2, 100, 4}; //this array has the inside values declared 
Boolean[] fixSizeArray = new Boolean[4]; //this array has the size declared, but not the values
String[] emptyArray; //this array has not declared the size nor the values
Scanner scanner = new Scanner(System.in);

//------------------------------------------MODIFY ELEMENTS ------------------------------------------
// we point the index (starting in 0) and assign a new element.
inizialisedArray[2] = 3;

//Check the array length (the number of the elements that can contain). It starts in 1.
System.out.println("Array length: " + fixSizeArray.length);

//------------------------------------------TRASVERS AN ARRAY------------------------------------------
//FOR
for (int i = 0; i < inizialisedArray.length; i++) {
System.out.print(inizialisedArray[i] + " ");
}
//FOR-EACH (if you don't know the index. Better for reading, not for modifying)
for (int num : inizialisedArray) {
    System.out.print(num + " ");
}

//------------------------------------------ADD ELEMENTS------------------------------------------
//Inisialize index
emptyArray = new String[5]; // 5 indexs 0 to 

//Insert elements
for (int i =0; i < emptyArray.length; i++) {
    System.out.println("Write a word: ");
    emptyArray[i] = scanner.nextLine(); //or "scanner.nextInt" or the type of data you need to instert.
}
System.out.print(Arrays.toString(emptyArray) + " "); //easiest way to print an array

//------------------------------------------SORT AN ARRAY------------------------------------------
// Via java
Arrays.sort(emptyArray);

System.out.print(Arrays.toString(emptyArray) + " "); //easiest way to print an array

//Via Bubble (Manual)
for (int i = 0; i < emptyArray.length -1; i++) {
    int minIndex = i;

    for (int j = i +1; j < emptyArray.length; j++){
        if (emptyArray[j].compareTo(emptyArray[minIndex]) < 0){ //Replace "compare to" for "< emptyArray[minIndex]){ if its not a String"
            minIndex = j;
        }
    }
    String temp = emptyArray[i];
    emptyArray[i]  = emptyArray[minIndex];
    emptyArray[minIndex] = temp;
}
System.out.print(Arrays.toString(emptyArray) + " "); //easiest way to print an array

//------------------------------------------FIND MIN/MAX------------------------------------------
//Min
int min = inizialisedArray[0];

for (int i = 1; i < inizialisedArray.length; i++){
    if (inizialisedArray[i] < min) {
        min = inizialisedArray[i];

    }
    System.out.println(inizialisedArray[i]);
}

//Max
int max = inizialisedArray[0];

for (int i = 1; i < inizialisedArray.length; i++){
    if (inizialisedArray[i] > max) {
        max = inizialisedArray[i];

    }
    System.out.println(inizialisedArray[i]);
}

scanner.close();
}
}





