package day8com.blit;

public class Day8 {
    /*
        GARBAGE COLLECTOR:
        It comes announced andand takes the data that is not being used.
        We cannnot force it.

        FINAL:
        Classes/Methods/Variable that cannot change, once defined.
        They cannot be inherited as well.

        FINALIZE:
        A method that runs before an object is removed from garbage collector.
        for cleanup and removing of files.

        FINALLY:
        The last block of code after try catch. We can only have one try & finally.
        We can have as many of catch.
        Finally block will execute no matter if the try catch works or not.

        GENERICS:

     */
    public static void main(String[] args) {
        //
        GenericsIntro gen = new GenericsIntro();
//        gen.shout("Hey", 890);
//
        //
        GenericsIntro<Integer, String> nextGen = new GenericsIntro<>(1, "Hello");
        GenericsIntro<Integer, String> nextG = new GenericsIntro<>(2, "Hello");
//        nextGen.display();
//        nextG.display();

        // Collection framework were introduced bcz array were fixed in size, and only one data type can be defined per array.
        /*
            List    -> Arraylist, Linkedlist, Stack.
            Set     -> Hashset, Linkedhashset
            SortedSet -> Treeset
            QUeue   -> Queue, Priorityqueue, Doubleendequeue
            Map     -> Hashmap, Linkedhashmap, Treemap.
         */

    }
}
