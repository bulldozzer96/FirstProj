package com.ua.RD.lesson9;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        //Arrays.copyOf() передавання масиву, з якого копіювати та довжина

// String s = "hello";
// s.length();


//        StringBuilder sb = new StringBuilder("hello world"); //через new
//        StringBuilder sb3 = new StringBuilder("hello world");
////        System.out.println(sb);
////        sb.append("q");
////        sb.append("w");
////        sb.append("r");
////        sb.append("t");
////        System.out.println(sb); //використовує менше ресурсів та швидше працює через стрінг білдер
//
////        sb.reverse();
////        System.out.println(sb);
////        String reservedS = reverse("");
//        String reservedS = reverseSbNull(null); //стрінг має НУЛЛ за замовчуванням, але примітиви не можуть.
//        System.out.println(reservedS);


//        int a = -10;
//        if (a > 0) {
//            System.out.println(a + " > 0");
//        } else {
//            System.out.println(a + " < 0");
//        }
//
//
//        String ifResult = a>0?a + " > 0":a + " < 0"; //тернарний оператор
//        var ifResultBool = a>0?true:false; //тернарний оператор
//
//
//        System.out.println(ifResult);
//        System.out.println(ifResultBool);

        int a = 10;
        int b = -10;
        int c = 0;
        boolean cIs = c == 0; //ctr+alt+v
        boolean aAndBCompare = a > 0 && b < 0;
        if (aAndBCompare || cIs){
            System.out.println(true);
        }




    }

//    static String reverse(String original) {
//        String reversed = ""; //result
//
//        for (int i = original.length() - 1; i >= 0;i--) {
//            reversed += original.charAt(i);
//            System.out.println(reversed);
//        }
//        return reversed;
//    }

//    static String reverseSB(String original) {
//
//        StringBuilder sb2 = new StringBuilder(original);
//
//        for (int i = original.length() - 1; i >= 0; i--) {
//            sb2.append(original.charAt(i));
//
//        }
//        return sb2.toString();
//    }
//
//    static String reverseSbNull(String original) {
//        if (original == null) {
//            return "помилка";  //краще додавати додаткові перевірки
//        }
//
//        StringBuilder sb3 = new StringBuilder(original);
//
//        for (int i = original.length() - 1; i >= 0; i--) {
//            sb3.append(original.charAt(i));
//
//        }
//        return sb3.toString();
//    }
}





