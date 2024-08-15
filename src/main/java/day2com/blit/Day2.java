// fori => Shortcut for loop in IntelliJ
// sout => Shortcut for System.out.println()

package day2com.blit;

public class Day2 {
    //
    public static void main(String[] args){
        // SWITCH STATEMENT
        String signal = "wednesday";

        switch(signal){
            case "monday":
                System.out.println("Monday");
                break; // It's used to stop the loop.
            case "tuesday":
                System.out.println("Tuesday");
                break; // It's used to stop the loop.
            case "wednesday":
                System.out.println("Wednesday");
                break; // It's used to stop the loop.
            case "thursday":
                System.out.println("Thursday");
                break; // It's used to stop the loop.
            case "friday":
                System.out.println("Friday");
                break; // It's used to stop the loop.
            case "saturday":
                System.out.println("Saturday");
                break; // It's used to stop the loop.
            case "sunday":
                System.out.println("Sunday");
                break; // It's used to stop the loop.
            default: System.out.println("Anything");

        }
        // LOOPS
        for(int i=10; i>0; i--){
//            System.out.println(i);
        }

        for (int i = 1000; i > 499 ; i-=10) { // i-=10 decreases by ten each cycle
            //System.out.println(i);
        }
        //
        for (int i = 0; i < 2; i++) { // 0 & 1
            //
//            System.out.println("Outer " + i); // Will run once, then let the inner loop execute totally before heading back to run again.
            for (int j = 1; j < 3; j++) { // 1 & 2
                System.out.println("inner " + j);

            }

        }

        // WHILE LOOP:
        int i = 0;
        while(i<11){
//            System.out.println(i);
            i++;
        }

        int a = 1000;
        while(a>=500){
            System.out.println(a);
            a-=10;
        }

        // DO WHILE LOOP
        int x=0;
        do{
            System.out.println(x);
            x++;
        }while (x<11);
        //
        for (int j = 1; j < 51; j++) {
            if(j % 2 == 0){
                System.out.println(j + " = even");
            }else{
                System.out.println(j + " = odd");
            }
        }
        //
        for (int j = 1000; j >0; j--) {
            if(j % 3 == 0) System.out.println(j);//System.out.println(j + " * 3 = " + j*3 );
        }

        // Code for multiplication table of a calculator.
        for (int z = 1; z < 6; z++) { // 0 & 1
            //
           System.out.println("Multiplication table of " + z); // Will run once, then let the inner loop execute totally before heading back to run again.
            for (int j = 1; j < 11; j++) { // 1 & 2
                System.out.println(j + " * 3 = " + j*z);

            }

        }

        // Objects
        Person p = new Person();
        TV samsung = new TV();
        TV tcl, olg;
        //
        // Samsung
        samsung.model = "A4";
        samsung.os = "Android";
        samsung.size = 65;
        samsung.mfgYear = 2024;
        samsung.specs = "OLED";
        //
        // Tcl
        tcl = new TV();
        tcl.model = "A14";
        tcl.os = "Android";
        tcl.size = 55;
        tcl.mfgYear = 2023;
        tcl.specs = "OLED";
        tcl.color = "Black";
        //
        // Olg
        olg = new TV();
        olg.model = "Z800";
        olg.os = "Android";
        olg.size = 45;
        olg.mfgYear = 2022;
        olg.specs = "OLED";
        olg.color = "Black";
        //
        System.out.println(samsung.size);
        System.out.println(tcl.specs);
        System.out.println(olg.color);
        // Display all properties at once, using printThisTVDetails() from TV class
//        samsung.printThisTVDetails();
//        System.out.println();
//        tcl.printThisTVDetails();
//        System.out.println();
//        olg.printThisTVDetails();

    }
}
