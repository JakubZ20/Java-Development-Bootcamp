import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String grocery[] = {"apples", "bananas", "candy", "chocolate", "coffe", "tea"};
        System.out.println("Do you sell coffee?\n");
        for (int i=0; i<grocery.length; i++){
            if(grocery[i].equals("coffe")){
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }



        
        /* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array. 
        */
 
        /* Task 2:
           1. System.out.println("\nDo you sell coffee?");

           2. Using the for loop from task 1:
            • check if Java Grocer sells coffee.
            • if so, break the loop and print: \nWe have that in aisle: <index>

        */
    
    }
}
}
