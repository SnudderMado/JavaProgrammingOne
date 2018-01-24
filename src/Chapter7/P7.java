package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * accepts user input for amounts of different currencies they would like to
 * exchange
 *
 * @author Sydney Baxter
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Please enter the array size");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int entered[] = new int[num];
        filler(entered, input);
        System.out.println("Average: " + averager(entered));
        displayArray(entered);

    }

    /**
     * fills array
     *
     * @param entered amount of entered numbers
     * @param input user input
     */
    public static void filler(int[] entered, Scanner input) {
        System.out.println("Please enter" + entered.length + " numbers...");
        for (int x = 0; x < entered.length; x++) {
            entered[x] = input.nextInt();
        }
    }

    /**
     * averages array
     *
     * @param entered entered values
     * @return
     */
    public static double averager(int[] entered) {

        Scanner input = new Scanner(System.in);
        double avg = 0;
        for (int x = 0; x < entered.length; ++x) {
            System.out.println("Enter the value");
            entered[x] = input.nextInt();
        }

        return avg;
    }

    /**
     * displays array
     *
     * @param entered entered values
     */
    public static void displayArray(int[] entered) {
        System.out.println("Array: " + java.util.Arrays.toString(entered));
    }
}
