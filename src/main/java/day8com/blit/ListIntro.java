package day8com.blit;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        // Declare an array as arraylist.
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        // ARRAYLIST
        // Arraylist<Datatype> varName = new ArrayList<Datatype>();
        ArrayList<String> names = new ArrayList<String>();

        //
        names.add(0, "hi"); // .add() method with target index.
        for (int i = 1; i < 10; i++) {
            names.add("Hello " + i);
        }
        //names.add(null); => Accepts null but not good for manipulation.
        for (String name : names){
            System.out.println(name);
        }
        Collections.sort(names); // Sort arraylist in ascending order.
        System.out.println(names);
        Collections.reverse(names); // Sort arraylist in descending order.
        System.out.println(names
        );

        names.clear(); // Method to empty a list

        // LINKEDLIST
        // A seq of elements where each element is pointing to the next (in a chain order)
        // Good for inserting/deleting elements in the middle of the list.
        // They have nodes -> each node knows its own and the fellow element location.
        // LinkedList<Datatype> varname = new LinkedList<>();
        LinkedList<String> lkdList = new LinkedList<String>();
        lkdList.addFirst("Hi");
        lkdList.addLast("Hey");

        // STACK
        Stack<String> stk = new Stack<String>();
        stk.push("Lion");
        stk.push("Dog");
        stk.push("Horse");
        stk.push("Cat");
        System.out.println(stk);

        stk.pop(); // Remove the element at the top (Cat).
        System.out.println(stk);

        String elm = stk.peek(); // peek() selects the element at the top of the stack.
        System.out.println(elm);
    }
}
