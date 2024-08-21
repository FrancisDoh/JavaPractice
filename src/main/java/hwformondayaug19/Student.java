package hwformondayaug19;

public class Student {
    //
    /*
    Create a Student class

Give attributes:
rollNo
firstName
lastName
grade
noOfSubjects

Give methods:

GetName
GetGrade
GetNoOfSubjects

SetName
SetGrade
SetSubjects
     */
    private int rollNo, noOfSubjects;
    protected int stdID;
    protected String firstName, lastName;
    double grade;
    //
    public Student(){

    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
// Setters & Getters

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getNoOfSubjects() {
        return noOfSubjects;
    }

    public void setNoOfSubjects(int noOfSubjects) {
        this.noOfSubjects = noOfSubjects;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
