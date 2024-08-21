package day7com.blit;

public class StringManip {
    public static void main(String[] args) {
        //
        String str = "Hi";
        StringBuilder strBD = new StringBuilder("Hello");
        StringBuffer strBF = new StringBuffer("Hey");

        //
        strBD.append(" World");
        System.out.println(strBD);

        //
        strBF.replace(1, 2, "*");
        System.out.println(strBF);

        //
        //str.append(" Class"); => Which is not possible. StringBuffer / StringBuilder are the one way to modify String values in Java.

    }
}
