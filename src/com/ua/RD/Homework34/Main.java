package com.ua.RD.Homework34;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<String>> callableList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < new Random().nextInt(10, 100); i++) {
            callableList.add(new RandomHWCallable());
        }

        List<Future<String>> futuresList = executorService.invokeAll(callableList);

        for (Future<String> future : futuresList) {
            System.out.println(future.get());
        }

        executorService.shutdown();

    }


}
