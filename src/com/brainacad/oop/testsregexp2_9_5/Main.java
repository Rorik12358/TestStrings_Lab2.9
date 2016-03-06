package com.brainacad.oop.testsregexp2_9_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by R2-D2 on 06.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String name : names) {
            if (checkPersonWithRegExp(name)) System.out.println(name + " - is a name");
            else System.out.println(name + " - is not a name");
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        String checkingString = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(checkingString);
        Matcher mathPattern = pattern.matcher(userNameString);
        return mathPattern.matches();
    }
}
