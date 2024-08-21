package hwformondayaug19;

import java.util.Scanner;

public class Hw {
    //
    public static void main(String[] args) {
        //
        String choice = "";
        do {
            //
            Scanner sc = new Scanner(System.in);
            // Get the program continue running approval
            System.out.print("Do you wish to register a student: yes | no?");
            choice = sc.nextLine();
            //
            if(choice.equals("yes")){
                Student student = new Student(); // Student object
                Student school = new School(); // School object

        /*
        private int rollNo, noOfSubjects;
    protected int stdID;
    protected String firstName, lastName;
    double grade;
         */
                // Student ID
                System.out.print("Enter the student ID: ");
                int stdID = sc.nextInt();
                sc.nextLine();
                // Studdent First name
                System.out.print("Enter the student First name: ");
                String stdFname = sc.nextLine();
                //sc.nextLine();
                // Student Last name
                System.out.print("Enter the student Last name: ");
                String stdLname = sc.nextLine();
                //sc.nextLine();
                // Setters
                student.setStdID(stdID);
                student.setFirstName(stdFname);
                student.setLastName(stdLname);
                // Methods & Getters
                System.out.println(student.getStdID());
                System.out.println(student.getFirstName());
                System.out.println(student.getLastName());
                //
                //school.
            }

        }while(choice.equals("no"));
    }
}
