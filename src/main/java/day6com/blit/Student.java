package day6com.blit;

public class Student {
    private  int stdID, stdAge;
    private double stdGpa;
    private String stdName;

    // toString methode
    @Override
    public String toString(){
        return "Student{" +
                ", id= " + this.stdID +
                ", name= " + this.stdName + '\'' +
                ", age= " + this.stdAge +
                ", gpa= " + this.stdGpa +
                "}";
    }
    // Setters and Getters
    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public double getStdGpa() {
        return stdGpa;
    }

    public void setStdGpa(double stdGpa) {
        this.stdGpa = stdGpa;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }
}
