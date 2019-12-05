/*
*  Assignment [ASSIGNMENT THREE]
*  Description: [The program simulates taking care of a virtual dog.
                It's like a tamagotchi.]
*  Name: [Ze Lei]
*  ID: [918312764]
*  Class: CSC 210-04
*  Semester: Spring 2019
 */

/**
 *
 * @author Ze Y Lei
 */
import java.util.Scanner;
//The statement above allows the use of the scanner
public class Assignment3 {
    public static void main(String[] args) {
        //The following line allows the integration of user inputs
        Scanner input = new Scanner(System.in);
        //The following switch statement genders the dog (not required)
        System.out.print("Your dog is ");
        int gender = (int)(Math.random()*2);
        switch (gender) {
            case 0: System.out.println("a boy");break;
            case 1: System.out.println("a girl");break;
            default: System.out.println("Non-binary");}
        //The following print statements prompt the user to name the dog
        System.out.println("Please name your dog.");
        String name = input.nextLine();
        System.out.println("Your dog's name is " + name);
        //The following int statements set the initial statuses
        int happiness = 60;
        int energy = 60;
        int hygiene = 60;
        //The following statements set up the loop
        boolean gameOver = false;
        do {
        //The following print statement prompts the user to choose an action
        System.out.println(
            "Happiness: " + happiness + "\n" + 
            "Energy: " + energy + "\n" +
            "Hygiene: " + hygiene + "\n" +
            "Which action would you like to take?\n" +
            "1. Walk the virtual dog.\n" +
            "2. Feed the virtual dog.\n" +
            "3. Clean the virtual dog.\n" +
            "4. Exit the program.\n" +
            "Enter a number.");
        int action = input.nextInt();
        //The following switch statement carries out the action
        switch (action){
            case 1:if (energy <= 30){
                   happiness -= 5;}
                   else happiness += 5;
                   energy -= 20;
                   hygiene -= 5;break;
            case 2:if (energy <= 95){
                    happiness += 5;
                    energy += 10;}
                    else
                    System.out.println("Energy too high.");break;
            case 3:if (energy <= 80){
                    happiness += 5;
                    hygiene += 30;}
                    else
                    System.out.println("Energy too high.");break;
            case 4: gameOver = true;break;
            default: gameOver = false;}
        /*The following if statements limit the statuses from falling out
        of the 1 to 100 range*/
        if (happiness >= 100){
            happiness = 100;}
        if (energy >= 100){
            energy = 100;}
        if (hygiene >= 100){
            hygiene = 100;}
        if (happiness <= 1){
            System.out.println("Happiness too low. " + name + " has run away.");
            gameOver = true;}
        if (energy <= 1){
            System.out.println("Energy too low. " + name + " has run away.");
            gameOver = true;}
        if (hygiene <= 1){
            System.out.println("Hygiene too low. " + name + " has run away.");
            gameOver = true;}
        } while (!gameOver);
        //The following if statement displays the end of game summary
        if (gameOver = true){
            System.out.print("Game Over. \n" +
                    "Summary:\n" +
                    "Name: " + name + "\n" +
                    "Happiness: " + happiness + "\n" +
                    "Energy: " + energy + "\n" +
                    "Hygiene: " + hygiene + "\n");
            if (happiness >= 75){
                System.out.print("You were a good owner");
            }else if (happiness >= 42) {
                System.out.print("You could've been a better owner.");
            }else System.out.print("Your dog owning privileges are revoked.");}
        }}
