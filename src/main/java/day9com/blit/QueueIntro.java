package day9com.blit;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIntro {
    public static void main(String[] args) {
        /*
            QUEUE:
            FIFO: First In First Out.
            .offer("elm"): is used to add element.
            .add("elm") can be used to add element as well  but the handling is different for both.
            .peek(): selects the element at the front of the Queue.
            .poll(): is used to remove element at the front of the queue.
         */

        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(8);
        queue.offer(6);
        queue.offer(2);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.poll(); // Removes the elemt in front.
        System.out.println(queue);
    }
}
