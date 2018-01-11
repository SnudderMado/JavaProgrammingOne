
package Chapter6;
    import java.util.Scanner;
/**
 *accepts user input for amounts of different currencies they would like to exchange
 * @author Sydney Baxter
 */
public class P6 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String answer = "";
        double exchange = 0;
        String purchasing = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many euros a dollar will buy");
        double euro = input.nextDouble();
        System.out.println("Please enter how many pounds a dollar will buy");
        double pound = input.nextDouble();
        System.out.println("Please enter how many yen a dollar will buy");
        double yen = input.nextDouble();

        // make the following into a loop to keep asking 
        do {

            System.out.println("How many dollars would you like to exchange?");
            exchange = input.nextDouble();
            System.out.println("What would you like to buy? Enter 'E' for Euros, 'P' for Pounds, or 'Y' for Yen");
            purchasing = input.next();

            switch (purchasing) {
                case "E":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", exchange, conversion(exchange, euro));
                    break;
                case "P":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pounds.\n", exchange, conversion(exchange, pound));
                    break;
                case "Y":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", exchange, conversion(exchange, yen));
                    break;
            }

            // Asking the user if they want to perform more conversions
            do {
                System.out.print("Are there more conversions to perform? ");
                answer = input.next();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
        } while (answer.equalsIgnoreCase("Yes"));
        System.out.println("Thank You for Converting with us");
    }
    /**
     * conversion
     * calculates the amount the conversion will cost
     *
     * @param double exchange
     * @param double currency
     */
    public static double conversion(double exchange, double currency) {
        if (exchange > 100) {
            return (exchange * .95 * currency);
        } else {
             return (exchange * .90 * currency);
        }

    }
}
