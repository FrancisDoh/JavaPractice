package day5com.blit;

public class Car {
    public static int noOfWheels = 4;
    public static int noOfSeats = 5;
    private String color;
    private int doors;
    private int weight;

    //
    public Car(){

    }

    // Setters and getters

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Creating a static method.
     static void driving(){
        System.out.println("All cars have one thing in common: driving");
    }
    // Additional Methods
    public void colorDetail(){
        System.out.println("This is a special vehicle with a color of: " + this.color + " - " + this.getColor());
        System.out.println("Its number of wheels are: " + Car.noOfWheels);
    }
}
