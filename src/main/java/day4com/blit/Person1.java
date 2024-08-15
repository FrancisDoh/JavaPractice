package day4com.blit;

public class Person1 {
    // Properties - Variables - Attributes.
    private int age, phoneNumber;
    private double height;
    private String name, email;
    // When these attributes are declared private, the only way to access them is using cstructors or Setters & Getters (Known as ENCAPSULATION).
    // JAva good practice: A class variables should always be declared PRIVATE.
    //
    public Person1(){

    }
    //
    public Person1(int age, int phoneNumber, double height, String name, String email){
        //
        this.age = age;
        this. phoneNumber = phoneNumber;
        this.height = height;
        this.name = name;
        this.email = email;
    }
    //
    public Person1(String name){
        this.name = name;
    }
    //
    public void eating(){
        System.out.println(this.name + " is eating.");
    }
    //
    public void sleeping(){
        System.out.println(this.name + " is sleeping.");
    }
    // this.name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    // this.age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    // this.height
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    // this.phoneNumber
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    // this.email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

}
