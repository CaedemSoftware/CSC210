/*
* Lab <lab five>
* Description: <The program creates a fibonacci sequence.>
* Name: <Ze Lei>
* ID: <918312764>
* Class: CSC 211-<07>
* Semester: <Spring 2020>
 */
package spring20csc211;

/**
 *
 * @author Ze Lei
 */
//The following line allows the use of the scanner class
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //The following lines initialize & declare two int variables
        int a = 0;
        int b = 1;
        //The following line creates a scanner object
        Scanner input = new Scanner(System.in);
        //The following line prompts the user
        System.out.println("Enter a number of terms for Fibonacci series:");
        //The following line saves the user's input into a variable
        int numberOfTerms = input.nextInt();
        //The following if statement prompts the user to enter a different
        //number if their input is out of the acceptable range
        if (numberOfTerms >= 20 || numberOfTerms <= 1) {
            System.out.println("Please enter a number less than 20"
                    + " and greater than 1");
            numberOfTerms = input.nextInt();
        }
        //The following lines display the fibonacci series
        System.out.println("Fibonacci series is:");
        //The following for loop continues the calculation until the 
        //fibonacci series has the appropriate number of terms
        for (int i = 1; i <= numberOfTerms; i++) {
            //The following line displays the first int
            System.out.print(a + " ");
            //The following line increments the value of i every time
            //the int a is displayed
            i++;
            //The following line displays the second int
            System.out.print(b + " ");
            //The following lines update the values of a & b to equal the sum
            //of the two numbers before them in the fibonacci series
            a = a + b;
            b = a + b;
        }
    }
}
