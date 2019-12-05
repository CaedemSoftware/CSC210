/*
*  Assignment [ASSIGNMENT FIVE]
*  Description: [The program utilizes arrays to store information. The user
                manages a store's inventory.]
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

public class InventoryManager {

    public static void main(String[] args) {
        //The following line allows the use of user inputs
        Scanner input = new Scanner(System.in);
        //The following two statements introduce the store
        String STORE_NAME = "Pocket Mart";
        System.out.println("Welcome to the "
                + STORE_NAME + " inventory manager");
        //The following statement assigns 5 values to the items array
        String[] items = {"onion", "broccoli",
            "carrot", "zucchini", "cucumber"};
        //The following statements assign 5 values to the quantities array
        int[] quantities = new int[5];
        System.out.print("Enter " + quantities.length + " quantity values: ");
        //The following do while loop keeps the program in user input mode
        //until 5 valid values are accepted
        do {
            //The following for statement uses user inputs in the array
            for (int i = 0; i < quantities.length; i++) {
                quantities[i] = input.nextInt();
                //The folowing if statement resets the loop if an improper 
                //input is used
                if (quantities[i] <= -1) {
                    System.out.println("Error: Enter values greater or equal"
                        + " to zero. Enter all the values again.");
                    break;
                }
            }
        } while (quantities[0] <= -1 || quantities[1] <= -1
                || quantities[2] <= -1 || quantities[3] <= -1
                || quantities[4] <= -1);
        //The following statements assign 5 values to the prices array
        double[] prices = new double[5];
        System.out.print("Enter " + prices.length + " price values: ");
        //The following do while loop keeps the program in user input mode
        //until 5 valid values are accepted
        do {
            //The following for statement uses user inputs in the array
            for (int i = 0; i < prices.length; i++) {
                prices[i] = input.nextInt();
                //The folowing if statement resets the loop if an improper 
                //input is used
                if (prices[i] <= -1) {
                    System.out.println("Error: Enter values greater or equal "
                        + "to zero. Enter all the values again.");
                    break;
                }
            }
        } while (prices[0] <= -1 || prices[1] <= -1
                || prices[2] <= -1 || prices[3] <= -1
                || prices[4] <= -1);
        //The following boolean & do while loop is used to keep the program
        //running until the exit option is used
        boolean programOff = false;
        do {
            //The following print statement prompts the user to input a number
            System.out.println("Enter the number of the operation.\n"
                + "1. Print inventory\n"
                + "2. Check for low inventory\n"
                + "3. Highest and lowest inventory value items\n"
                + "4. Total inventory value\n"
                + "5. Exit");
            int operation = input.nextInt();
            //The following switch statement displays information based on
            //the number that the user input
            switch (operation) {
                //The following case displays the values of every array
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Item: " + items[i] + "\n"
                            + "Quantity: " + quantities[i] + "\n"
                            + "Price: $" + prices[i] + "\n"
                            + "Total value: $" + quantities[i] * prices[i]
                            + "\n");
                    }
                    break;
                //The following case displays the values for the items with
                //numbers below five in the quantities array
                case 2:
                    System.out.print("Quantities below 5: \n");
                    for (int i = 0; i < 5; i++) {
                        if (quantities[i] < 5) {
                            System.out.println("Item: " + items[i] + "\n"
                                + "Quantity: " + quantities[i] + "\n"
                                + "Price: $" + prices[i] + "\n"
                                + "Total value: $" + quantities[i] * prices[i]
                                + "\n");
                        }
                    }
                    //The following if statement prints a message in case none
                    //of the items have quantities below five
                    if (quantities[0] >= 5 && quantities[1] >= 5
                        && quantities[2] >= 5 && quantities[3] >= 5 
                        && quantities[4] >= 5) {
                        System.out.println("No items have a quantity under 5."
                                + "\n");
                    }
                    break;
                //The following case displays the values for the items with
                //the highest and lowest total monetary value
                case 3:
                    int max = 0;
                    int min = 0;
                    /*The following for statement determines which items have
                    the greatest and least total value. Then, the corresponding
                    numbers of the greatest and least valuable items are stored
                    in the max and min variables, respectively.*/
                    for (int i = 0; i < 5; i++) {
                        double[] totalValue = new double[5];
                        totalValue[i] = quantities[i] * prices[i];
                        if (max < totalValue[i]) {
                            max = i;
                        }
                        if (min > totalValue[i]) {
                            min = i;
                        }
                    }
                    System.out.println("Highest total value: ");
                    //The following switch statement prints out the values
                    //for the most valuable item
                    switch (max) {
                        case 0:
                            System.out.println("Item: " + items[0] + "\n"
                                + "Quantity: " + quantities[0] + "\n"
                                + "Price: $" + prices[0] + "\n"
                                + "Total value: $" + quantities[0] * prices[0]
                                + "\n");
                            break;
                        case 1:
                            System.out.println("Item: " + items[1] + "\n"
                                + "Quantity: " + quantities[1] + "\n"
                                + "Price: $" + prices[1] + "\n"
                                + "Total value: $" + quantities[1] * prices[1]
                                + "\n");
                            break;
                        case 2:
                            System.out.println("Item: " + items[2] + "\n"
                                + "Quantity: " + quantities[2] + "\n"
                                + "Price: $" + prices[2] + "\n"
                                + "Total value: $" + quantities[2] * prices[2]
                                + "\n");
                            break;
                        case 3:
                            System.out.println("Item: " + items[3] + "\n"
                                + "Quantity: " + quantities[3] + "\n"
                                + "Price: $" + prices[3] + "\n"
                                + "Total value: $" + quantities[3] * prices[3]
                                + "\n");
                            break;
                        case 4:
                            System.out.println("Item: " + items[4] + "\n"
                                + "Quantity: " + quantities[4] + "\n"
                                + "Price: $" + prices[4] + "\n"
                                + "Total value: $" + quantities[4] * prices[4]
                                + "\n");
                            break;
                        default:
                            System.out.println("Highest total value error.");
                    }
                    System.out.println("Lowest total value: ");
                    //The following switch statement prints out the values
                    //for the least valuable item
                    switch (min) {
                        case 0:
                            System.out.println("Item: " + items[0] + "\n"
                                + "Quantity: " + quantities[0] + "\n"
                                + "Price: $" + prices[0] + "\n"
                                + "Total value: $" + quantities[0] * prices[0]
                                + "\n");
                            break;
                        case 1:
                            System.out.println("Item: " + items[1] + "\n"
                                + "Quantity: " + quantities[1] + "\n"
                                + "Price: $" + prices[1] + "\n"
                                + "Total value: $" + quantities[1] * prices[1]
                                + "\n");
                            break;
                        case 2:
                            System.out.println("Item: " + items[2] + "\n"
                                + "Quantity: " + quantities[2] + "\n"
                                + "Price: $" + prices[2] + "\n"
                                + "Total value: $" + quantities[2] * prices[2]
                                + "\n");
                            break;
                        case 3:
                            System.out.println("Item: " + items[3] + "\n"
                                + "Quantity: " + quantities[3] + "\n"
                                + "Price: $" + prices[3] + "\n"
                                + "Total value: $" + quantities[3] * prices[3]
                                + "\n");
                            break;
                        case 4:
                            System.out.println("Item: " + items[4] + "\n"
                                + "Quantity: " + quantities[4] + "\n"
                                + "Price: $" + prices[4] + "\n"
                                + "Total value: $" + quantities[4] * prices[4]
                                + "\n");
                            break;
                        default:
                            System.out.println("Lowest total value error.");
                    }
                    break;
                //The following case adds up the total values of all the items
                //and displays it
                case 4:
                    double allTotal = 0;
                    for (int i = 0; i < 5; i++) {
                        allTotal += quantities[i] * prices[i];
                    }
                    System.out.println("Total value of all items: $"
                        + allTotal + "\n");
                    ;
                    break;
                //The following case closes the do while loop
                case 5:
                    System.out.println("Thank you for using the program. "
                        + "Goodbye.");
                    programOff = true;
                    break;
                default:
                    System.out.println("Error: enter a value between 1 and 5.");
            }
        } while (!programOff);
    }
    
}
