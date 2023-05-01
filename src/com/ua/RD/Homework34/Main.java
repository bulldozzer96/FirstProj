package com.ua.RD.Homework34;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> callableBaseList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < new Random().nextInt(10, 100); i++) {
            callableBaseList.add(new RandomHWCallable());
        }

        List<Future<Integer>> callableOutputList = executorService.invokeAll(callableBaseList);

        for (Future<Integer> future : callableOutputList) {
            System.out.println(future.get());
        }

        executorService.shutdown();

    }


}
