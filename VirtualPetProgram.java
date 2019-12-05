/*
*  Assignment [ASSIGNMENT SEVEN]
*  Description: [The program manages a virtual pet. A reiteration of
    assignment three, objects & classes are used.]
*  Name: [Ze Lei]
*  ID: [918312764]
*  Class: CSC 210-04
*  Semester: Spring 2019
 */

/**
 *
 * @author Ze Y Lei
 */
//The following line allows of the use of the scanner class
import java.util.Scanner;
public class VirtualPetProgram {
    public static void main(String[] args) {
        //The following line allows the use of user inputs
        Scanner input = new Scanner(System.in);
        //The following six lines are to add flavor
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
        //The following line initializes a new VirtualPet object
        VirtualPet dog = new VirtualPet(60, 60, 60);
        //The following statements set up the do-while loop
        boolean gameOver = false;
        do {
        //The following print statement prompts the user to choose an action
        //The dog.get methods return the values of dog's instance values
        System.out.println(
            "Happiness: " + dog.getHappiness() + "\n" + 
            "Energy: " + dog.getEnergy() + "\n" +
            "Hygiene: " + dog.getHygiene() + "\n" +
            "Which action would you like to take?\n" +
            "1. Walk the virtual dog.\n" +
            "2. Feed the virtual dog.\n" +
            "3. Clean the virtual dog.\n" +
            "4. Exit the program.\n" +
            "Enter a number.");
        int action = input.nextInt();
        //The following switch statement carries out the action
        //The dog. methods modify dog's instance values
        // gameOver = true statements end the loop
        switch (action){
            case 1: dog.walk();break;
            case 2: dog.feed();break;
            case 3: dog.clean();break;
            case 4: gameOver = true;break;
            default: gameOver = false;}
        /*The following method & if statements limit the statuses
        from falling out of the 1 to 100 range*/
        dog.limit();
        if (dog.getHappiness() <= 1){
            System.out.println("Happiness too low. " + name + " has run away.");
            gameOver = true;}
        if (dog.getEnergy() <= 1){
            System.out.println("Energy too low. " + name + " has run away.");
            gameOver = true;}
        if (dog.getHygiene() <= 1){
            System.out.println("Hygiene too low. " + name + " has run away.");
            gameOver = true;}
        } while (!gameOver);
        //The following if statement displays the end of game summary
        if (gameOver){
            /*The following print statement is used because the VirtualPet
            class doesn't have the "name" instance variable*/
            System.out.print("Game Over. \n" +
                    "Summary:\n" +
                    "Name: " + name + "\n");
            //The following method displays a summary of the dog's instance
            //values
            dog.displaySummary();
        }
    }
}
    class VirtualPet {
        //The following statements define the data fields
        private int happiness;
        private int energy;
        private int hygiene;
        //The following constructor intialize the instance values
        public VirtualPet(int happiness, int energy, int hygiene) {
            this.happiness = happiness;
            this.energy = energy;
            this.hygiene = hygiene;
        }
        //The following setters change the instance values to match the int
        //set as the parameter
        public void setHappiness (int newHappiness) {
            happiness = newHappiness;
        }
        public void setEnergy (int newEnergy) {
            energy = newEnergy;
        }
        public void setHygiene (int newHygiene) {
            hygiene = newHygiene;
        }
        //The following getters retrieve the instance values for the object
        public int getHappiness() { return happiness; }
        public int getEnergy() { return energy; }
        public int getHygiene() { return hygiene; }
        //The following three methods modify the instance values
        public void walk(){
            if (energy <= 30){
                happiness -= 5;
            } else {happiness += 5;
                energy -= 20;
                hygiene -= 5;}
        }
        public void feed(){
            if (energy <= 95){
                happiness += 5;
                energy += 10;}
            else System.out.println("Energy too high.");
        }
        public void clean(){
            if (energy <= 80){
                happiness += 5;
                hygiene += 30;}
            else System.out.println("Energy too high.");
        }
        //The follwing method displays a summary of the instance values
        //and a message based on the happiness value
        public void displaySummary(){
            System.out.print(
                    "Happiness: " + happiness + "\n" +
                    "Energy: " + energy + "\n" +
                    "Hygiene: " + hygiene + "\n");
            if (happiness >= 75){
                System.out.print("You were a good owner.");
            }else if (happiness >= 42) {
                System.out.print("You could've been a better owner.");
            }else System.out.print("Your dog owning privileges are revoked.");
        }
        //The following method sets an upper limit to the instance values
        public void limit(){
        if (happiness >= 100){
            setHappiness(100);}
        if (energy >= 100){
            setEnergy(100);}
        if (hygiene >= 100){
            setHygiene(100);}
        }
    }
