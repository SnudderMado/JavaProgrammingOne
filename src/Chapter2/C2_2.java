package Chapter2;

import java.util.Scanner;

/**
 * program that calculates and displays the area and volume of a cylinder
 *
 * @author Sydney Baxter
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter the radius and length of the cylinder");
        double Rad = input.nextDouble();
        double Len = input.nextDouble();
        double Area = Rad * Rad * 3.14;
        double Vol = Area * Len;
        System.out.print("The area is " + Area);
        System.out.print("The volume is " + Vol);

    }

}
