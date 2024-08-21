package hwformondayaug19;

public class School extends Student implements School_Interface{ // School inherents from superclass Student, and Interface InterfaceSchool
    /*
    Create a School class:

Have methods:
RegisterCourse
DropCourse
DisplayRegisteredCourse
     */
    private int sclID, courseID;
    private String sclName, courseName;

    public School(){

    }
    // Method RegisterCourse
    @Override
    public void RegisterCourse(int sclID, int courseID, String courseName, int stdID){
        // TO DO
        System.out.println("The student with ID " + super.stdID + " has successfully registered to the course ID: " + this.courseID + " and course name: " + this.courseName);
    }
    // Method DropCourse
    @Override
    public void DropCourse(int courseID, int stdID, String courseName){
        // TO DO
        System.out.println("The student with ID: " + super.stdID + " has successfully the course ID: " + this.courseID + " and course name: " + this.courseName);
    }
    // Method DisplayRegisteredCourse
    @Override
    public void DisplayRegisteredCourse(int courseID, int stdID, String courseName){
        // TO DO
        System.out.println("The student with ID " + super.stdID + " has registered to the course ID: " + this.courseID + " and course name: " + this.courseName);

    }

    // Setters & Getters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSclName() {
        return sclName;
    }

    public void setSclName(String sclName) {
        this.sclName = sclName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getSclID() {
        return sclID;
    }

    public void setSclID(int sclID) {
        this.sclID = sclID;
    }
}
