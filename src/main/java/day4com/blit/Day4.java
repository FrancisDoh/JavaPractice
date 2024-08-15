package day4com.blit;

import java.util.ArrayList;
import java.util.List;

public class Day4 {
    //
    public static void main(String[] args){
        //
        // Difference btw JS and Java. Java is a Interpreter and Compiler language. JS is an Interpreter code based (script advantage could be interpreted by Node). JAVA & JS are created by the same company.
        // TYPE CASTING
        // PRIMITIVE DATATYPES
        // String is a non-primitive data type because it's a class, and it contains a lot of method to manipulate its objects. Ex: .equals() method
        // Java is not 100% OOP because it has non-primitive data types.

        // TYPE CASTING
        // Widening: byte -> short -> int -> double
        // Narrowing: double -> int -> byte

        // Widening
        byte a = 120;
        int b =  a;
//        System.out.println("Widenning casting example: " + b);

        // Narrowing
        float c = 3.45f;
        int d = (int) c;
//        System.out.println("Narrowing casting example: " + d);

        //
     Person1 bri = new Person1("Brittany");
////        bri.eating();
////        bri.sleeping();
//        //
       Person1 steven = new Person1("Steven");
//      steven.eating();
//       steven.sleeping();
//        //
//        List<Person1> lst = new ArrayList<Person1>();
//        lst.add(bri);
//        lst.add(steven);
//        lst.add(new Person1("Mark"));
//        lst.add(new Person1("Stephanie"));
//        //
//        for (Person1 person1 : lst) {
//            System.out.println(person1.getName());
//
//        }
        //
        bri.setName("BRITTANY");
        steven.setName("STEVEN");
        bri.setAge(28);
        steven.setAge(63);
        bri.setHeight(5.7);
        steven.setHeight(6.2);
        bri.setPhoneNumber(98789909);
        steven.setPhoneNumber(973788667);
        bri.setEmail("bri@gmail.com");
        steven.setEmail("steven@gmail.com");
        //
        System.out.println(bri.getName());
        System.out.println(steven.getName());
        System.out.println(bri.getAge());
        System.out.println(steven.getAge());
        System.out.println(bri.getHeight());
        System.out.println(steven.getHeight());
        System.out.println(bri.getPhoneNumber());
        System.out.println(steven.getPhoneNumber());
        System.out.println(bri.getEmail());
        System.out.println(steven.getEmail());

        // ARRAYS
        String[]  box = new String[10]; // How to declare array var in Java.
        box[0]  = "Marie";
        box[1]  = "Therese";
        box[2]  = "CHristell";
        box[3]  = "Donald";
        box[4]  = "Steven";
        box[5]  = "Marc";
        box[6]  = "Jean";
        box[7]  = "Abdulus";
        box[8]  = "Ehtiennee";
        box[9]  = "Grace";

        System.out.println(box[0]);
        System.out.println(box[1]);
        System.out.println(box[2]);
        System.out.println(box[3]);
        System.out.println(box[4]);
        System.out.println(box[5]);
        System.out.println(box[6]);
        System.out.println(box[7]);
        System.out.println(box[8]);
        System.out.println(box[9]);

    }
}
