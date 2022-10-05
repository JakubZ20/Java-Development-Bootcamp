import java.util.Arrays;
import java.util.concurrent.DelayQueue;

public class Main {
  public static void main(String[] args) {

    // String[] parts = new String[] {"tires", "keys"};

    Car[] cars = {
      new Car("Nissan",5000,2020,"red",new String[] {"tires", "keys"}),
      new Car("Dodge", 8500,2019,"blue",new String[] {"tires", "keys"}),
      new Car("Nissan",5000,2020,"yellow",new String[] {"tires", "filter"}),
      new Car("Honda",7000,2019,"orange",new String[] {"tires", "filter"}),
      new Car("Mercedes",12000,2015,"jet black",new String[] {"tires", "filter", "transmission"}),

    };


    Dealership dealership = new Dealership(cars);



}
}











// dealership.sell(2);
// System.out.println(dealership);

    // for (int i = 0; i < cars.length; i++) {
    //   dealership.setCar(cars[i], i);
    // }


    // System.out.println(dealership.search("Dodge", 8500));


// Car newCar = dealership.getCar(0);
// newCar.setColour("blue");
// System.out.println(dealership.getCar(0));



    // dealership.setCar(cars[i], i);
    // dealership.setCar(cars[1], 1);
    // dealership.setCar(cars[2], 2);


    // Car nissan = new Car("Nissan",5000,2020,"red",parts);
    // Car dodge = new Car("Dodge", 8500,2019,"blue",parts);
    // Car nissan2 = new Car(nissan);

    // nissan2.setColour("yellow");
    // nissan2.setParts(new String[] {"tires", "filter"});


    // nissan.drive();
    // dodge.drive();
    // nissan2.drive();


    // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was build in " + nissan.getYear() + ". It is " + nissan.getColour() + ".");
    // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was build in " + dodge.getYear() + ". It is " + dodge.getColour() + ".");
    // System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + ". It was build in " + nissan2.getYear() + ". It is " + nissan2.getColour() + ".");
    



  
    

