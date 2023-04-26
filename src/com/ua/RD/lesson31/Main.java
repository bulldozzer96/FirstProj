package com.ua.RD.lesson31;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

//        Field fields[] = Test.class.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//        Method methods[] = Test.class.getDeclaredMethods();
//    for (Method method : methods) {
//        System.out.println(method.getName());
//    }


    Test t1 = new Test();
        try {
            Method testMethod = Test.class.getDeclaredMethod("getInfo", int.class);
            testMethod.setAccessible(true);
            String result = (String) testMethod.invoke(t1,88);
            System.out.println(result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
