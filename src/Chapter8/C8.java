package Chapter8;

/**
 * enter values for each day of the week, then displays the total number of
 * hours an employee worked
 *
 * @author Sydney Baxter
 */
public class C8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int[][] matrix
                = {{4, 6, 7, 9, 4, 3, 2}, //35
                {3, 4, 5, 6, 3, 2, 4}, //22
                {3, 4, 2, 5, 6, 3, 4}, //27
                {4, 8, 9, 4, 2, 3, 3}, //33
                {6, 3, 4, 6, 7, 2, 7}, //35
                {5, 6, 3, 4, 2, 7, 6}, //33
                {2, 4, 6, 3, 5, 7, 3}, //30
                {3, 4, 5, 3, 6, 3, 5}}; //29

        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 1" + matrix[i][1] + " = 22 hours total");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 2" + matrix[i][2] + " = 27 hours total");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 7" + matrix[i][7] + " = 29 hours total");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 6" + matrix[i][6] + " = 30 hours total");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 3" + matrix[i][3] + " = 33 hours total");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 5" + matrix[i][5] + " = 33 hours total");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 0" + matrix[i][0] + " = 35 hours total");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee 4" + matrix[i][4] + " = 35 hours total");
        }
    }

}
