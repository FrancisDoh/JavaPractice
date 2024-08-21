package day6com.blit;

public class Day6{

    public static void main(String[] args) {

        // ABSTRACTION
        // Hidding of certains details and functionalities

        // 1 - Abstract class
        // 2 - Interface.

        //
        // BankAccount acc = new BankAccount(); Cannot be instantiated because it's an abstract class.

        //
        String s1 = "hello";
        String s2 = "hello";

        String c = "hey";
        c = "hi";

        String s3 = "hello world"; // Stored in Heap memory.String pool
        String s4 = new String("hello word"); // Stored in Heap memory bcz of the "new" keyword.

        System.out.println(s1 == s2); // true // == checks memory location and data type only, but not the actual data.
        System.out.println(s3 == s4); // false

        System.out.println(s3 + " length: " + s3.length());
        System.out.println(s3 + " index of 'w' : " + s3.indexOf('w'));
        System.out.println(s3 + " from beginning index: " + s3.substring(1));
        System.out.println(s3 + " substring beginning index 3 and ending index 9: " + s3.substring(1, 9));


    }
}
