package day2com.blit;

public class TV {
    //
    public String model, os, specs, color;
    public int size, mfgYear;

    // Default Constructor
    public TV() {
    }
    // Parameterized constructor
    public TV(String model, String os, String color){
        this.model = model;
        this.os = os;
        this.color = color;
    }
    // Parameterized constructor
    public TV(int size, int mfgYear){
        this.size = size;
        this.mfgYear = mfgYear;
    }

    //

    public void printThisTVDetails(){
        System.out.println(this.model);
        System.out.println(this.os);
        System.out.println(this.specs);
        System.out.println(this.color);
        System.out.println(this.size);
        System.out.println(this.mfgYear);
    }
    //
    public void streamingNetflix(){
        System.out.println("I'm streraming Netflix on the TV model " + this.model);
    }
    //
    public int add(int a, int b){
        return a + b;
    }
    //
    public int subtract(int a, int b, int c){
        return  a - b - c;
    }
    //
    public void changeThisColor(String color) {
        this.color = color;
        System.out.println("The new color is " + this.color);
    }
    //
}

