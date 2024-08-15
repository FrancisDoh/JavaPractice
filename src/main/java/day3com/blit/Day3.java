package day3com.blit;
import day2com.blit.TV; // Connects this class to day2com.blit TV class.

public class Day3 {

    public static void main(String[] args){
        //
        TV samsung = new TV(); // new TV() doesn't stand error because default constructor is implemented by the developer.
        TV tcl = new TV();
        TV olg = new TV();
        // Samsung
        samsung.model = "A4";
        samsung.os = "Android";
        samsung.size = 65;
        samsung.mfgYear = 2024;
        samsung.specs = "OLED";
        // Tcl
        //tcl = new TV();
        tcl.model = "A14";
        tcl.os = "Android";
        tcl.size = 55;
        tcl.mfgYear = 2023;
        tcl.specs = "OLED";
        tcl.color = "Black";
        // Olg
        //olg = new TV();
        olg.model = "Z800";
        olg.os = "Android";
        olg.size = 45;
        olg.mfgYear = 2022;
        olg.specs = "OLED";
        olg.color = "Black";
        // Display all properties at once, using printThisTVDetails() from TV class
//        samsung.printThisTVDetails();
//        System.out.println();
//        tcl.printThisTVDetails();
//        System.out.println();
//        olg.printThisTVDetails();
        //
//        samsung.streamingNetflix();
//        System.out.println(tcl.add(24, 90));
//        System.out.println(olg.subtract(3445, 89, 90));
        samsung.changeThisColor("WHITE");
        olg.changeThisColor("BLUE");
    }
}
