package day7com.blit;

public class ThreadIntro {
    //
    public static void main(String[] args) {
        //
        cooking thr1 = new cooking();
        cleaning thr2 = new cleaning();

        // Start the threads
        thr1.start();
        thr2.start();

    }
}
        // Thread 1: This thread here is an extendable class
         class cooking extends Thread{
            public void run(){
                int i=0;
                while(i<400){
                    System.out.println("Cooking thread");
                    i++;
                }
            }
        }
        // Thread 2
        class cleaning extends Thread{
            public void run(){
                int j = 0;
                while(j<400){
                    System.out.println("Cleaning thread");
                    j++;
                }
            }
        }


