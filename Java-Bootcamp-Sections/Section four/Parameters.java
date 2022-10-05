import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {

        measureRectange(4.3, 2.2);
        measureRectange(3.2, 4.1);
        measureRectange(3.5, 1.2);
        measureRectange(1.6, 5.6);
        measureRectange(10.1, 0.7);
        measureRectange(4.3, 5.6);


    }

    public static void measureRectange(double length, double width){
        double area = length * width;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area + "\n");


    }
}
