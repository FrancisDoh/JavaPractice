package day7com.blit;

    // Throw is used to defined our own exception
public class throwIntro {

    // NegativeNumberException. This we can create this class outside the throwIntro
    public static class NegativeNumberException extends Exception{ // Always extends Exception class mandatory
            //
        public NegativeNumberException(String msg){
            super(msg); // Calling the 'NegativeNumberException' parent constructor to provide me the parameter msg.
        }
    }

    // Writing a method outside our defined exception class 'NegativeNumberException' to test our exception (NegativeNumberException).
    public static void checkNumber(int number) throws NegativeNumberException{
        if(number < 0){
            throw new NegativeNumberException("Number must be positive");
        }else{
            System.out.println("Number is positive");
        }
    }

    // Main
    public static void main(String[] args) {
        //
        try{
            checkNumber(-5);
        }catch (NegativeNumberException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
