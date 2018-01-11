
package Chapter5;
    import java.util.Scanner;
/**
 *accepts votes by user input, and quits on command, displaying the number of yes and no votes
 * @author Sydney Baxter
 */
public class P5 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int yesVote = 0;
        int noVote = 0;
        String vote;

        do {
            System.out.println("Please enter 'Y' to vote Yes, 'N' to vote No and 'Q' to Quit voting.");
            vote = input.next();

            if (vote.equalsIgnoreCase("Y")) // you cannot use the == sign to compare strings
            {
                yesVote++;
            } else if (vote.equalsIgnoreCase("N")) {
                noVote++;
            } else if (!vote.equalsIgnoreCase("Q")) {
                System.out.println("Vote Invalid:");
            }
        } while (!vote.equalsIgnoreCase("Q"));

        System.out.println("Total votes Yes: " + yesVote);
        System.out.println("Total votes No: " + noVote);

    }
}
