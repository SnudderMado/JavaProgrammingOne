package Chapter2;

import java.util.Scanner;

/**
 * program that calculates the entire cost of a meal, including tax and suggeste
 * tip
 *
 * @author Sydney Baxter
 */
public class P2 {

       /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the price of your meal, drink, and desert");

        double mPrice = input.nextDouble();
        double lPrice = input.nextDouble();
        double dPrice = input.nextDouble();
        double fPrice = mPrice + lPrice + dPrice;
        double sTax = fPrice * .10;
        double tCost = (sTax + fPrice) * .15;
        double total = fPrice + sTax + tCost;

        System.out.print("Your entire meal price is " + fPrice);

        System.out.print("So your sales tax is " + sTax);

        System.out.print("And your tip works out to be" + tCost);

        System.out.print("So your total today is " + total);

    }

}
