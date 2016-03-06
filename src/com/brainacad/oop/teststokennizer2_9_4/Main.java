package com.brainacad.oop.teststokennizer2_9_4;

import java.util.StringTokenizer;

/**
 * Created by R2-D2 on 05.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String inputString = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer stringTokenizer = new StringTokenizer(inputString, ", .");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
