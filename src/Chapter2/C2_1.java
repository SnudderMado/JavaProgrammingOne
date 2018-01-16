package Chapter2;

import java.util.Scanner;

/**
 * Program that converts Celsius to Fahrenheit
 *
 * @author Sydney Baxter
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius");
        double Cel = input.nextDouble();
        double Fah = (9.0 / 5) * Cel + 32;
        System.out.print(Cel + "  Celsius is " + Fah + "  Fahrenheit");

    }

}
