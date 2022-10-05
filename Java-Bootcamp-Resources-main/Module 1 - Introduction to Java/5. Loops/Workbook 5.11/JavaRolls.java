import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rolling Java. Type anything to start ");
        String start1 = scan.nextLine();
        
        while(start1.equals("")){
          System.exit(0);
        }

        System.out.println("\nGreat, here are the rules: \n -If you roll a 6 the game stops \n -If you roll a 4 nothing happens.\n -Otherwise, you get 1 point.\n You must collect at least 3 points to win.\n");

      
        /* Task 1: 
              1. print: Let's play Rolling Java. Type anything to start.
              2. Get the user to enter any value
        */

        /* Task 2: 
              1. Once the user is ready, print: 
                    Great, here are the rules:\n
                     - If you roll a 6 the game stops.
                     - If you roll a 4 nothing happens.
                     - Otherwise, you get 1 point.\n
                    You must collect at least 3 points to win. Enter anything to roll:
              2. Get the user to enter any value
        */



       int score = 0;

       while(true){
        System.out.println("Enter anything to roll\n");
        String randomV = scan.nextLine();
        int diceRoll = rollDice();
        System.out.println("\nYou rolled:" + diceRoll);
        if(diceRoll==6 && score>=3){
          System.out.println("\nEnd of game\n");
          System.out.println("Your score is: " + score +"\n");
          System.out.println("Wow, that's lucky. You win!\n");
          System.exit(0);
        }
        else if(diceRoll==6 && score<3){
          System.out.println("\nEnd of game\n");
          System.out.println("Your score is: " + score +"\n");
          System.out.println("Tough luck, you lose :(\n");
          System.exit(0);
        }

        else if(diceRoll==4){
          System.out.print("Zero points. Keep rolling.\n");
        }
        else{
          System.out.print("One point. Keep rolling\n");
          score++;
        }

      System.out.println("Your score is: " + score +"\n");
      // if(score>=3 && diceRoll==6){
       // System.out.println("Wow, that's lucky. You win!\n");
       //}
       // else if(diceRoll==6){
         // System.out.println("Tough luck, you lose :(\n");

        //}

       }

       }





      
      
       /* 
         Task 3
          1. Make a while loop that runs forever
          2. During each run, get them to enter a random value
        
          
          
          Task 5
           1. During each run, call the rollDice() function.
           2. Print each dice roll like so: You rolled a <diceRoll>.           
           
          
          Task 6
            If the user rolls a 6:
              1. print: End of game.
              2. stop the game. 

            If the user rolls a 4:
              1. print: Zero points. Keep rolling. 

            If the user rolls anything else:
              1. update the points variable by 1
              2. print: One point. Keep rolling. 

       */

      
      /* Task 7
      
           1.  After the game ends, check the user's points.
       
                 System.out.println("\nYour score is: " + score);

           2. If the score is greater than or equal to 3, print:
                  Wow, that's lucky. You win!
              Otherwise, print:
                  Tough luck, you lose :( 
      */

    

    public static int rollDice(){
      double roll = (Math.random()*6)+1;
      return (int) roll;
    }
  
  
    /** Task 4
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */ 
  
  
}
