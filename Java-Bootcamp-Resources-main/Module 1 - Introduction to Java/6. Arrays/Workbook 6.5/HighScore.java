public class HighScore {
    public static void main(String[] args) {

        System.out.println(randomNumber());

        int arrayRand[] = {randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};

        int highScore = 0;
        
        System.out.print("Here are the scores: " );

        for (int i=0 ; i<arrayRand.length; i++){
            System.out.print("" + arrayRand[i] + " ");
        }

        for(int i=0 ; i<arrayRand.length; i++){
            if(arrayRand[i]>highScore){
                highScore=arrayRand[i];
            }
            
        }

        System.out.println("\nThe highest score is " + highScore + " give this man a cookie");



        
        /** Task 2 
         *
         *    1. Create an array that stores 10 random numbers
         *    2. Using a for loop, print the array elements on the same line.
         *         Example – Here are the scores: 14775 48328 7928 27102 21787 21063 38096 42711 32863 23707
         */

         /** Task 3
          *  
          *   1. Using a for loop, find the highest score in the array and update the highScore.
          *   2. println("\n\nThe highest score is: <>. Give that man a cookie!");

          */


    }

    public static int randomNumber(){
        double ranNum = Math.random()* 50001 ;
        ranNum++;
        return (int) ranNum;

    }

    
    /** Task 1
     * Function name – randomNumber
     * @return random number (int)
     * 
     * Inside the function
     *  - returns a random number between 0 and 50000
     */
    

}
