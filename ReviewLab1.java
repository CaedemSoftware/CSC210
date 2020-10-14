/*
* Lab <lab review 1>
* Description: <The program takes in an integer from the user and creates a 
*               pyramid of that height.>
* Name: <Ze Lei>
* ID: <918312764>
* Class: CSC 211-<07>
* Semester: <Spring 2020>
 */
package spring20csc211;

//The following line allows the use of the scanner class
import java.util.Scanner;

/**
 *
 * @author Ze Lei
 */
public class ReviewLab1 {

    public static void main(String[] args) {
        //The following line creates a scanner object
        Scanner input = new Scanner(System.in);
        //The following line initializes the height variable
        int height = 0;
        //The following while loop forces the user to input a valid value
        while (height < 1) {
            //The following line prompts the user
            System.out.print("Enter the height of the pyramid: ");
            //The following line stores the inputted value
            height = input.nextInt();
            //The following line clears the \n
            input.nextLine();
            //The following line informs the user that their input is invalid
            if (height < 1) {
                System.out.println("Invalid input");
            }
        }
        //The following line calls the printPyramid method with the integer
        //that the user chose
        printPyramid(height);
    }

    public static void printPyramid(int height) {
        //The following for loop is for the number of rows
        for (int i = 1; i <= height; i++) {
            //The following for loop is for the number of spaces
            for (int j = height * 2; j > i; j--) {
                System.out.print(" ");
            }//end space loop
            //The following for loop is for the number of *
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }//end * loop
            System.out.println();
        }//end row loop
    }//end printPyramid

}
