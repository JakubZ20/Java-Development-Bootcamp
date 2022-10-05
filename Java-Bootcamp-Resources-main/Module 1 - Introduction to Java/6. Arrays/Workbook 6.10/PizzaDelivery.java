import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pizza toppings do you want? ");
        int result = scan.nextInt(); scan.nextLine();
        String[] toppings = new String[result];

        System.out.println("Great ! Enter each topping !");

        for(int i=0; i<toppings.length; i++){

            System.out.print(i + ".");
            toppings[i]=scan.nextLine();

        }

        System.out.println("Great ! Here are your toppings :");

        for(int i=0; i<toppings.length;i++){

            System.out.println(i+ "." +toppings[i]);
        }

        System.out.println("Press anything to confirm order !");
        scan.nextLine();
        System.out.println("Thank you ! Driver is on the way!");

    




        scan.close();


         
    }
}
