package Chapter3;

import java.util.Scanner;

/**
 * calculates and decides which package of some item is a better deal by it's
 * weight and cost
 *
 * @author Sydnery Baxter
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the weight and price of package 1: ");
        double pckonew = input.nextDouble();
        double pckonep = input.nextDouble();

        System.out.println("Enter the weight and price of package 2: ");
        double pcktwow = input.nextDouble();
        double pcktwop = input.nextDouble();

        double a = pckonep / pckonew;
        double b = pcktwop / pcktwow;

        if (a < b) {
            System.out.println(" Package 1 has the better deal");
        }
        if (b < a) {
            System.out.println(" Package 2 has the better deal");
        }
        if (a == b) {
            System.out.println("Both packages are the same deal");
        }

    }

}
