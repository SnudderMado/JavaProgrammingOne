package Chapter5;

import java.util.Scanner;

/**
 * accepts a string from the user, then displays it in reverse
 *
 * @author Sydney Baxter
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String Input = input.nextLine();

        System.out.println("The reversed string is " + new StringBuffer(Input).reverse().toString());

    }

}
