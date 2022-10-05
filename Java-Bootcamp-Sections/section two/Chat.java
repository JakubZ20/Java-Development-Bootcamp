import java.util.Scanner;
public class Chat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("How old are you ?");
        int age = scan.nextInt();

        System.out.println("So you are " + age + " I'm 400 years old. Nice to meet you. Enought about me. What's your favoruite coding language ? (please don't say python :)");
        scan.nextLine();
        String language = scan.nextLine();

        System.out.println("So it's " + language +  " My favoruite is Java. How about that ?");







    }
    
}
