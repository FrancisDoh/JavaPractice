package day7com.blit;

public class ExceptionsIntro {
    /*
            EXCEPTIONS: errors that can be resolved using try, catch, finally block.
            Ex: ArithmeticException, ArrayIndexOutOfBoundException
            ERRORS: a statement that the developer needs to resolve in order to run a java program.

            FINALLY block will execute no matter what (If try block executes or not, finally block will execute).

            CHECKED:
            at the compiler time
            use keyword throw
            handled using try/catch block.

            UNCHECKED
            not checked at the compile time
            comes at trun-time
            uses keyword throws
     */
    public static void main(String[] args) {
        //
        String[] arr = {"one", "two"};
        try{
            //
            arr[1].toUpperCase();
            System.out.println(arr[1]);

        } catch (Exception e) { // Exception includes all type of exception.
            //throw new RuntimeException(e);
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("finally block executes always");
        }


    }
}
