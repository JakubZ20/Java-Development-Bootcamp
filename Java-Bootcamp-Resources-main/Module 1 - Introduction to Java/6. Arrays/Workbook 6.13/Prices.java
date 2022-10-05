public class Prices {
    public static void main(String[] args) {

         double[][] array = {{12.99, 8.99, 9.99, 10.99, 11.99},
        {0.99, 1.99, 2.49, 1.49, 2.99},
        {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        for(int i=0; i<array.length;i++){

            switch(i){
                case 0: System.out.print("Baking: "); break;
                case 1: System.out.print("Beverage: "); break;
                case 2: System.out.print("Cereals: "); break;
            }


            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");

            }
            System.out.print("\n");
        }



        //System.out.println("Baking :" + array[0][0] + " " + array[0][1]+ " " + array[0][2]+ " " + array[0][3]+ " " + array[0][4]);
        //System.out.println("Beverage :" + array[1][0] + " " + array[1][1]+ " " + array[1][2]+ " " + array[1][3]+ " " + array[1][4]);
        //System.out.println("Cereals :" + array[2][0] + " " + array[2][1]+ " " + array[2][2]+ " " + array[2][3]+ " " + array[2][4]);


        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.

        // Task 2 - Populate your 2D array with values from the table (see article)

        // Task 3 - Print the prices for each department. See the article for the expected output.  

    }
}