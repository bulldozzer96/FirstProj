package com.ua.RD.lesson10;


import com.ua.RD.lesson10.service.PaintService;

public class Main {
    public static void main(String[] args) {

        // Car prius = new Car();
        Car prius = new Car("Prius", "Blue", 2012, 250);
        //prius.model = ;
        //prius.setModel("Prius");
        // prius.color = "Red";
        //prius.setColor("Red");
        //prius.setYear(2011);
        // prius.year = 2011;
        //prius.setHp(200);
        // prius.hp = 200;

        System.out.println(prius);
        PaintService paintService = new PaintService();


        paintService.paint(prius, "Green");

        System.out.println(prius);


//        prius.color = "Green";//color change
//        prius.drive();
//        prius.stop();
//        prius.park();
//        prius.sound();
//
//        Car audi = new Car();
//        audi.model = "AUDI";
//        audi.color = "Red";
//        audi.year = 2011;
//        audi.hp = 200;
//
//        audi.drive();
//
//
//        Dog dog = new Dog();
//        dog.name = "Bob";
//        dog.bark();
//
//
//        System.out.println(prius);//toString
//        System.out.println(audi);//toString
//        System.out.println(prius.color);//color prius
//        System.out.println(dog);//не переопреділив toString
//
//
//
//

    }
}
