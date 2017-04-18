package com.mikalai.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * Created by Mikalai_Churakou on 4/18/2017.
 */
public class Rabbit {

    public static void await(CyclicBarrier cb){
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2, () -> System.out.println("FINISH"));
        IntStream.iterate(1, i -> 1).limit(2).forEach(value -> await(cb));

    }
}
