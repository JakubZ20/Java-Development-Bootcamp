public class Weather {
    public static void main(String[] args) {
        //double noon = 77;          //temperature at noon in fahrenheit.
        //double evening = 61;       //temperature during the evening in fahrenheit
        //double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        
        double celcius1 = conver(77);
        double celcius2 = conver(61);
        double celcius3 = conver(55);

     stringPrinter(" noon", 77, celcius1);
     stringPrinter(" evening", 61, celcius2);
     stringPrinter(" midnight", 77, celcius3);



    }

    public static double conver(double fahrenheit)
    {
        double celcius = (fahrenheit-32) * 5/9 ;
        return celcius;
    }

    public static void stringPrinter(String time, double fahrenheit, double celcius)
    {
        System.out.println("The temperature at" + time + " is " + fahrenheit + " in Farenheit, which equals " + celcius + " in Celcius");
    }


    //Task 1: Make a function here. See the doc comments below. 

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */

     
    //Task 2: Make a function here. See the doc comments below. 

    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
}