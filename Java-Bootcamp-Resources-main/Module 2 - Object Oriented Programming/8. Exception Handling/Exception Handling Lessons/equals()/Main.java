import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "blue");
        Car sameCar = new Car(car);
        Scanner scan = new Scanner(System.in);

        System.out.println(car.equals(sameCar));
    }

}
