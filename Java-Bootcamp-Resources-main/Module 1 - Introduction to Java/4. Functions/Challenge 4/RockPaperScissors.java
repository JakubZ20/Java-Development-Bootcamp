import java.util.Scanner;

import javax.print.attribute.standard.Compression;

public class RockPaperScissors {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.nextLine();
    
        if(ready.equals("yes")){
            System.out.println("Great !");
            System.out.println("rock - paper - scissors, shoot!");
        }
        else{
            System.out.println("Okay ! Let me know when you will be ready ! I'm closing the game !");
            System.exit(0);
        }


        String yourChoose = scan.nextLine();
        String compRoll = computerChoice();

        compareChoices(yourChoose, compRoll);

        System.out.println("You choose: " + yourChoose);
        System.out.println("Computer choose: " + compRoll);



        scan.close();
    }




    // if(result1(yourChoose, compRoll)){
    //   System.out.println("WOW! YOU WON !");
    //}

    //if(result2(yourChooset, compRoll)){
    // System.out.println("You lose !");
    // }


              




    //Task 3  – Write a function where the computer picks a random choice.

    public static String computerChoice(){
        double randomChoice = Math.random()*3;
        int integer = (int) randomChoice;

        switch(integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return " " ; // impossible
        }
    }

    public static void compareChoices(String yourChoose, String compRoll ){
        if((yourChoose.equals("rock") && compRoll.equals("scissors" )) || (yourChoose.equals("paper") && compRoll.equals("rock" )) || (yourChoose.equals("scissors") && compRoll.equals("paper" ))){
            System.out.println("You WON !");
        }
        else if((yourChoose.equals("scissors") && compRoll.equals("rock" )) || (yourChoose.equals("rock") && compRoll.equals("paper" )) || (yourChoose.equals("paper") && compRoll.equals("scissors" ))){
            System.out.println("You LOSE !");
        }
        else if((yourChoose.equals("rock") && compRoll.equals("rock" )) || (yourChoose.equals("paper") && compRoll.equals("paper" )) || (yourChoose.equals("scissors") && compRoll.equals("scissors" ))){
            System.out.println("WE HAVE A DRAW");
        }
        else {
            System.out.println("You can only choose between rock, paper and scissors ");
            System.exit(0);
        }

    }
        
    }



//public static boolean result1(int chooseInt, int compRoll){
//  return((chooseInt==0 && compRoll==2) || (chooseInt==1 && compRoll==0) || (chooseInt==2 && compRoll==1));
// }
//
//public static boolean result2(int chooseInt, int compRoll){
//
//    return((chooseInt==2 && compRoll==0) || (chooseInt==0 && compRoll==1) || (chooseInt==2 && compRoll==1));
//    }
       

