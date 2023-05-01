package com.ua.RD.lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class TestCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int delay = new Random().nextInt(1000);
        Thread.sleep(delay);
        return String.valueOf(delay);
    }
}
