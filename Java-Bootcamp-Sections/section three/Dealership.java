import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" Select option 'a' to buy a car");
        System.out.println(" Select option 'b' to sell a car");
        String option = scan.nextLine();
        switch (option){
            case "a": 
            System.out.println("What is your budget ? ");
            int budget = scan.nextInt();
            if(budget>= 10000){
                System.out.println("Great ! A Nissan Ultima is avaiable !");
                System.out.println("\nDo you have insurance ? Write 'yes' or 'no' ");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have license ? Write 'yes' or 'no'");
                String licence = scan.nextLine();
                System.out.println("What is your credit score ?");
                int creditScore = scan.nextInt();
                if(insurance.equals("yes") && licence.equals("yes") && creditScore>=660) {

                    System.out.println("Sold ! PLeasure doing bussines to you !");
                }
                else{
                    System.out.println("We are sorry, you are not eligible");
                }
            }
            else{
                System.out.println("We don't sell cars under $10000 ");


            }
            break;
            case "b": 
            System.out.println("What is your car value at? ");
            int value = scan.nextInt();
            System.out.println("What is your selling price? ");
            int price = scan.nextInt();

            if(value > price && price < 30000){
                System.out.println("We will buy your car !");
            }
            else{
                System.out.println("Unfortunatly, we won't buy your car");
            }

            break;
            default:  System.out.println("invalid option"); break;
        }

        



    }
}
