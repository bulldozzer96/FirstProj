package com.ua.RD.lesson34;

import java.util.Random;

public class RestService {
    public String getEntity(int id) throws InterruptedException {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
        }
        return "Entity" + id;
    }
}
