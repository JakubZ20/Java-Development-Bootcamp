public class RandomNumbers {
    public static void main(String[] args) {

        int arrayRan[][] = new int [100][10];

        for(int i = 0;i<arrayRan.length;i++ ){
            for(int j=0; j<arrayRan[i].length; j++){
                arrayRan[i][j]=randomNumber();
            }
        }

        print2DArray(arrayRan);


        // Task 3 – Create a 2D array with 100 rows and 10 columns.


        /** Task 4
         * 
         * 1. Using a nested loop, populate the array with random numbers. 
         * 2. Then, pass the updated array into print2DArray.  
         * 
         */


        
    }

    public static int randomNumber(){
        double RandomNum = Math.random()*100;
        RandomNum++;
        return(int)RandomNum;

    }

    /** Task 1
     * Function name: randomNumber.
     * 
     * @return randomNumber (int)
     * 
     * Inside the function:
     *    1. return a random number between 1 and 100. 
     */


     public static void print2DArray (int[][] array){
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
            System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

     }

    /** Task 2
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *
     *   1. prints the array such that:
     *        • Each row takes up one line.
     *        • There's a space between each value.
     */
}
