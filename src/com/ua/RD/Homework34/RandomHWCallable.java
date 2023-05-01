package com.ua.RD.Homework34;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomHWCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int generateNumber = new Random().nextInt(1, 51);

        return /*Thread.currentThread().getName() + " " +*/ generateNumber;
    }


}
