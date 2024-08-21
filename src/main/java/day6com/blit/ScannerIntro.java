package day6com.blit;

import java.util.Scanner;

public class ScannerIntro {
    //
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        Student myStd = new Student();

        //
        System.out.print("Enter an integer: ");
        int stdID = sc.nextInt(); // Get integer from the terminal
        sc.nextLine(); // Should be mentioned to avoid
        //
        System.out.println("Enter a double: ");
        double stdD = sc.nextDouble(); // Get a double from the terminal
        sc.nextLine();
        //
        System.out.println("Enter a String: ");
        String stdStr = sc.nextLine(); // nextLine() is used to get String from the string.

    }
}
