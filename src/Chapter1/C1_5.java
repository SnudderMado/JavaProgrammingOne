package Chapter1;

/**
 * code that adds multiplies and subtracts
 *
 * @author Sydney Baxter
 */
public class C1_5 {

        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        double x = 9.5;
        double y = 4.5;
        double z = 2.5;
        double w = 3;

        double a = 45.5;
        double b = 3.5;

        double m = x * y - z * w;
        double n = a - b;

        double total = m / n;

        System.out.println(total);
    }

}
