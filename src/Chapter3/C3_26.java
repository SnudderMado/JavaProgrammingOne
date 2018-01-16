package Chapter3;

import java.util.Scanner;

/**
 * asks ad runs through yes or no questions, displaying the answer to it
 *
 * @author Sydney Baxter
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer…");
        double integer = input.nextDouble();
        double divisix = integer / 6;
        double divifive = integer / 5;
        System.out.println("Is the integer divisible by 5 AND 6? ");

        if (divisix == 0 && divifive == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No.");
        }
        System.out.println("Is this integer divisible by 5 OR 6? ");

        if (divisix == 0 || divifive == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No.");
        }
        System.out.println("Is this integer divisible by 5 or 6, but NOT both? ");

        if (divisix == 0 ^ divifive == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No.");
        }

    }

}
