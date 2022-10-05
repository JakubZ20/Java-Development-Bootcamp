public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       

        if (wallet >= toyCar)
        {

            System.out.println("Sure!");

        }

        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.

        
        double nike = 105.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");


        if(wallet>=nike){

            System.out.println("\n Sure !");

        }

        else{

            System.out.println("Sorry, i have only" + wallet + "$");
        }
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.

    }
}