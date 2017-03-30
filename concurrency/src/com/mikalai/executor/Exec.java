package com.mikalai.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * Created by Mikalai_Churakou on 3/31/2017.
 */
public class Exec {
    static int count;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Future<?>> results = new ArrayList<>();

        IntStream.iterate(0,i -> i +1).limit(5).forEach(value -> {
            results.add(service.submit((Runnable) () -> count++));
        });

        for (Future<?> f : results){
            System.out.println(f.get());
        }
    }
}
