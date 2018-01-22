
package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * asks for the user to input the lengths and elements of two lists, it then compares if they are the same
 *
 * @author Sydney Baxter
 */
public class C7_3 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //list 1
        System.out.println("Enter length of list 1");
        int [] list1 = new int[input.nextInt()];
        //fill the array
        System.out.println("Please enter " + list1.length + " elements");
        for (int x = 0; x < list1.length; x++) {
            list1[x] = input.nextInt();
        }
        
        //list2
                System.out.println("Enter length of list 2");
        int [] list2 = new int[input.nextInt()];
        //fill the array
        System.out.println("Please enter " + list2.length + " elements");
        for (int x = 0; x < list2.length; x++) {
            list2[x] = input.nextInt();
        }
      
        if(equals(list1, list2)) {
            System.out.println("The 2 lists are identical");
        } else {
            System.out.println("The 2 lists are not identical");
        }            
    }
/**
 * compares the lists
 * @param list1 the elements of list 1
 * @param list2 the elements of list 2
 * @return 
 */
    public static boolean equals(int[] list1, int [] list2) {
       
        return  Arrays.equals(list1, list2); 
    }
}
