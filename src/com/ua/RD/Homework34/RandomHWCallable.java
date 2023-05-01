package com.ua.RD.Homework34;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomHWCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int generateNumber = new Random().nextInt(1, 51);

        return Thread.currentThread().getName() + " " + generateNumber;
    }


}
