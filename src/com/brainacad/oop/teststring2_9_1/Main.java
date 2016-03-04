package com.brainacad.oop.teststring2_9_1;

/**
 * Created by m18 on 04.03.2016.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static char[] uniqueChars(String s) {
        StringBuilder stringForArr = new StringBuilder();
        //Про
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i + 1).indexOf(s.charAt(i)) < 0) {
                stringForArr.append(s.charAt(i));
            }
        }
        return stringForArr.toString().toCharArray();
    }
}
