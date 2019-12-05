/*
*  Assignment [ASSIGNMENT SIX]
*  Description: [The program creates a grid of random numbers. A two
                dimensional array is used to store the frequency of each
                randomly generated number.]
*  Name: [Ze Lei]
*  ID: [918312764]
*  Class: CSC 210-04
*  Semester: Spring 2019
 */

/**
 *
 * @author Ze Y Lei
 */
//The following line allows the use of the scanner
import java.util.Scanner;
public class RandomNumberGrid {
    /*A two dimension array is intialized outside of the main method so that
    the array can be accessed by the "random" method. The array stores the
    number of times that a number is randomly generated.
    */
    public static int[][] numberCount = new int [10][1];
    public static void main(String[] args) {
        //The following statement allows for the use of user inputs
        Scanner input = new Scanner(System.in);
        /*The folloiwng boolean is used with do-while loops to prompt the
        user to input valid numbers
        */
        boolean invalid = true;
        /*The following two int variables are declared outside the loops so
        they may be accessed outside the loop.
        */
        int rowLength = 0;
        int columnLength = 0;
        /*The following two do-while loops prompt the user to input a valid
        number
        */
        do {
            System.out.println("How many rows would you like?");
            rowLength = input.nextInt();
            if (rowLength < 1 || rowLength > 9) {
                System.out.println("Only numbers 1 though 9 are accepted.");
            } else {
                break;
            }
        } while (invalid);
        do {
            System.out.println("How many columns would you like?");
            columnLength = input.nextInt();
            if (columnLength < 1 || columnLength > 9) {
                System.out.println("Only numbers 1 though 9 are accepted.");
            } else {
                break;
            }
        } while (invalid);
        /*The following six print statements are used to the format
        the columns
        */
        System.out.println("Random Integers Table:");
        System.out.print("    |  ");
        for (int i = 1; i <= columnLength; i++) {
            System.out.print(i + "  "); }
        System.out.print("\n" + "-----");
        for (int i = 0; i <= columnLength; i++) {
            System.out.print("---");}
        System.out.println();
        //The following for loop formats the rows
        for (int i = 1; i <= rowLength; i++) {
            System.out.print(i + "   |");
            /*The nested for loop prints random numbers & calls a
            random number generator method
            */
            for (int k = 0; k < columnLength; k++){
                System.out.print("  " + random());
            } System.out.println();
        }
        /*The following for loop displays the number of times that each
        number was randomly generated
        */
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + numberCount[i][0] + " times");
        }
    }
    /*The following method generates a random number and adds a count to
    the two dimensional array
    */
    private static int random() {
        int i = (int)(Math.random() * 9);
        numberCount[i][0] += 1;
        return i;
    }
}
