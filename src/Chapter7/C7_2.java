
package Chapter7;
import java.util.Scanner;
import java.util.Arrays;

/**
 * fills an array and sorts the values
 *
 * @author Sydney Baxter
 */
public class C7_2 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        double [] score = new double[10];
        //fill the array
        System.out.println("Please enter " + score.length + " scores...");
        for (int x = 0; x < score.length; x++) {
            score[x] = input.nextInt();
        }

        //get the minimun
        System.out.println("The minimum number is " + min(score));
        
    }
/**
 * sorts array
 * @param array array filled with user input
 * @return 
 */
    public static double min(double[] array) {
        Arrays.sort(array); //this sorts your array in ascending order
        //if your array is sorted, where is the minimum number going to be
        // in the 0 place
        return array[0];
    }
}

