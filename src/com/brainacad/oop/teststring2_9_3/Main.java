package com.brainacad.oop.teststring2_9_3;

import java.util.Arrays;

/**
 * Created by m18 on 04.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Проверяю работу метода
        System.out.println(uniqueChars("ssgppk"));

        System.out.println(Arrays.toString(uniqueChars("Using methods of class String")));
    }

    public static char[] uniqueChars(String input) {
        char[] chrs = input.toCharArray();
        char[] forSolution = new char[input.length()];
        int index = 0;
        for (char c : chrs) {
            int coinsedence = 0;
            for (char ch : chrs) {
                if (c == ch) {
                    coinsedence++;
                }
            }
            if (coinsedence == 1) {
                forSolution[index] = c;
                index++;
            }
        }
        return Arrays.copyOfRange(forSolution, 0, index);
    }


}
