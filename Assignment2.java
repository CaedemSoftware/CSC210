/*
*  Assignment [ASSIGNMENT TWO]
*  Description: [The program accepts numerical imputs and outputs a grade.]
*  Name: [Ze Lei]
*  ID: [918312764]
*  Class: CSC 210-04
*  Semester: Spring 2019
 */

/**
 * @author Ze Y Lei
 */
import java.util.Scanner;
//The statement above allows the use of the scanner
public class Assignment2 {
    public static void main(String[] args) {
        //The following line allows the integration of user inputs
            Scanner input = new Scanner(System.in);
        //The following print statements prompt the user to enter scores
        System.out.println("Please enter the scores for:");
            System.out.println("Exam One: ");
                double exam1 = input.nextDouble();
            System.out.println("Exam Two: ");
                double exam2 = input.nextDouble();
            System.out.println("Exam Three: ");
                double exam3 = input.nextDouble();
            //The following 2 lines of code averages the three scores.
            double average = (exam1 + exam2 + exam3) / 3;
            System.out.println("Your average is: " + average);
            System.out.print("Your grade is: ");
            //The following lines set up the switch statement at the end
            String grade;
            grade = "0";
            /*The following if statement issues an automatic fail
            for getting a score less than 30 */
        if (exam1 <= 30 || exam2 <= 30 || exam3 <= 30) {
            System.out.println("F");
        }else
        /*The following if else statements print the letter grade
            and set the case for the switch*/
        if (average >= 97.0) {
            System.out.println("A+");
            grade = "4";
        } else {if (average >= 93.0) {
            System.out.println("A");
            grade = "4";
        } else {if (average >= 90.0) {
            System.out.println("A-");
            grade = "3.7";
        } else {if (average >= 87.0) {
            System.out.println("B+");
            grade = "3.3";
        } else {if (average >= 83.0) {
            System.out.println("B");
            grade = "3";
        } else {if (average >= 80.0) {
            System.out.println("B-");
            grade = "2.7";
        } else {if (average >= 77.0) {
            System.out.println("C+");
            grade = "2.3";
        } else {if (average >= 70.0) {
            System.out.println("C");
            grade = "2";
        } else {if (average >= 67.0) {
            System.out.println("D+");
            grade = "1.7";
        } else {if (average >= 60.0) {
            System.out.println("D");
            grade = "1";
        } else {
            System.out.println("F");}
        }}}}}}}}}
        //The following switch statements assign the GPA based on letter grade
    System.out.print("Your GPA is: ");
        switch (grade) {
            case "4": System.out.print("4.0"); break;
            case "3.7": System.out.print("3.7"); break;
            case "3.3": System.out.print("3.3"); break;
            case "3": System.out.print("3.0"); break;
            case "2.7": System.out.print("2.7"); break;
            case "2.3": System.out.print("2.3"); break;
            case "2": System.out.print("2.0"); break;
            case "1.7": System.out.print("1.7"); break;
            case "1": System.out.print("1.0"); break;
            default: System.out.print("0.0");
        }}}
