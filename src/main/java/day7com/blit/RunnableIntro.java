package day7com.blit;
/*
    THREAD:
    Java supports multithreading: meanning Java can perform multiple tasks simultanuously.
    KEY CONCEPTS:
    Concurrency: xtiple threads can run in parallel, sharing the CPU time.
    Multithreading: xtiple threads can be executed within a single program.
    Synchronization: mechanism to control the acces of xtiple threads to be shared.

    WAYS TO ACHIEVE MULTI-THREADING:
    By extending a thread class
    By implementing runnable interface.

    SYNCHRONIZATION: Keyword synchronized
    When xtiple threads try to access the same resource at the same time, there can be conflict.
    Therefore, we use synchronization to control the access, and prevent race condition/conflits.

    DEADLOCK:
    A lock is applied when u have synchronization process.
    A thread is waiting outside, and a lock is applied, then once a thread has finished being processed,
    the lock will be removed and another thread can enter.
 */
public class RunnableIntro{
    public static void main(String[] args) {
        // Objects of the thread classes.
        Thread1 bullet1 = new Thread1();
        Thread2 bullet2 = new Thread2();

        // Declare the actual threads, by wrapping them into a Thread class.
        Thread thr1 = new Thread(bullet1);
        Thread thr2 = new Thread(bullet2);

        // Run the threads
        thr1.start();
        thr2.start();
    }
    }

    //
// Thread 1: Using interface Runnable method run function
class Thread1 implements Runnable{
    //
    @Override
    public synchronized void run() { // Synchronization achieved here, meaning this method should wait until the Thread 2 finishes running first.
        //
        int i=0;
        while (i<5) {
            System.out.println("Thread 1");
            i++;
        }
    }
}
// Thread 2
class Thread2 implements Runnable{
    //
    @Override
    public void run() {
        int i=0;
        while (i<5) {
            System.out.println("Thread 2");
            i++;
        }
    }
}