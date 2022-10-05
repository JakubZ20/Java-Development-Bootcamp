import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");

        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffe?");
        double coffePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffe?");
        int coffeAmmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("Your fast food expenses are " + (foodPrice/coffePrice) + " times more then your coffe expenses");
        System.out.println("Weekly, you spend $" + (coffeAmmount*coffePrice) + " on coffe");
        System.out.println("Weekly, you spend $" + (foodAmount*foodPrice) + " on food");


        scan.close();
    
    }
}
