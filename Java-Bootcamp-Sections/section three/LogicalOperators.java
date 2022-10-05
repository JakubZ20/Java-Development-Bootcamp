public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 53;
        int englishGrade = 55;
        String codeLanguage = "java";

        if(chemistryGrade> 75 || englishGrade> 75 || codeLanguage.equals("java"))
        {
            System.out.println("Congratulations !");

        }
        else{

            System.out.println("You didnt get it");


        }

        int credits = 56;
        double GPA = 1.2;

        if(credits >=40 && GPA >=2.0){

            System.out.println("You earned diploma!");
        }

        else{
            System.out.println("Unfortunatly not");
        }
    }
}
