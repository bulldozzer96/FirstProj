package com.ua.RD.lesson32;

public class EggThread extends Thread{

    private void Chicken(){

    }
    public void run() {
        try{
            for(int i = 0; i < 10; i++) {
                System.out.println("Egg first");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }

        public void setChicken(){

        }
    }

