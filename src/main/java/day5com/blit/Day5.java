package day5com.blit;

public class Day5 {
    //

    public static void main(String[] args){
        //
         // static is a initial copy of a class member.
        //
        Car car = new Car();
        Car appleCar = new Car();
        Car volvoTruck = new Car();
        //
        Car.noOfWheels = 5; // Value of the static var can be modified.
        Car.driving(); // Calling a static method.
        //
        appleCar.setColor("Gray");
        volvoTruck.setColor("Black");
        //
        appleCar.colorDetail();
        volvoTruck.colorDetail();

        // Polymorphism practice
        Animal dog = new Dog();
        dog.sound();

        Dog cat = new Cat();
        cat.sound();

        //Object o = new Cat();

    }
}

