import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");

        String response = scan.nextLine();


        //  Task 1: Set up Scanner, and pick up the user's response.  

        
        for (int i = 0; i < store.length; i++) {

            if(store[i].equals(response)){
                System.out.println("\nWe have that in aisle:\n" + i);
                break;

            }
          /* Task 2  
                if element equals user's response  {
                    println: \nWe have that in aisle:  <index>
                    break;
                }
          */
        }

    }
}
