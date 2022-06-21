//Example:
//Map Interface

import java.util.*;

import java.util.Map.Entry;

public class example5 {

    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Turner");

        map.put(2, "Anthony");

        map.put(3, "Zeng");

        for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {

            Entry<Integer, String> m = iterator.next();

            System.out.println(m.getKey() + " " + m.getValue());

        }

    }

}
