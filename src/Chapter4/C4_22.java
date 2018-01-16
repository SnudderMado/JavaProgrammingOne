package Chapter4;

import java.util.Scanner;

/**
 * accepts two strings and checks if the second is a substring of the first
 *
 * @author Sydney Baxter
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string s1 ");
        String s1 = input.next();
        System.out.println("Please enter string s2 ");
        String s2 = input.next();
        if (s1.contains(s2) == true) {
            System.out.println(s2 + " is a substring of" + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }

}
