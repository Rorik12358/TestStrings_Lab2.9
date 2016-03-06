package com.brainacad.oop.teststring2_9_1;

/**
 * Created by m18 on 02.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 8));
        // Тустируем 2 варианта
        String newString = reverseString("abcds");
        System.out.println(newString);
        String newString1 = reverseString1("abcdef");
        System.out.println(newString1);
        //Выводим начатую строку в обратном порядке
        String solution = reverseString(myStr);
        System.out.println(solution);
    }

    // first solution
    static String reverseString(String input) {
        int len = input.length();
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            arr[len - (i + 1)] = input.charAt(i);
        }
        return new String(arr);
    }

    //second solution:
    static String reverseString1(String input) {
        int len = input.length() - 1;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= len; i++) {
            output.append(input.charAt(len - i));
        }
        return output.toString();
    }
}

