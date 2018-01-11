package Chapter3;

import java.util.Scanner;

/**
 * steps through different questions and displaying the answer, as well as
 * grading the number by the standard grading scale
 *
 * @author Sydney Baxter
 */
public class P3 {

       /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers");

        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a < b) {
            System.out.println("The first number is less than the second");
        }

        if (a > b) {
            System.out.println("The first number is greater than the second");
        }

        if (a == b) {
            System.out.println("The first number and is equal to the second");
        }

        if (a <= b) {
            System.out.println("The first number is less than or equal to the second");
        }

        if (a != b) {
            System.out.println("The first number and is not equal to the second");
        }

        if (a == 0) {
            System.out.println("Cannot divide by zero");

        } else if (a / b < 1 && a / b > 0) {
            System.out.println("Proper Fraction");
        } else {
            System.out.println("Improper Fraction");
        }

        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80 && a < 90) {
            System.out.println("B");
        } else if (a >= 70 && a < 80) {
            System.out.println("C");
        } else if (a >= 60 && a < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (b >= 1 && b <= 100) {
            System.out.println("In Range");
        } else {
            System.out.println("Out of Range");
        }

    }

}
