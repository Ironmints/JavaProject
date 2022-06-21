//Example:
//Set Interface

import java.util.*;

public class example1 {

    public static void main(String args[]) {

        int count[] = { 7, 11, 10, 33, 30, 24 };

        Set<Integer> set = new HashSet<Integer>();

        try {

            for (int i = 0; i <= 5; i++) {

                set.add(count[i]);

            }

            System.out.println(set);

            TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);

            System.out.println("The sorted list is:");

            System.out.println(sortedSet);

            System.out.println("First element of the set is: " + (Integer) sortedSet.first());

            System.out.println("last element of the set is: " + (Integer) sortedSet.last());

        } catch (Exception e) {

        }

    }

}
