//Example:
//List Interface

import java.util.*;

public class example2 {

    public static void main(String args[]) {

        List<String> list = new ArrayList<String>();

        list.add("Durant");

        list.add("Irving");

        list.add("Simmons");

//list.add("Stacy");

        for (String Students : list)

            System.out.println(Students);

    }

}