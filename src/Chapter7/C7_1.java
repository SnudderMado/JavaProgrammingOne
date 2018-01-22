
package Chapter7;
import java.util.Scanner;
/**
 * sorts and grades the scores of students
 *
 * @author Sydney Baxter
 */
public class C7_1 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Please enter how many students...");
        int students = input.nextInt();
        int score[] = new int[students];

        // Filling the array
        System.out.println("Please enter " + students + " student scores...");
        for (int x = 0; x < students; x++) {
            score[x] = input.nextInt();
        }
        
        //getting the best score
        int bestScore = 0;
        for (int x = 0; x < students; x++) {
            if(score[x] > bestScore) {
                bestScore = score[x];
            }
        }
            
        //displaying output
        for (int x = 0; x < students; x++) {

            if (score[x] >= bestScore - 10) {
                System.out.println("Student " + x + " with score " + score[x] + " got an A.");
            } else if (score[x] >= bestScore - 20) {
                System.out.println("Student " + x + " with score " + score[x] + " got an B.");
            } else if (score[x] >= bestScore - 30) {
                System.out.println("Student " + x + " with score " + score[x] + " got an C.");
            } else if (score[x] >= bestScore - 40) {
                System.out.println("Student " + x + " with score " + score[x] + " got an D.");
            } else {
                System.out.println("Student " + x + " with score " + score[x] + " got an F.");
            }
        }
    }

}
