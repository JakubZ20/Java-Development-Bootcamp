import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print(" Username: ");
        String usernameU = scan.nextLine();
        //pick up username
        System.out.print(" Password: ");
        String passwordU = scan.nextLine();
        //pick up password

        while(!usernameU.equals(username) || !passwordU.equals(password)){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print(" Username: ");
            usernameU = scan.nextLine();
            System.out.print(" Password: ");
            passwordU = scan.nextLine();



        }

        System.out.println("\nSign in successful. Welcome !");

        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */

        scan.close();

        
    }
}
