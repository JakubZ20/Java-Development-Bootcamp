import java.util.Arrays;

public class TDarrays{
    public static void main(String[] args) {
        int [][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100},
        };

        for(int i = 0; i<grades.length; i++){

            switch(i){
                case 0: System.out.print("\tHarry: ");break;
                case 1: System.out.print("\tRon: ");break;
                case 2:  System.out.print("\tHermoine: ");break;

            }

            for(int j=0; j<grades[0].length;j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");

            
        }








        //for (int j=0; j<grades[0].length;j++){
        //  System.out.print(grades[0][j] + " ");
        //}
        //System.out.println("\n");
        //for (int j=0; j<grades[1].length;j++){
        //    System.out.print(grades[1][j]+ " ");
        //}
        //System.out.println("\n");
        //for (int j=0; j<grades[2].length;j++){
        //    System.out.print(grades[2][j]+ " ");
        //}





        //System.out.println("\t Harry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2]+ " " + grades[0][3]);
       // System.out.println("\t Ron: " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2]+ " " + grades[1][3]);
        //System.out.println("\t Hermione: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2]+ " " + grades[2][3]);

    }
}