import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2016);
        System.out.println("Nissan: " + nissan.hashCode());

        Car dodge = new Car("Dodge", 2018);
        System.out.println("Nissan: " + dodge.hashCode());

        Car toyota = new Car("Toyota", 2016);
        System.out.println("Nissan: " + toyota.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("Nisan: " + nissan2.hashCode());
        
        HashMap<Car, Double> prices = new HashMap<Car, Double>();
        prices.put(nissan, 10000.);
        prices.put(dodge, 102000.);
        prices.put(toyota, 14000.);

        nissan.equals(nissan2);
        System.out.println(prices.get(nissan2));


    }
}
