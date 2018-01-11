
package Chapter6;
    import java.util.Scanner;
/**
 * accepts a user input password, and then decides if the password is valid based 
 * on a set of parameters
 * @author Sydney Baxter
 */
public class C6_18 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your password…");
        String pass = input.nextLine();
      
        //just have code here that calls the method and displays valid or invalid password
        //based on the logic
        if(isValidPassword(pass) == true){
           System.out.println("Password is Valid");
        }else {
           System.out.println("Invalid Password");
        }

    }
    /**
     *
     * @param password is passed user input to judge if the password is valid
     */
    public static boolean isValidPassword(String password) {

        // A password must have at least eight characters
        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }

        // A password consists of only letters and digits
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }

        }

        // A password must contain at least two digits
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }

        // If all the conditions are met, return true
        return true;
    }
}
