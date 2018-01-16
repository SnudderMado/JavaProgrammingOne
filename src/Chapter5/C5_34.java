package Chapter5;

import java.util.Scanner;

/**
 * plays a game of rock paper scissors based on user input, game ends after
 * either the user or computer win twice in a row
 *
 * @author Sydney Baxter
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int playerScore = 0;
        int compScore = 0;
        do {
            System.out.println(" Please enter your move in rock(0) paper(1) scissors(2)"); //rock being 0, paper being 1 and scissors being 2
            int playerGuess = input.nextInt();
            int computerGuess = (int) (Math.random() * 3); // Generate a 0, 1 or 2 randomly

            switch (playerGuess) {
                case 0: // if the player chose rock
                    if (computerGuess == 0) //rock (player) VS rock (computer)
                    {
                        System.out.println("Its a tie.");
                    } else if (computerGuess == 1) //rock (player) VS paper (computer)
                    {
                        System.out.println("You lose.");
                        compScore++;
                    } else if (computerGuess == 2) //rock (player) VS scissors (computer)
                    {
                        System.out.println("You win.");
                        playerScore++;
                    }
                    break;
                case 1: // if the player chose paper
                    if (computerGuess == 1) //paper (player) VS paper (computer)
                    {
                        System.out.println("Its a tie.");
                    } else if (computerGuess == 2) //paper (player) VS scissors (computer)
                    {
                        System.out.println("You lose.");
                        compScore++;
                    } else if (computerGuess == 0) //paper (player) VS rock (computer)
                    {
                        System.out.println("You win.");
                        playerScore++;
                    }
                    break;
                case 2: // if the player chose scissors
                    if (computerGuess == 2) //scissors (player) VS scissors (computer)
                    {
                        System.out.println("Its a tie.");
                    } else if (computerGuess == 0) //scissors (player) VS rock (computer)
                    {
                        System.out.println("You lose.");
                        compScore++;
                    } else if (computerGuess == 1) //scissors (player) VS paper (computer)
                    {
                        System.out.println("You win.");
                        playerScore++;
                    }
                    break;
            }

        } while (playerScore < 2 && compScore < 2);

    }

}
