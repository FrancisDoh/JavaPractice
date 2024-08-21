package day7com.blit;

public class throwsIntro{
    //
    private static int divide(int a, int b) throws ArithmeticException{ // throws key would throw the error but not actually solve the problem. It's only useful for notifying the developer.
        //
        return a/b;
    }
    public static void main(String[] args) {
        //
        try{
            System.out.println(divide(4,0));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
