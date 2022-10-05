import java.util.Arrays;

public class Receipt {
    public static void main(String[] args) {

        String apples[] = {"Gala","Granny Smith", "Macintosh"};
        double prices[] = {1.99, 1.49, 1.29};

 
        //Task 1: Create two arrays (see Workbook article)

        System.out.println("Here's your receipt:\n");

        for(int i=0; i<apples.length; i++){
            System.out.println("\t apple " + apples[i] + " : $" + prices[i]);

        }
        /* Task 2
            Use a for loop to print each apple and the corresponding price.
            
            for {
                println(\t<apple i >: $<price i >)
            }
        */
    }
}