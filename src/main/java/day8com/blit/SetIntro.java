package day8com.blit;

import java.util.*;

public class SetIntro {
    public static void main(String[] args) {

        // HASHSET
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(45);
        set.add(65);
        set.add(null); // Accepts null.

        set.add(65);
        System.out.println(set);

        // LINKEDHASHSET
        Set<Integer> lkhasht = new LinkedHashSet<Integer>();
        lkhasht.add(10);
        lkhasht.add(20);
        lkhasht.add(null); // Takes in a null.
        System.out.println(lkhasht);

        // TREESET
        Set<String> tSet =new TreeSet<>(Comparator.reverseOrder()); // Sorting in descending order applied.
        tSet.add("apple");
        tSet.add("orange");
        tSet.add("banana");
        tSet.add("grapes");

        System.out.println(tSet);
    }
}
