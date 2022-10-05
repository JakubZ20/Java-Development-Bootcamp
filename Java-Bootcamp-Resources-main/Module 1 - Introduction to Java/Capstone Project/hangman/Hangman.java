import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = words[randomWord()];
        char[] placeholders = new char[word.length()];
        for (int i = 0; i < placeholders.length; i++) {
            placeholders[i] = '_';
        }

        int misses = 0;

        char[] missedGuesses = new char[6];

        while(misses<6){

            System.out.print(gallows[misses]);
            System.out.print("Word: ");
            printPlaceholders(placeholders);
            System.out.print("\n");

            System.out.print("Misses: ");
            missedGuesses(missedGuesses);
            System.out.print("\n");

            System.out.print("Guess:   ");
            char guess = scan.nextLine().charAt(0);
            System.out.print("\n");

            if(checkGuess(word, guess)){
                updatePlaceholders(word, placeholders, guess);
            }

            else{
                missedGuesses[misses]=guess;
                misses++;
            }

            if(Arrays.equals(placeholders, word.toCharArray())){
                System.out.print(gallows[misses]);
                System.out.print("\nWord:   ");
                printPlaceholders(placeholders);
                System.out.println("\nGOOD WORK!");                
                break;
            }

            if(misses==6){
                System.out.print(gallows[misses]);
                System.out.println("\nUnfortunately, you didn't make it :c");
                System.out.println("\nThe word was: '" + word + "'");
            }

        }



    scan.close();

        
        
    }

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static int randomWord(){
        double randomNum=Math.random()*words.length;
        return(int) randomNum;
    }

    public static boolean checkGuess(String word,char guess){
        for(int i=0;i<word.length();i++){
            if (word.charAt(i)==guess){
                return true;
            }
        }
        return false;

    }

    public static void updatePlaceholders(String word, char[] placeholders,char guess){
      for(int i=0;i<placeholders.length;i++){
        if(word.charAt(i)==guess){
            placeholders[i]=guess;
        }
      } 
    }

    public static void printPlaceholders(char[] placeholders){
        for(int i=0;i<placeholders.length;i++){
            System.out.print(" "+ placeholders[i]);
        }
        
      }
    
      public static void missedGuesses(char[] misses){
        for(int i=0;i<misses.length;i++){
            System.out.print(misses[i]);
        }

      }
    

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};



    }








