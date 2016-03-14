package com.brainacad.oop.teststring2_9_3;

import java.util.Arrays;

/**
 * Created by m18 on 04.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Проверяю работу метода
        System.out.println(uniqueChars("agdgash"));

        System.out.println(Arrays.toString(uniqueChars("Using methods of class String")));
    }

    public static char[] uniqueChars(String s) {
        // используем StringBuilder, что бы не перегружать память (для цыклов стринги лучше не использовать)
        StringBuilder stringForArr = new StringBuilder();
        //Проверяеем есть ли еще один символ в строке как і-тый символ
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                //используем toLowerCase метод ,что бы не зависить от регистра
                if (s.toLowerCase().substring(i + 1).indexOf(s.toLowerCase().charAt(i)) < 0) { //bad decision. A lot of memory usage. Not clear logic.
                    stringForArr.append(s.toLowerCase().charAt(i));                           //Try to use more simple way
                }
            } else {
                if (s.toLowerCase().substring(i + 1).indexOf(s.toLowerCase().charAt(i)) < 0 && s.toLowerCase().substring(0, i).indexOf(s.toLowerCase().charAt(i)) < 0) {
                    stringForArr.append(s.charAt(i));
                }
            }
        }
        return stringForArr.toString().toCharArray();
    }
}
