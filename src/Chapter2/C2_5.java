package Chapter2;

import java.util.Scanner;

/**
 * program that calculates gratuity and total from user input
 *
 * @author Sydney Baxter
 */
public class C2_5 {

       /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your subtotal and gratuity rate");
        double Sub = input.nextDouble();
        double Grat = input.nextDouble();
        double Added = Sub * Grat;
        double Total = Sub + Added;
        System.out.print(" Your gratuity is" + Added + " and your total is " + Total);

    }

}
