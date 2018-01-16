package Chapter4;

import java.util.Scanner;

/**
 * calculates and displays the input of a worker, including calculations for net
 * pay, gross pay, and deductions
 *
 * @author Sydney Baxter
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee’s name: ");
        System.out.println("Enter number of hours worked: ");
        System.out.println("Enter hourly pay rate");
        System.out.println("Enter federal tax withholding rate:");
        System.out.println("Enter state tax withholding rate:");
        String name = input.next();
        double hours = input.nextDouble();
        double rate = input.nextDouble();
        double federal = input.nextDouble();
        double state = input.nextDouble();
        double gross = hours * rate;
        double total = (gross * federal) + (gross * state);
        double net = gross - total;

        System.out.println("Employee Name:" + name);
        System.out.println("Hours Worked:" + hours);
        System.out.println("Pay Rate:" + rate);
        System.out.println("Gross Pay:" + gross);
        System.out.println("          Deductions:");
        System.out.println("Federal Withholding:" + gross * federal);
        System.out.println("State Withholding:" + gross * state);
        System.out.println("Total Deduction:" + total);
        System.out.println("           Net Pay:" + net);

    }

}
