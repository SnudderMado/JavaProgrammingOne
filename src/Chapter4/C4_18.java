package Chapter4;

import java.util.Scanner;

/**
 * outputs the name of a major by input
 *
 * @author Sydney Baxter
 */
public class C4_18 {

        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your major: M,C,I and your year: 1,2,3,4");

        String student = input.next();

        if (student.equalsIgnoreCase("M1")) {
            System.out.println("Mathematics Freshman");
        } else if (student.equalsIgnoreCase("M2")) {
            System.out.println("Mathematics Sophomore");
        } else if (student.equalsIgnoreCase("M3")) {
            System.out.println("Mathematics Junior");
        } else if (student.equalsIgnoreCase("M4")) {
            System.out.println("Mathematics Senior");
        } else if (student.equalsIgnoreCase("C1")) {
            System.out.println("Computer Science Freshman");
        } else if (student.equalsIgnoreCase("C2")) {
            System.out.println("Computer Science Sophomore");
        } else if (student.equalsIgnoreCase("C3")) {
            System.out.println("Computer Science Junior");
        } else if (student.equalsIgnoreCase("C4")) {
            System.out.println("Computer Science Senior");
        } else if (student.equalsIgnoreCase("I1")) {
            System.out.println("Information Technology Freshman");
        } else if (student.equalsIgnoreCase("I2")) {
            System.out.println("Information Technology Sophomore");
        } else if (student.equalsIgnoreCase("I3")) {
            System.out.println("Information Technology Junior");
        } else if (student.equalsIgnoreCase("I4")) {
            System.out.println("Information Technology Senior");
        } else {
            System.out.println("Invalid");
        }

    }

}
