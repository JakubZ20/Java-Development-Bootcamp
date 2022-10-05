import java.util.Scanner;

public class TQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("1. Which country held the 2016 Summer Olympics?" 
    );
    System.out.println("\na) China");
    System.out.println("\nb) Irleand");
    System.out.println("\nc) Brazil");
    System.out.println("\nd) Italy");
    String answer1 = scan.nextLine();

    int score = 0;

    if(answer1.equals("c")){
        score += 5;
    }
    else{
        score = 0;
    }

    System.out.println("2. Which planet is the hottest?");
    System.out.println("\na) Venus");
    System.out.println("\nb) Saturn");
    System.out.println("\nc) Mercury");
    System.out.println("\nd) Mars");
    String answer2 = scan.nextLine();
    if(answer2.equals("a"))
    {
        score += 5;
    }

    else{
        score = score; 
    }

   System.out.println("Your score is " + score +"/10");






    }
}
