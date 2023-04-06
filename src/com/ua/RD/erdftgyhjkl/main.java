package com.ua.RD.erdftgyhjkl;


import java.util.Arrays;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        String[] array = new String[]{"floawer","floa", "floaw", "floaight", "floag", "floaod", "floauid", "floay"};
        Arrays.sort(array);
        int end = Math.min(array[0].length(), array[array.length - 1].length());
        int count = 0;
//        int base = 0;
//        int base1 = 1;

//            if ((array[0].charAt(count) == array[array.length - 1].charAt(count))) {
//                while (count < end
//                && array[base].charAt(count) == array[array.length - 1].charAt(count))
//            count++;
//            } else if (array[base].charAt(count) != array[array.length - 1].charAt(count)) {
//
//                while (count < end && base1 < array.length - 1)
//
//                    base1++;
//                base++;
//                count++;
//            }
        while (count < end
                && array[0].toLowerCase().charAt(count) == array[array.length - 1].toLowerCase().charAt(count))
            count++;



        String nullInput = array[count].substring(0, count);//пока только первый
        if (nullInput == "")
            nullInput = "No prefix";

        System.out.println(nullInput);
        //System.nullInput.println(Arrays.stream(array).toList());


    }
}



