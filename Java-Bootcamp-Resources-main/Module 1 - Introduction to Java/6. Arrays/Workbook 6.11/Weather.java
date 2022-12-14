import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {

        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

        
 


        //Task 2, call celsiusToFahrenheit and store the result in the fahrenheit array. 

        //Task 4, Call printTemperatures for celsius and fahrenheit.
    }


    public static double[] celciusToFahrenheit(double[] celsius){
        double[] fahrenheit = new double[celsius.length];
        for(int i=0; i<celsius.length; i++){
            fahrenheit[i]=(celsius[i]/5*9)+32;       
        }
        return fahrenheit;
        

    }

    public static void printTemperatures (double[] temp, String type){
        System.out.print(type + ": ");
        for(int i=0; i<temp.length;i++){
            System.out.print(String.format("%.2f", temp[i]) + " ");

        }
        System.out.print("\n");


    }



    /** Task 3
     * Function name - printTemperatures
     * @param temp ( double[] )
     * @param type ( String ) can be either Celsius or Fahrenheit
     * 
     * Inside the function:
     *   1. Uses a for loop to print the temperature values on the SAME line.
     *       Example:  Celsius: [Celsius values separated by a space]
     *   2. Adds a new line of space after printing the contents of the array.
     *   3. (Task 5) Rounds every temperature value to two decimal places. 
     */


}
