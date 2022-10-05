import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();

        System.out.println("\nWhat is your last name ?");
        String lastName = scan.nextLine();

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();

        System.out.println("Make your username");
        scan.nextLine();
        String userName = scan.nextLine();

        System.out.println("\nWhat city do you live in ?");
        String city = scan.nextLine();

        System.out.println("\nWhat country do you live in ?");
        String country = scan.nextLine();

        //Ask for their last name.
        //Ask: how old are you?
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        System.out.println("Your information:");
        System.out.println("First name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Age:  " + age);
        System.out.println("Username: " + userName);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        

        //Print their information like so:


        
        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}
