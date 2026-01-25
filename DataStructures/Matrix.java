/*MATRIX (2D Array)
-> An array of arrays
-> It has tho indexs: row and column*/

package DataStructures;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix{
public static void main(String[] args){

int[][] matrix; // we declare a matrix
matrix = new int[3][4]; //3 rows 4 columns
Scanner scanner = new Scanner(System.in);

//Inisialize with values
int[][] fullMatrix = {
    {1, 2, 3, 4}, // row 0
    {5, 6, 7, 8}, //row 1
    {9, 100, 11, 12} //row 2
    };
System.out.println(Arrays.deepToString(fullMatrix)); //Easiest way to print a matrix



//Access to elements
int number2 = fullMatrix[0][1]; // row 0, column 1 = 2
int number8 = fullMatrix[1][3]; // row 1, column 3 = 8

int number10 = fullMatrix[0][1] + fullMatrix[1][2]; //you can operate with values
number10 = number2 + number8; //you can assign values to a variables
fullMatrix[2][1] = number10; // you can replace values

//Travers a matrix
//Native funciton
System.out.println(Arrays.deepToString(fullMatrix)); //Easiest way to print a matrix
System.out.println("Rows: " + fullMatrix.length); //number of rows
System.out.println("Columns: " + fullMatrix[0].length); //number of columns

System.out.println(); //blank line for visual purposes--------------------------

//For-each
for (int[] row : fullMatrix){
    for (int value : row){
        System.out.print(value + " ");
    }
    System.out.println();
}

System.out.println(); //blank line for visual purposes--------------------------

//Nested loop
for (int i = 0; i < fullMatrix.length; i++) {
    for (int j = 0; j < fullMatrix[i].length; j++){
        System.out.print(fullMatrix[i][j] + " ");
    }
    System.out.println();
}


//ADD ELEMENT
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++){
        System.out.print("Add a value: ");
        matrix[i][j] = scanner.nextInt();
    }
    System.out.println();
}
System.out.println(Arrays.deepToString(matrix)); //Easiest way to print a matrix

System.out.println(); //blank line for visual purposes--------------------------

//OPERATE
//Sum of all elements
int sum = 0;
for (int[] row : matrix) {
    for (int matrixValue : row){
        sum += matrixValue;
    }
}
System.out.println("The sum of this matrix is " + sum);
System.out.println(); //blank line for visual purposes--------------------------

//Find max value
int max = matrix[0][0];

for (int[] row :  matrix) {
    for (int matrixValue : row ){
        if (matrixValue > max) {
            max = matrixValue;
        }
    }
}
System.out.println("The max value of this matrix is " + max);


int min = matrix[0][0];

for (int[] row :  matrix) {
    for (int matrixValue : row ){
        if (matrixValue < min) {
            min = matrixValue;
        }
    }
}
System.out.println("The min value of this matrix is " + min);

//Sort a matrix
//-> First we have to flatten the array (make it 1D instead of 2D)
//-> We sort the array
//-> We refill the matrix with the array values

int rows = matrix.length;
int columns = matrix[0].length;
int[] flatArray = new int [rows * columns]; //the total size of the array will be rows x columns of our matrix
int index = 0; //values of our flatArray to insert them in the matrix

//Flatten the matrix
for (int[] row : matrix){
    for (int matrixValue : row){
        flatArray[index++] = matrixValue; //we insert every matrix value into the flat array
    }
}
//Sortening the flat array
Arrays.sort(flatArray);

//Refilling the matrix with sorten values
index = 0;
for (int i = 0; i < rows; i++){
    for (int j = 0; j < columns; j++){
        matrix[i][j] = flatArray[index++];
    }

}
System.out.println("Sorted matrix: ");
System.out.println(Arrays.deepToString(matrix)); //Easiest way to print a matrix


scanner.close();

}
}