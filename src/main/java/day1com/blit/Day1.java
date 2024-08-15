package day1com.blit;

import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    //
    // Method to detect if input date is a leap year
    private static boolean  checkLeapYearStatus(int year){
        //
//        boolean statusOutput = false;
//        //
//        //return year % 4 == 0;
//        if(year % 4 == 0 ){
//            if(year % 100 == 0 && year % 400 == 0){
//                statusOutput = true;
//            }else if(year % 100 == 0){
//                statusOutput = true;
//            }
//        }else{
//            statusOutput = false;
//
//        }
//            return  statusOutput;
        //
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                /*
                If (year % 400 == 0){
                return true;
                }else{
                return false;
                }
                 */
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    // main
    public static void main(String[] args){
        //
        long a = 48L; // a value is 48
        float b = 2.8f; // b value 2.8

        //
        String fName = "Jack";
        String lName = "Bloomberg";
        char init = 'J';
        int age = 45;
        double height = 1.75;

        //System.out.println(fName + " " + lName + " with the initial " + init + " and age of " + age + " is " + height + "m tall.");

        // OPERATIONS
        int f = 0;
        f += 1; // f = f + 1 OR f++

        //System.out.println(f);

        // OPERATORS
        // LOGICAL OPERATORS
        // &&
        // ||
        // !
        int v1 = 2;
//        System.out.println(v1 > 3 && v1 == 3); // Prints false
//        System.out.println(v1 > 1 || v1 == 3); // prints false

        // Leap Year HW
        /*
        Years divisible by 4 are leap years
        Years divisible by 100 are not leap years, unless they are also divisible by 400.
         */
        int inputYear;
        System.out.print("Enter a year: ");
        Scanner input = new Scanner((System.in));
        inputYear = input.nextInt();
        boolean yearStatus = checkLeapYearStatus(inputYear); // Call of year checking method.
        //
        if(yearStatus){ // If true
            System.out.println(inputYear + " is a leap year, meaning its February month counts 29 days.");

        }else{ // Else false
            System.out.println(inputYear + " is a not leap year, meaning its February month counts 28 days.");
        }

    }
}
