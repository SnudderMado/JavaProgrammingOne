package Chapter4;

import java.util.Scanner;

/**
 * accepts and displays the winner of a bidding war by comparing the aspects of
 * their bids
 *
 * @author Sydney Baxter
 */
public class P4 {

        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first bidder name, hours to complete, and charge per hour");
        String name1 = input.next();
        int hours1 = input.nextInt();
        double charge1 = input.nextDouble();
        double cost1 = hours1 * charge1;

        System.out.println("Please enter the second bidder name, hours to complete, and charge per hour");
        String name2 = input.next();
        int hours2 = input.nextInt();
        double charge2 = input.nextDouble();
        double cost2 = hours2 * charge2;

        if (cost1 < cost2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name1, cost1, hours1);
        }

        if (cost2 < cost1) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name2, cost2, hours2);
        }

        if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name1, cost1, hours1);
        }

        if (cost1 == cost2 && hours2 < hours1) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name2, cost2, hours2);
        }

        if (cost1 == cost2 && hours2 == hours1) {
            System.out.printf("The bidders have identical costs with a total cost of %.2f and %d hours", cost1, hours1);
        }

    }

}
