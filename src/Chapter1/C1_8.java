package Chapter1;

/**
 * code that calculates and displays the area and perimeter
 *
 * @author Sydney Baxter
 */
public class C1_8 {

        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        double rad = 5.5;
        double perim = 2 * rad * 3.14;
        double area = rad * rad * 3.14;

        System.out.print("The perimeter is " + perim + " and the area is " + area);
    }

}
