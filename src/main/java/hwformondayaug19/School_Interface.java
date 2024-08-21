package hwformondayaug19;

public interface School_Interface {
    //
    abstract public  void RegisterCourse(int sclID, int courseID, String courseName, int stdID);
    public void DropCourse(int courseID, int stdID, String courseName);
    public void DisplayRegisteredCourse(int courseID, int stdID, String courseName);
}
