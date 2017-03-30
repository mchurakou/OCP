package com.mikalai.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Mikalai_Churakou on 3/31/2017.
 */
public class Collect {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
        Set<Integer> s3 = new ConcurrentSkipListSet<>(l2);

        for (Integer i : l2) {
            l2.add(5);
        }

        for (Integer i : s3) {
            s3.add(5);
        }

        System.out.println(l1.size() + " " + l2.size() + " " + s3.size());
    }
}
