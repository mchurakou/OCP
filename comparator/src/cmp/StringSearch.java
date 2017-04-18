package cmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Mikalai_Churakou on 4/18/2017.
 */
public class StringSearch {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ab");
        list.add("ba");
        list.add("bd");
        list.add("aa");

        Comparator<String> c = (a, b) -> b.compareToIgnoreCase(a);

        Collections.sort(list, c);

        int id = Collections.binarySearch(list,"ab", c);
        System.out.println(id);
    }
}
