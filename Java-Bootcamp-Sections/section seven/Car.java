import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String colour;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.colour = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source){
        this.make = source.make;
        this.price= source.price;
        this.year = source.year;
        this.colour = source.colour;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);

    }

    public String getMake(){
        return this.make;
    }

    public double getPrice(){
        return this.price;
    }

    public int getYear(){
        return this.year;
    }

    public String getColour(){
        return this.colour;
    }

    public String[] getParts(){
        return Arrays.copyOf(this.parts,this.parts.length);
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setParts(String[] parts){
        this.parts= Arrays.copyOf(parts, parts.length);
    }


    public void drive(){
        System.out.println("You bought the beatiful " + this.year + " " + this.colour + " " + this.make + " for $" + this.price +  ".");
        System.out.println("Please drive the car to the nearest exit. \n");
    }

    public String toString(){
        return "Make: " + this.make + ".\n"
        + "Price: " + this.price + ".\n"
        + "Year: " + this.year + ".\n"
        + "Colour: " + this.colour + ".\n"
        + "Parts: " + Arrays.toString(parts) + ".\n";

    }


    }



