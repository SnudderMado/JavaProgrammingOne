package Chapter3;

import java.util.Scanner;

/**
 * flip a coin- randomly generates if the coin is heads or tails, then displays
 * if the user's guess is correct
 *
 * @author Sydney Baxter
 */
public class C3_14 {

        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter your guess > 0 for heads, 1 for Tails");
        int u = input.nextInt();
        int c = (int) (Math.random() * 2);
        if (c == 1) {
            System.out.print("tails wins");

        }
        if (c == 0) {
            System.out.print(" heads wins");
        }

        if (c != u) {
            System.out.print("You lose");
        }

        if (c == u) {
            System.out.print("You win");
        }
    }

}
